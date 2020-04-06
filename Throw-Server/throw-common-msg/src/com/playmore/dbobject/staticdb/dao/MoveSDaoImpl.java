package com.playmore.dbobject.staticdb.dao;

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
import com.playmore.dbobject.staticdb.MoveS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MoveSDaoImpl extends SinglePrimaryKeyDBDaoImpl<MoveS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final MoveSDaoImpl DEFAULT = new	MoveSDaoImpl();
	public static MoveSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected MoveS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String moveType = rs.getString("move_type");
		java.lang.Integer immuneControl = rs.getInt("immune_control");
		java.lang.Integer immuneHurt = rs.getInt("immune_hurt");
		java.lang.Integer isTarget = rs.getInt("is_target");
		java.lang.String position = rs.getString("position");
		java.lang.Integer moveParam = rs.getInt("move_param");
		java.lang.Integer orientation = rs.getInt("orientation");
		MoveS instance = new MoveS();
		instance.setId(id);
		instance.setMoveType(moveType);
		instance.setImmuneControl(immuneControl);
		instance.setImmuneHurt(immuneHurt);
		instance.setIsTarget(isTarget);
		instance.setPosition(position);
		instance.setMoveParam(moveParam);
		instance.setOrientation(orientation);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO move_s (`id`,`move_type`,`immune_control`,`immune_hurt`,`is_target`,`position`,`move_param`,`orientation`) VALUES(:id,:moveType,:immuneControl,:immuneHurt,:isTarget,:position,:moveParam,:orientation)";
	}
	protected String getUpdateSql() {
		return "UPDATE move_s SET `move_type`=:moveType,`immune_control`=:immuneControl,`immune_hurt`=:immuneHurt,`is_target`=:isTarget,`position`=:position,`move_param`=:moveParam,`orientation`=:orientation WHERE id=:id";
	}
	protected java.lang.Integer getKey(MoveS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "move_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}
