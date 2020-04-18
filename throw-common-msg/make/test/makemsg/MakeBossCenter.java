package test.makemsg;

import javax.sql.DataSource;

import com.playmore.database.datasource.Bonecp;
import com.playmore.servlet.util.GetPath;

import generator.Generator;
import generator.Generator.Filter;

public class MakeBossCenter {

	public static int serverId = 1;
	
	public static void main(String[] str){
		
		try {
//			MutiDBProvider.getDefault().addDaoSupport(Integer.valueOf(serverId),new Bonecp("boss.properties"));
//			IDFactory.getDefault().createIDGenerator(IDGeneratorType.SingleDBIDGenerator, serverId);
//			DataSource dataSource = MutiDBProvider.getDefault().getDataSource(serverId);
			DataSource dataSource = new Bonecp("boss.properties").getDataSource();
			// base model 所使用的包名
			String baseModelPackageName = "com.playmore.dbobject.boss";
			// base model 文件保存路径
			String baseModelOutputDir = GetPath.getLocalPath() + "/src/com/playmore/dbobject/boss/";
			System.out.println("baseModelOutputDir="+baseModelOutputDir);
			
			// 创建生成器
			Generator gernerator = new Generator(dataSource, baseModelPackageName, 
					baseModelOutputDir);
			// 添加不需要生成的表名
			gernerator.addExcludedTable(new String[] {"adv"});
			gernerator.setGenQueue(false);
			gernerator.addFilter(new Filter(){
				public boolean isFilter(String tableName) {
					return tableName.startsWith("QRTZ_");
				}
				
			});
			gernerator.setDbType("DbType.BOSS");
			// 生成
			gernerator.generate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
