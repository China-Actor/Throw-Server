package test.makemsg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeAnalysatorCollectionDelete   implements ICodeAnalysator{

		private String targetPojo;
		
		private int leftBraceCount = 0;
		
		private int rightBraceCount = 0;
		
		private int lineNum = 0;
		
		private String javaName;
		
		private String classHandler = "";
		
		private boolean isFound = false;
		
		private String filePath = "";
		
		public void setFilePath(String path){
			this.filePath = path;
		}
		
		private void reset(){
			isFound = false;
			classHandler = "";
			rightBraceCount = 0;
			leftBraceCount = 0;
		}
		
		public void setJavaName(String name){
			this.javaName = name;
		}
		
		public void setTargetPojo(String str){
			targetPojo = str;
		}
		
		public void analysis(String line){
			lineNum++;
			line = line.trim();
			if(isContainIgnore(line)){
				reset();
				return;
			}
			if(line.startsWith("//"))return;
			
			if(line.contains("{")){
				leftBraceCount ++;
			}
			if(line.contains("}")){
				rightBraceCount ++;
			}
			if(rightBraceCount > leftBraceCount){
				if(isFound){
					System.out.println("file:"+filePath+" line:"+lineNum+" not found "+ targetPojo + "DBQueue.getDefault().delete(" + classHandler + ")");
				}
				reset();
				return;
			}
			if(classHandler!=null && !"".equals(classHandler)
					&& isReNew(line)){
				if(!isFound){ 
					reset();
					return;
				}else{
					System.out.println("file:"+filePath+" line:"+lineNum+
							" 出错！还未调用: "+ targetPojo + "DBQueue.getDefault().delete(" + classHandler + ")");
					reset();
					return;
				}
			}
			
			if(isFound){
				boolean isContainDBQueueDelete = isContainDBQueueDelete(line);
				if(isContainDBQueueDelete){
					reset();
				}
				return;
			}
			
			if(!isFound && classHandler !=null && !"".equals(classHandler)
					&& isContainRemove(line)){
				isFound = true;
			}
			
			String tmp = getClassHandler(line);
			if(tmp==null||"".equals(tmp)){
				tmp = getClassHandlerByParam(line);
			}
			if(tmp!=null&&!"".equals(tmp)){
				if(isFound){
					System.out.println("file:"+filePath+" line:"+lineNum+
							" 出错！还未调用: "+ targetPojo + "DBQueue.getDefault().delete(" + classHandler + ")");
				}
				reset();
				classHandler = tmp;
				boolean isChar = isChar(tmp);
				if(!isChar){
					System.out.println("file:"+filePath+" targetPojo:"+targetPojo+" lineNum:"+lineNum+" is not char!!"+tmp);
				}
			}
			
		}
		
		private boolean isContainDBQueueDelete(String line){
			String regex = ".*" + targetPojo + "DBQueue.getDefault\\(\\).delete\\(";
			try{
				Pattern pat = Pattern.compile(regex);
				Matcher matcher = pat.matcher(line);
				return matcher.find();
			}catch(Exception e){
				System.out.println("javaNam:"+javaName+" targetPojo:"+targetPojo+" lineNum:"+lineNum+" line:"+line);
			}  
		    return false;
		}
		
		private boolean isContainIgnore(String line){
			String regex = "//ignore.*" + targetPojo + "DBQueue.getDefault\\(\\).delete\\(";
			Pattern pat = Pattern.compile(regex);  
		    Matcher matcher = pat.matcher(line);   
		    return matcher.find();
		}
		
		private boolean isContainRemove(String line){
			String regex = "^(" + classHandler + ")\\.remove\\(";
			try{
				Pattern pat = Pattern.compile(regex);
				Matcher matcher = pat.matcher(line);
				return matcher.find();
			}catch(Exception e){
				System.out.println("regex:"+regex+" javaNam:"+javaName+" targetPojo:"+targetPojo+" lineNum:"+lineNum+" line:"+line);
			}  
		    return false;
		}
		
		private String getClassHandlerByParam(String line){
			String regex = "\\(.+<.*" + targetPojo + "> +\\w+ *[,\\)]";
			Pattern pat = Pattern.compile(regex);  
		    Matcher matcher = pat.matcher(line);
		    if(matcher.find()){
		    	String tmp = line.substring(matcher.start(), matcher.end());
		    	tmp = tmp.trim();
		    	tmp = tmp.substring(1, tmp.length()-1).trim();
		    	do{
			    	if(!tmp.contains(" "))return tmp;
			    	int spacePos = tmp.indexOf(" ");
			    	tmp = tmp.substring(spacePos).trim();
		    	}while(tmp.contains(" "));
		    	return tmp.trim();
		    }
		    return "";
		}
		
		private String getClassHandler(String line){
			String regex = ".+<.*" + targetPojo + "> +\\w+ *=";
			Pattern pat = Pattern.compile(regex);  
		    Matcher matcher = pat.matcher(line);
		    if(matcher.find()){
		    	String tmp = line.substring(matcher.start(), matcher.end());
		    	int endPos = tmp.indexOf("=");
		    	tmp = tmp.substring(0, endPos).trim();
		    	if(!tmp.contains(" "))return tmp;
		    	int startPos = tmp.lastIndexOf(" ");
		    	try{
		    		tmp = tmp.substring(startPos);
		    	}catch (Exception e){
		    		System.out.println("Exception:"+tmp);
//		    		e.printStackTrace();
		    	}
		    	tmp = tmp.trim();
		    	return tmp;
		    }
		    return "";
		}
		
		private boolean isChar(String tmp){
			String regex = "^[A-Za-z0-9]+$";
			Pattern pat = Pattern.compile(regex);
			Matcher matcher = pat.matcher(tmp);
			return matcher.find();
		}
	
		private boolean isReNew(String line){
			String regex = "^(" + classHandler + ") .*=.*";
			try{
				Pattern pat = Pattern.compile(regex);
				Matcher matcher = pat.matcher(line);
				return matcher.find();
			}catch(Exception e){
				System.out.println("javaNam:"+javaName+" targetPojo:"+targetPojo+" lineNum:"+lineNum+" line:"+line);
			}
		    return false;
		}
}
