package test.makemsg;

import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.datasource.Bonecp;
import com.playmore.database.idgenerator.IDFactory;
import com.playmore.database.idgenerator.IDGeneratorType;
import com.playmore.servlet.util.GetPath;
import com.playmore.xysword.enumtype.DbType;

public class MakeManagerType {

	public static void main(String[] str) {

		try {
			SingleDBProvider.getDefault().addDaoSupport(DbType.STATIC, new Bonecp("static.properties"));
			IDFactory.getDefault().createIDGenerator(IDGeneratorType.DefaultDBIDGenerator, 1);
			
			// base model 所使用的包名
			String baseModelPackageName = "com.playmore.dbobject.staticdb.type";
			// base model 文件保存路径
			String baseModelOutputDir = GetPath.getLocalPath() + "/src/com/playmore/dbobject/staticdb/type";
			System.out.println("baseModelOutputDir="+baseModelOutputDir);
			
			ManagerTypeGenerator generator = new ManagerTypeGenerator(baseModelPackageName, baseModelOutputDir);
			generator.generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
