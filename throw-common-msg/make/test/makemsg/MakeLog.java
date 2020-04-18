package test.makemsg;

import javax.sql.DataSource;

import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.datasource.Bonecp;
import com.playmore.database.idgenerator.IDFactory;
import com.playmore.database.idgenerator.IDGeneratorType;
import com.playmore.servlet.util.GetPath;
import com.playmore.xysword.enumtype.DbType;

import generator.Generator;

public class MakeLog {

	public static int serverId = 1;
	
	public static void main(String[] str){
		
		try {
			SingleDBProvider.getDefault().addDaoSupport(DbType.LOG, new Bonecp("log.properties"));
			IDFactory.getDefault().createIDGenerator(IDGeneratorType.DefaultDBIDGenerator, serverId);
		
			DataSource dataSource = SingleDBProvider.getDefault().getDataSource(DbType.LOG);
			
			// base model 所使用的包名
			String baseModelPackageName = "com.playmore.dbobject.log";
			// base model 文件保存路径
			String baseModelOutputDir = GetPath.getLocalPath() + "/src/com/playmore/dbobject/log/";
			System.out.println("baseModelOutputDir="+baseModelOutputDir);
			
			// 创建生成器
			Generator gernerator = new Generator(dataSource, baseModelPackageName, 
					baseModelOutputDir);
			gernerator.setGenManager(false);
			gernerator.setGenQueue(false);
			gernerator.setIsMutilDb(true);
			gernerator.setGenLogger(true);
			gernerator.setDbType("DbType.LOG");
			// 生成
			gernerator.generate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
