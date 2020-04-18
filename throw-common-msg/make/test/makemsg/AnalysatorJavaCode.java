/**
 * Copyright (c) 2011-2016, Zhongmingyu (zhongmingyu@qq.com).
 *
 * 代码检测器
 * 目的：分析代码是否存在忘记入库的时候
 * 前提：所有需要入库的对象都必须在同一个结构体内入库。
 * 原理：遍历所有代码的所有方法，在方法内遍历每行。找到游戏对象就记录。
 * 		若是new的对象则后面必须要有dbqueue的insert方法，不是new的但如果用到了set方法则必须后面要有update方法。
 * 		有出现过的对象都必须要有对应的dbqueue。
 */

package test.makemsg;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnalysatorJavaCode {

//	public static String filePath = "D:\\workspace\\TestThread\\test";
//	private static String pojoNamePath = "D:\\workspace\\TestThread\\tmp";
	public static String filePath = "F:\\developer\\xuanyuansword\\src\\";
	private static String pojoNamePath = "F:\\developer\\xyjmsg\\src\\com\\playmore\\dbobject\\gameserver";
	private static Set<String> pojoNameList = new HashSet<String>();
	
	public static void main(String[] args){
		String filePath = (args!=null&&args.length>=1)?args[0]:AnalysatorJavaCode.filePath;
		if(args!=null&&args.length>=2){
			pojoNamePath = args[1];
		}
		initPojoNameList();
		for(String pojoName : pojoNameList){
			readPath(new File(filePath), pojoName);
		}
	}
	
	private static void initPojoNameList(){
		File path = new File(pojoNamePath);
		String[] fs = path.list();
		for(int i=0; i<fs.length; i++){
			File file = new File(path.getAbsolutePath()+"\\"+fs[i]);
			if(file.isDirectory())continue;
			if(!file.getName().endsWith(".java"))continue;
			String pojoName = fs[i].replace(".java", "");
			pojoNameList.add(pojoName);
		}
	}
	
	public static void readPath(File path, String pojoName){
		String[] fs = path.list();
		for(int i=0; i<fs.length; i++){
			  File file = new File(path.getAbsolutePath()+"\\"+fs[i]);
			  if(file.isDirectory()){
				  readPath(file, pojoName);
				  continue;
			  }
			  if(!file.getName().endsWith(".java"))continue;
			  readJavaFile(file, pojoName);
		}
	}
	
	public static void readJavaFile(File file, String pojoName){
		BufferedReader bf = null;
		try {
			InputStreamReader isr;
			isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
			bf = new BufferedReader(isr);
			String s = null;
			List<ICodeAnalysator> analysatorList = new ArrayList<ICodeAnalysator>();
			CodeAnalysatorUpdate analysator = new CodeAnalysatorUpdate();
			analysator.setTargetPojo(pojoName);
			analysator.setJavaName(file.getName());
			analysator.setFilePath(file.getAbsolutePath());
			analysatorList.add(analysator);
			CodeAnalysatorInsert analysatorNew = new CodeAnalysatorInsert();
			analysatorNew.setTargetPojo(pojoName);
			analysatorNew.setJavaName(file.getName());
			analysatorNew.setFilePath(file.getAbsolutePath());
			analysatorList.add(analysatorNew);
			CodeAnalysatorDelete analysatorDel = new CodeAnalysatorDelete();
			analysatorDel.setTargetPojo(pojoName);
			analysatorDel.setJavaName(file.getName());
			analysatorDel.setFilePath(file.getAbsolutePath());
//			analysatorList.add(analysatorDel);
			CodeAnalysatorCollectionDelete analysatorDelColl = new CodeAnalysatorCollectionDelete();
			analysatorDelColl.setTargetPojo(pojoName);
			analysatorDelColl.setJavaName(file.getName());
			analysatorDelColl.setFilePath(file.getAbsolutePath());
			analysatorList.add(analysatorDelColl);
			try {
				while((s = bf.readLine())!=null){
					processLine(s, analysatorList);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}finally{
			try {
				if(bf!=null)bf.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void processLine(String line, List<ICodeAnalysator> analysatorList){
		for(ICodeAnalysator  analysator: analysatorList){
			analysator.analysis(line);
		}
	}
	
}
