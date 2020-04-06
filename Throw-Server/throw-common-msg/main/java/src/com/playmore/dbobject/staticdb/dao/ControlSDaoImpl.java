package main.java.com.playmore.dbobject.staticdb.dao;

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
import main.java.com.playmore.dbobject.staticdb.ControlS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ControlSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ControlS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ControlSDaoImpl DEFAULT = new	ControlSDaoImpl();
	public static ControlSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ControlS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.String show = rs.getString("show");
		java.lang.Integer interruptAction = rs.getInt("interrupt_action");
		java.lang.Integer interruptSkill = rs.getInt("interrupt_skill");
		java.lang.Integer enableAct = rs.getInt("enable_act");
		java.lang.Integer enableSkill = rs.getInt("enable_skill");
		java.lang.Integer pause = rs.getInt("pause");
		java.lang.Integer isTarget = rs.getInt("is_target");
		java.lang.Integer repel = rs.getInt("repel");
		java.lang.Integer enableMove = rs.getInt("enable_move");
		java.lang.Integer enableOverlay = rs.getInt("enable_overlay");
		java.lang.Integer kind = rs.getInt("kind");
		ControlS instance = new ControlS();
		instance.setId(id);
		instance.setName(name);
		instance.setShow(show);
		instance.setInterruptAction(interruptAction);
		instance.setInterruptSkill(interruptSkill);
		instance.setEnableAct(enableAct);
		instance.setEnableSkill(enableSkill);
		instance.setPause(pause);
		instance.setIsTarget(isTarget);
		instance.setRepel(repel);
		instance.setEnableMove(enableMove);
		instance.setEnableOverlay(enableOverlay);
		instance.setKind(kind);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO control_s (`id`,`name`,`show`,`interrupt_action`,`interrupt_skill`,`enable_act`,`enable_skill`,`pause`,`is_target`,`repel`,`enable_move`,`enable_overlay`,`kind`) VALUES(:id,:name,:show,:interruptAction,:interruptSkill,:enableAct,:enableSkill,:pause,:isTarget,:repel,:enableMove,:enableOverlay,:kind)";
	}
	protected String getUpdateSql() {
		return "UPDATE control_s SET `name`=:name,`show`=:show,`interrupt_action`=:interruptAction,`interrupt_skill`=:interruptSkill,`enable_act`=:enableAct,`enable_skill`=:enableSkill,`pause`=:pause,`is_target`=:isTarget,`repel`=:repel,`enable_move`=:enableMove,`enable_overlay`=:enableOverlay,`kind`=:kind WHERE id=:id";
	}
	protected java.lang.Integer getKey(ControlS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "control_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}
