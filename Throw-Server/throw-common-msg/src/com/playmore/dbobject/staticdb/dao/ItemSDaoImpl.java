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
import com.playmore.dbobject.staticdb.ItemS;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class ItemSDaoImpl extends SinglePrimaryKeyDBDaoImpl<ItemS>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final ItemSDaoImpl DEFAULT = new	ItemSDaoImpl();
	public static ItemSDaoImpl getDefault() {
		return DEFAULT;
	}
	protected ItemS createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.String name = rs.getString("name");
		java.lang.Integer itemQuality = rs.getInt("item_quality");
		java.lang.String iconId = rs.getString("icon_id");
		java.lang.Integer bagTag = rs.getInt("bag_tag");
		java.lang.Integer itemType = rs.getInt("item_type");
		java.lang.Integer itemTypeValue1 = rs.getInt("item_type_value1");
		java.lang.Integer itemTypeValue2 = rs.getInt("item_type_value2");
		java.lang.Integer itemMaxNum = rs.getInt("item_max_num");
		java.lang.Integer useSystemId = rs.getInt("use_system_id");
		java.lang.Integer itemUsetype = rs.getInt("item_usetype");
		java.lang.String itemTypeDesc = rs.getString("item_type_desc");
		java.lang.String desc = rs.getString("desc");
		java.lang.String comments = rs.getString("comments");
		ItemS instance = new ItemS();
		instance.setId(id);
		instance.setName(name);
		instance.setItemQuality(itemQuality);
		instance.setIconId(iconId);
		instance.setBagTag(bagTag);
		instance.setItemType(itemType);
		instance.setItemTypeValue1(itemTypeValue1);
		instance.setItemTypeValue2(itemTypeValue2);
		instance.setItemMaxNum(itemMaxNum);
		instance.setUseSystemId(useSystemId);
		instance.setItemUsetype(itemUsetype);
		instance.setItemTypeDesc(itemTypeDesc);
		instance.setDesc(desc);
		instance.setComments(comments);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO item_s (`id`,`name`,`item_quality`,`icon_id`,`bag_tag`,`item_type`,`item_type_value1`,`item_type_value2`,`item_max_num`,`use_system_id`,`item_usetype`,`item_type_desc`,`desc`,`comments`) VALUES(:id,:name,:itemQuality,:iconId,:bagTag,:itemType,:itemTypeValue1,:itemTypeValue2,:itemMaxNum,:useSystemId,:itemUsetype,:itemTypeDesc,:desc,:comments)";
	}
	protected String getUpdateSql() {
		return "UPDATE item_s SET `name`=:name,`item_quality`=:itemQuality,`icon_id`=:iconId,`bag_tag`=:bagTag,`item_type`=:itemType,`item_type_value1`=:itemTypeValue1,`item_type_value2`=:itemTypeValue2,`item_max_num`=:itemMaxNum,`use_system_id`=:useSystemId,`item_usetype`=:itemUsetype,`item_type_desc`=:itemTypeDesc,`desc`=:desc,`comments`=:comments WHERE id=:id";
	}
	protected java.lang.Integer getKey(ItemS t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "item_s";
	}
	public String getDbType(){
		return DbType.STATIC;
	}
}
