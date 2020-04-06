package test.makemsg;

import javax.sql.DataSource;

import com.playmore.database.datasource.Bonecp;
import com.playmore.servlet.util.GetPath;

import generator.Generator;

public class MakeUserCenterCenter {

	public static int serverId = 1;
	
	public static void main(String[] str){
		
		try {
//			MutiDBProvider.getDefault().addDaoSupport(Integer.valueOf(serverId),new Bonecp("usercenter.properties"));
//			IDFactory.getDefault().createIDGenerator(IDGeneratorType.SingleDBIDGenerator, serverId);
//			DataSource dataSource = MutiDBProvider.getDefault().getDataSource(serverId);
			DataSource dataSource = new Bonecp("usercenter.properties").getDataSource();
			// base model 所使用的包名
			String baseModelPackageName = "com.playmore.dbobject.usercenter";
			// base model 文件保存路径
			String baseModelOutputDir = GetPath.getLocalPath() + "/src/com/playmore/dbobject/usercenter/";
			System.out.println("baseModelOutputDir="+baseModelOutputDir);
			
			// 创建生成器
			Generator gernerator = new Generator(dataSource, baseModelPackageName, 
					baseModelOutputDir);
			// 添加不需要生成的表名
//			gernerator.addExcludedTable("adv");
			gernerator.setDbType("DbType.USER_CENTER");
			// 生成
			gernerator.generate();
			
//			MakeMessage.main(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
