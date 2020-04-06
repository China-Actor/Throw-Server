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

import javax.sql.DataSource;

import com.playmore.database.CacheAnnotation;
import com.playmore.database.EnumFieldName;
import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.datasource.Bonecp;
import com.playmore.database.generator.kit.StrKit;
import com.playmore.dbobject.staticdb.ErrorCodeS;
import com.playmore.dbobject.staticdb.manager.ErrorCodeSManager;
import com.playmore.util.ClassUtil;
import com.playmore.util.FileUtil;
import com.playmore.xysword.enumtype.DbType;

/**
 * Base model 生成器
 */
public class ManagerTypeGenerator {
	
	private String className = "ManagerType";
	
	protected String packageTemplate =
		"package %s;%n%n";
	protected String importTemplate =
		"import com.playmore.database.CacheAnnotation;%n"+
		"import com.playmore.database.EnumFieldName;%n";
	
	protected String classDefineTemplate =
		"/**%n" +
		" * Do not touch! Close it Now! %n" +
		" */%n" +
		"@SuppressWarnings(\"serial\")%n" +
		"public interface "+className+" {%n%n";
	
	protected String attributeTemplate =
			"\t@CacheAnnotation(isSingle=false, pojoClass=\"%s\")%n" +
			"\t@EnumFieldName(annotation=\"%s\")%n" +
			"\tpublic static final String %s = \"%s\";%n%n"
			;
	
	protected String activityTemplate =
			"\t@CacheAnnotation(isSingle=false, pojoClass=\"com.playmore.dbobject.usercenter.Activity\")%n" +
			"\t@EnumFieldName(annotation=\"Activity\")%n" +
			"\tpublic static final String activity = \"activity\";%n%n"
			;

	protected String activityItemTemplate =
			"\t@CacheAnnotation(isSingle=false, pojoClass=\"com.playmore.dbobject.usercenter.Activity\")%n" +
			"\t@EnumFieldName(annotation=\"ActivityItem\")%n" +
			"\tpublic static final String activityItem = \"activityItem\";%n%n"
			;

	protected String activityServerTemplate =
			"\t@CacheAnnotation(isSingle=false, pojoClass=\"com.playmore.dbobject.usercenter.ActivityServer\")%n" +
			"\t@EnumFieldName(annotation=\"ActivityServer\")%n" +
			"\tpublic static final String activityServer = \"activityServer\";%n%n"
			;
	
	protected String baseModelPackageName;
	protected String baseModelOutputDir;
	
	public ManagerTypeGenerator(String baseModelPackageName, String baseModelOutputDir) {
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
		ret.append(String.format(activityTemplate));
		ret.append(String.format(activityItemTemplate));
		ret.append(String.format(activityServerTemplate));
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
		SingleDBProvider.getDefault().addDaoSupport(DbType.STATIC, new Bonecp("static.properties"));
		DataSource dataSource = SingleDBProvider.getDefault().getDataSource(DbType.STATIC);
		List<Class<?>> classList = ClassUtil.getClasses("com.playmore.dbobject.staticdb.manager");
		for(Class cls : classList){
			String clsName = cls.getName();
			String pojoName = clsName.replace("Manager", "");
			String pojoShortName = pojoName.replace("com.playmore.dbobject.staticdb.manager.", "");
			pojoName = pojoName.replace("com.playmore.dbobject.staticdb.manager.", "com.playmore.dbobject.staticdb.");
			String clsShortName =  clsName.replace("com.playmore.dbobject.staticdb.manager.", "");
			ret.append(String.format(attributeTemplate, pojoName, pojoShortName, clsShortName, clsName));
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






