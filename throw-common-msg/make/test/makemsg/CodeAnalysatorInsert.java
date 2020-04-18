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

public class CodeAnalysatorInsert  implements ICodeAnalysator{
	
	//要查找的目标对象类名 不带包名 每次只找1个 简化难度
	private String targetPojo;
	
	//左边大括号叠加次数
	private int leftBraceCount = 0;
	
	//右边大括号叠加次数
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
		String tmp = getClassHandler(line);
		if(tmp!=null&&!"".equals(tmp)){
			if(isFound){
				System.out.println("file:"+filePath +" line:"+lineNum+
						" 出错！还未调用: "+ targetPojo + "DBQueue.insert(" + classHandler + ")");
			}
			reset();
			classHandler = tmp;
			isFound = true;
		}
		if(!isFound)return;
		if(line.contains("{")){
			leftBraceCount ++;
		}
		if(line.contains("}")){
			rightBraceCount ++;
		}
		boolean isContainDBQueueInsert = isContainDBQueueInsert(line);
		if(isContainDBQueueInsert){
			reset();
			return;
		}
		if(rightBraceCount > leftBraceCount){
			//报错!!
			System.out.println("file:"+filePath+" line:"+lineNum+" not found "+ targetPojo + "DBQueue.insert(" + classHandler + ")");
			reset();
		}
		
	}
	
	private boolean isContainDBQueueInsert(String line){
		String regex = ".*" + targetPojo + "DBQueue.*.insert\\(.*";
		Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(line);   
	    return matcher.find();
	}
	
	private boolean isContainIgnore(String line){
		String regex = "//ignore.*" + targetPojo + "DBQueue.*.insert\\(.*";
		Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(line);   
	    return matcher.find();
	}
	
	private String getClassHandler(String line){
		String regex = ".*= *new +" + targetPojo +"\\(\\);";
		Pattern pat = Pattern.compile(regex);  
	    Matcher matcher = pat.matcher(line);
	    if(matcher.find()){
	    	String tmp = line.substring(matcher.start(), matcher.end());
	    	int equalPos = tmp.indexOf("=");
	    	tmp = tmp.substring(0, equalPos).trim();
	    	if(!tmp.contains(" "))return tmp;
	    	int spacePos = tmp.indexOf(" ");
	    	tmp = tmp.substring(spacePos);
	    	return tmp.trim();
	    }
	    return "";
	}
}
