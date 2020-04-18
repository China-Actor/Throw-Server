package test.makemsg;

import javax.sql.DataSource;

import com.playmore.database.datasource.Bonecp;
import com.playmore.servlet.util.GetPath;

import generator.Generator;

public class MakePayCenter {

	public static int serverId = 1;
	
	public static void main(String[] str){
		
		try {
//			MutiDBProvider.getDefault().addDaoSupport(Integer.valueOf(serverId),new Bonecp("paycenter.properties"));
//			IDFactory.getDefault().createIDGenerator(IDGeneratorType.SingleDBIDGenerator, serverId);
//			DataSource dataSource = MutiDBProvider.getDefault().getDataSource(serverId);
			DataSource dataSource = new Bonecp("paycenter.properties").getDataSource();
			// base model 所使用的包名
			String baseModelPackageName = "com.playmore.dbobject.paycenter";
			// base model 文件保存路径
			String baseModelOutputDir = GetPath.getLocalPath() + "/src/com/playmore/dbobject/paycenter/";
			System.out.println("baseModelOutputDir="+baseModelOutputDir);
			
			// 创建生成器
			Generator gernerator = new Generator(dataSource, baseModelPackageName, 
					baseModelOutputDir);
			// 添加不需要生成的表名
			gernerator.addExcludedTable(new String[] {"adv"});
			// 设置是否在 Model 中生成 dao 对象
//			gernerator.setGenerateDaoInModel(true);
			// 设置是否生成字典文件
//			gernerator.setGenerateDataDictionary(false);
			// 设置需要被移除的表名前缀用于生成modelName。例如表名 "osc_user"，移除前缀 "osc_"后生成的model名为 "User"而非 OscUser
//			gernerator.setRemovedTableNamePrefixes("t_");
			gernerator.setDbType("DbType.PAY");
			// 生成
			gernerator.generate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
