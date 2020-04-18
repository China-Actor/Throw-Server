package test.makemsg;

import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.datasource.Bonecp;
import com.playmore.database.idgenerator.IDFactory;
import com.playmore.database.idgenerator.IDGeneratorType;
import com.playmore.servlet.util.GetPath;
import com.playmore.xysword.enumtype.DbType;

public class MakeMessage {

	public static void main(String[] str) {

		try {
			SingleDBProvider.getDefault().addDaoSupport(DbType.USER_CENTER, new Bonecp("usercenter.properties"));
			IDFactory.getDefault().createIDGenerator(IDGeneratorType.DefaultDBIDGenerator, 1);
			
			// base model 所使用的包名
			String baseModelPackageName = "com.playmore.dbobject.usercenter.message";
			// base model 文件保存路径
			String baseModelOutputDir = GetPath.getLocalPath() + "/src/com/playmore/dbobject/usercenter/message";
			System.out.println("baseModelOutputDir="+baseModelOutputDir);
			
			MessageGenerator generator = new MessageGenerator(baseModelPackageName, baseModelOutputDir);
			generator.generate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
