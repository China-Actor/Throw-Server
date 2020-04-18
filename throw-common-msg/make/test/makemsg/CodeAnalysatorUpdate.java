/**
 * Copyright (c) 2011-2016, Zhongmingyu (zhongmingyu@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package test.makemsg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodeAnalysatorUpdate implements ICodeAnalysator{
	
	//要查找的目标对象类名 不带包名 每次只找1个 简化难度
	private String targetPojo;
	
	//左边大括号叠加次数
	private int leftBraceCount = 0;
	
	//右边大括号叠加次数
	private int rightBraceCount = 0;
	
	private int lineNum = 0;
	
	private String javaName;
	
	//类句柄 判断是否调用了其setter方法
	private String classHandler = "";
	
	//是否找到了setter调用
	private boolean isFound = false;
	
	private String filePath = "";
	
	public void setFilePath(String path){
		this.filePath = path;
	}
	
	public void setJavaName(String name){
		this.javaName = name;
	}
	
	public void setTargetPojo(String str){
		targetPojo = str;
	}
	
	private void reset(){
		isFound = false;
		classHandler = "";
		rightBraceCount = 0;
		leftBraceCount = 0;
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
				System.out.println("file:"+filePath+" line:"+lineNum+" not found "+ targetPojo + "DBQueue.update(" + classHandler + ")");
			}
			reset();
		}
		if(classHandler!=null && !"".equals(classHandler) && isReNew(line)){
			if(!isFound){ 
				reset();
				return;
			}else{
				System.out.println("file:"+filePath+" line:"+lineNum+
						" 出错！还未调用: "+ targetPojo + "DBQueue.update(" + classHandler + ")");
				reset();
				return;
			}
		}
		
		String tmp = getClassHandler(line);
		if(tmp==null||"".equals(tmp)){
			tmp = getClassHandlerByParam(line);
		}
		if(tmp!=null&&!"".equals(tmp)){
			if(isFound){
				System.out.println("file:"+filePath+" line:"+lineNum+
						" 出错！还未调用: "+ targetPojo + "DBQueue.update(" + classHandler + ")");
			}
			reset();
			classHandler = tmp;
		}
		if(classHandler==null||"".equals(classHandler))return;
		
		//准备分析setter 是否调用过 ，没有则return
		if(!isFound && isContainPojoSetter(line)){
			isFound = true;
		}
		if(!isFound)return;
		
		
		
		boolean isContainDBQueueUpdate = isContainDBQueueUpdate(line);
		if(isContainDBQueueUpdate){
			reset();
		}
	}
	
	private boolean isContainPojoSetter(String line){
		String regex = classHandler + "\\.set.*";
		try{
			Pattern pat = Pattern.compile(regex);  
		    Matcher matcher = pat.matcher(line);   
		    return matcher.find();
		}catch(Exception e){
			System.out.println("javaNam:"+javaName+" targetPojo:"+targetPojo+" classHandler:"+ classHandler +" lineNum:"+lineNum+" line:"+line);
		} 
		return false;
	}
	
	private boolean isContainDBQueueUpdate(String line){
		String regex = ".*" + targetPojo + "DBQueue.*.update\\(" + classHandler + "\\).*";
		Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(line);   
	    return matcher.find();
	}
	
	private boolean isContainIgnore(String line){
		String regex = "//ignore.*" + targetPojo + "DBQueue.*.update\\(" + classHandler + "\\).*";
		Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(line);   
	    return matcher.find();
	}
	
	private String getClassHandlerByParam(String line){
		String regex = "[,\\(] *" + targetPojo + " +\\w+ *[,\\)]";
		Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(line);
	    if(matcher.find()){
	    	String tmp = line.substring(matcher.start(), matcher.end());
	    	tmp = tmp.trim();
	    	tmp = tmp.substring(1, tmp.length()-1).trim();
	    	if(!tmp.contains(" "))return tmp;
	    	int spacePos = tmp.indexOf(" ");
	    	tmp = tmp.substring(spacePos);
	    	return tmp.trim();
	    }
	    return "";
	}
	
	private String getClassHandler(String line){
		String regex = ".*" + targetPojo + " .*=" +"(?!.*new)";
		Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(line);
	    if(matcher.find()){
	    	String tmp = line.substring(matcher.start(), matcher.end()).trim();
	    	tmp = tmp.replace("=", "");
	    	if(!tmp.contains(" "))return tmp;
	    	int spacePos = tmp.indexOf(" ");
	    	tmp = tmp.substring(spacePos);
	    	return tmp.trim();
	    }
	    return "";
	}
	
	//是否重新指向
	private boolean isReNew(String line){
		String regex = classHandler + " .*=(?!=).*";
		Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(line);
	    return matcher.find();
	}
}
