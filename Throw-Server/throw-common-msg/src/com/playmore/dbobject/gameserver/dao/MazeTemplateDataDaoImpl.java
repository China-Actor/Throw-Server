package com.playmore.dbobject.gameserver.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import com.playmore.database.dao.SinglePrimaryKeyDBDaoImpl;
import com.playmore.database.dao.MutiPrimaryKeyDBDaoImpl;
import com.playmore.database.dao.NoPrimaryKeyDBDaoImpl;
import com.playmore.database.dao.provider.SingleDBProvider;
import com.playmore.database.dao.provider.MutiDBProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import com.playmore.xysword.enumtype.DbType;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.gameserver.MazeTemplateData;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeTemplateDataDaoImpl extends SinglePrimaryKeyDBDaoImpl<MazeTemplateData>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final MazeTemplateDataDaoImpl DEFAULT = new	MazeTemplateDataDaoImpl();
	public static MazeTemplateDataDaoImpl getDefault() {
		return DEFAULT;
	}
	protected MazeTemplateData createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer stageType = rs.getInt("stage_type");
		java.lang.String mazeTemplate = rs.getString("maze_template");
		java.lang.String createDate = rs.getString("create_date");
		MazeTemplateData instance = new MazeTemplateData();
		instance.setId(id);
		instance.setStageType(stageType);
		instance.setMazeTemplate(mazeTemplate);
		instance.setCreateDate(createDate);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO maze_template_data (`id`,`stage_type`,`maze_template`,`create_date`) VALUES(:id,:stageType,:mazeTemplate,:createDate)";
	}
	protected String getUpdateSql() {
		return "UPDATE maze_template_data SET `stage_type`=:stageType,`maze_template`=:mazeTemplate,`create_date`=:createDate WHERE id=:id";
	}
	protected java.lang.Integer getKey(MazeTemplateData t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "maze_template_data";
	}
	public String getDbType(){
		return DbType.GAME;
	}
}
