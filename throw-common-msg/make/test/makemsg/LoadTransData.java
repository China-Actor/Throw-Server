package test.makemsg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoadTransData {

	
	public static void main(String[] args){
		System.out.println("Loading trans_pos data...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://"+args[0]+":"+args[1]+"/"+args[2]
			+"?autoReconnect=true&useUnicode=true&characterEncoding=UTF-8"
			+"&useServerPrepStmts=true&rewriteBatchedStatements=true&allowMultiQueries=true";
			Connection connect = DriverManager.getConnection(url,args[3],args[4]);
			
			// insert default 1
			Statement statement = connect.createStatement();
			String sql = "truncate table trans_pos_default";
			statement.executeUpdate(sql);
			sql = "select * from trans_pos_s";
			Statement statement1 = connect.createStatement();
			ResultSet result1 = statement1.executeQuery(sql);
			while(result1.next()){
				String defaultStr = result1.getString(5);
				String[] defaultStrs = defaultStr.split(",");
				for(String str : defaultStrs){
					String chapter = str.split("_")[0];
					String scene = str.split("_")[1];
					sql = "insert into trans_pos_default(`chapter`,`scene`,`pos`) values ('0','"+chapter+"','"+scene+"');";
					statement.executeUpdate(sql);
				}
			}
			result1.close();
			statement1.close();
			
			// insert default 2
			sql = "select a.id, b.birth_pos from chapter_s a,chapter_pos_s b where a.`unlock` = b.id";
			Statement statement2 = connect.createStatement();
			ResultSet result2 = statement2.executeQuery(sql);
			while(result2.next()){
				String birth = result2.getString(2);
				String chapter = birth.split("_")[0];
				String scene = birth.split("_")[1];
				sql = "insert into trans_pos_default(`chapter`,`scene`,`pos`) values ('"+result2.getInt(1)+"','"+chapter+"','"+scene+"');";
				statement.executeUpdate(sql);
			}
			result2.close();
			statement2.close();
			
			// insert point
			sql = "truncate table trans_pos_point";
			statement.executeUpdate(sql);
			sql = "select b.id, a.trans_pos from chapter_pos_s a, chapter_s b where a.id = b.`unlock`";
			Statement statement3 = connect.createStatement();
			ResultSet result3 = statement3.executeQuery(sql);
			while(result3.next()){
				String[] trans = result3.getString(2).split(",");
				for(String str : trans){
					if("0".equals(str))continue;
					String oldScene = str.split("_")[0];
					String oldPos = str.split("_")[1];
					String newScene = str.split("_")[2];
					String newPos = str.split("_")[3];
					sql = "insert into trans_pos_point(`chapter`,`old_scene`,`old_pos`,`new_scene`,`new_pos`) values ('"
							+result3.getInt(1)+"','"+oldScene+"','"+oldPos+"','"+newScene+"','"+newPos+"');";
					statement.executeUpdate(sql);
				}
			}
			result3.close();
			statement3.close();
			
			// insert scene 1
			sql = "truncate table trans_pos_scene";
			statement.executeUpdate(sql);
			sql = "select chapter_id, scene_type, pos from world_map_s";
			Statement statement4 = connect.createStatement();
			ResultSet result4 = statement4.executeQuery(sql);
			while(result4.next()){
				if("0".equals(result4.getString(1)))continue;
				String[] chapters = result4.getString(1).split("_");
				for(String chapter : chapters){
					sql = "insert into trans_pos_scene(`old_chapter`,`old_scene`,`new_scene`,`new_pos`) values ('"
							+chapter+"','0','"+result4.getInt(2)+"','"+result4.getInt(3)+"');";
					statement.executeUpdate(sql);
				}
			}
			result4.close();
			statement4.close();
			
			// insert scene 2
			sql = "select trans_pos from trans_pos_s ";
			Statement statement5 = connect.createStatement();
			ResultSet result5 = statement5.executeQuery(sql);
			while(result5.next()){
				if(result5.getString(1) == null || "".equals(result5.getString(1)))continue;
				String[] trans = result5.getString(1).split(",");
				for(String str : trans){
					String oldScene = str.split("_")[0];
					String newScene = str.split("_")[2];
					String newPos = str.split("_")[3];
					sql = "insert into trans_pos_scene(`old_chapter`,`old_scene`,`new_scene`,`new_pos`) values ('0','"
							+oldScene+"','"+newScene+"','"+newPos+"');";
					statement.executeUpdate(sql);
				}
			}
			result5.close();
			statement5.close();
			connect.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
