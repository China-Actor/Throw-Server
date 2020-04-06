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

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.playmore.database.generator.kit.StrKit;
import com.playmore.dbobject.staticdb.CmdCodeS;
import com.playmore.dbobject.staticdb.manager.CmdCodeSManager;
import com.playmore.util.FileUtil;

/**
 * Base model 生成器
 */
public class CmdCodeConstantsGenerator {
	
	private String className = "CmdCodeConstants";
	
	protected String packageTemplate =
		"package %s;%n%n";
	protected String importTemplate =
		"";
	
	protected String classDefineTemplate =
		"/**%n" +
		" * Do not touch! Close it Now! %n" +
		" */%n" +
		"@SuppressWarnings(\"serial\")%n" +
		"public interface "+className+" {%n%n";
	
	protected String attributeTemplate =
			"\t// %s  %s%n" +
			"\tpublic static short %s \t\t\t\t\t= \t\t%s;%n";
	
	
	protected String baseModelPackageName;
	protected String baseModelOutputDir;
	
	public CmdCodeConstantsGenerator(String baseModelPackageName, String baseModelOutputDir) {
		if (StrKit.isBlank(baseModelPackageName))
			throw new IllegalArgumentException("baseModelPackageName can not be blank.");
		if (baseModelPackageName.contains("/") || baseModelPackageName.contains("\\"))
			throw new IllegalArgumentException("baseModelPackageName error : " + baseModelPackageName);
		if (StrKit.isBlank(baseModelOutputDir))
			throw new IllegalArgumentException("baseModelOutputDir can not be blank.");
		
		this.baseModelPackageName = baseModelPackageName;
		this.baseModelOutputDir = baseModelOutputDir;
	}
	
	public void generate() {
		System.out.println("baseModelOutputDir="+baseModelOutputDir);
		System.out.println("begin delete all "+ baseModelOutputDir + " files");
		boolean isSuccess = FileUtil.deleteDirectory(baseModelOutputDir);
		System.out.println("begin delete "+(isSuccess?"success":"fail"));
		System.out.println("Generate base model ...");
		
		StringBuilder ret = new StringBuilder();
		genPackage(ret);
		genImport(ret);
		genClassDefine(ret);
		genAttribute(ret);
		ret.append(String.format("}%n"));
		try {
			wirtToFile(ret.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	protected void genPackage(StringBuilder ret) {
		ret.append(String.format(packageTemplate, baseModelPackageName));
	}
	
	protected void genImport(StringBuilder ret) {
		ret.append(String.format(importTemplate));
	}
	
	protected void genClassDefine(StringBuilder ret) {
		ret.append(String.format(classDefineTemplate));
	}
	
	protected void genAttribute(StringBuilder ret) {
		Collection<CmdCodeS> list = CmdCodeSManager.getDefault().values();
		List<CmdCodeS> temp = new ArrayList<CmdCodeS>();
		temp.addAll(list);
		Collections.sort(temp, new Comparator<CmdCodeS>() {
			public int compare(CmdCodeS o1, CmdCodeS o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
		for(CmdCodeS cmdCodeS : temp){
			Short cmd = Short.valueOf(cmdCodeS.getId().replace("0x", ""),16);
			String key = cmdCodeS.getC2s();
			if(key!=null&&!key.equals("")&&!key.toLowerCase().equals("null")){
				String comment = cmdCodeS.getC2sDesc();
				ret.append(String.format(attributeTemplate, comment, cmdCodeS.getId(), key, cmd));
			}
			
			key = cmdCodeS.getS2c();
			if(key!=null&&!key.equals("")&&!key.toLowerCase().equals("null")){
				String comment = cmdCodeS.getS2cDesc();
				ret.append(String.format(attributeTemplate, comment, cmdCodeS.getId(), key, cmd));
			}
		}
	}
	
	/**
	 * base model 覆盖写入
	 */
	protected void wirtToFile(String content) throws IOException {
		File dir = new File(baseModelOutputDir);
		if (!dir.exists())
			dir.mkdirs();
		
		String target = baseModelOutputDir + File.separator + className + ".java";
		FileWriter fw = new FileWriter(target);
		try {
			System.out.println("writeToFile:"+target);
			fw.write(content);
		}
		finally {
			fw.close();
		}
	}
}






