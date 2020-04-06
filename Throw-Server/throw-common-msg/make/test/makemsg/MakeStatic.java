package test.makemsg;

import javax.sql.DataSource;

import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.datasource.Bonecp;
import com.playmore.database.idgenerator.IDFactory;
import com.playmore.database.idgenerator.IDGeneratorType;
import com.playmore.servlet.util.GetPath;
import com.playmore.xysword.enumtype.DbType;

import generator.Generator;

public class MakeStatic {

	public static int serverId = 1;
	
	public static void main(String[] str){
		
		try {
			SingleDBProvider.getDefault().addDaoSupport(DbType.STATIC, new Bonecp("static.properties"));
			IDFactory.getDefault().createIDGenerator(IDGeneratorType.DefaultDBIDGenerator, serverId);
		
			DataSource dataSource = SingleDBProvider.getDefault().getDataSource(DbType.STATIC);
			
			// base model 所使用的包名
			String baseModelPackageName = "com.playmore.dbobject.staticdb";
			// base model 文件保存路径 main\java
			String baseModelOutputDir = GetPath.getLocalPath() + "/src/main/java/com/playmore/dbobject/staticdb/";
			System.out.println("baseModelOutputDir="+baseModelOutputDir);
			
			// 创建生成器
			Generator gernerator = new Generator(dataSource, baseModelPackageName, 
					baseModelOutputDir);
			gernerator.setGenManager(true);
//			gernerator.setSingleDbDaoSupport(true);
			gernerator.setDbType("DbType.STATIC");
			gernerator.setGenQueue(false);
			// 生成
			gernerator.generate();
			
//			MakeConstant.main(str);
//			MakeFunction.main(str);
//			MakeErrorCode.main(str);
			//MakeCmdCodeConstants.main(str);
			//MakeParams.main(str);
//			MakeMailTemplate.main(str);
//			MakeNotify.main(str);
//			MakeManagerType.main(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
