package com.playmore.dbobject.configcenter.dao;

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
import com.playmore.dbobject.configcenter.DbConfig;
import java.util.List;
import com.playmore.util.DateUtil;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DbConfigDaoImpl extends SinglePrimaryKeyDBDaoImpl<DbConfig>{

	@Override
	public NamedParameterJdbcDaoSupport getDaoSupport(String key) {
		return SingleDBProvider.getDefault().getDaoSupport(key);
	}
	private static final DbConfigDaoImpl DEFAULT = new	DbConfigDaoImpl();
	public static DbConfigDaoImpl getDefault() {
		return DEFAULT;
	}
	protected DbConfig createMapRow(ResultSet rs, int rowNum) throws SQLException{
		java.lang.Integer id = rs.getInt("id");
		java.lang.Integer idleConnectionTestPeriodInMinutes = rs.getInt("idleConnectionTestPeriodInMinutes");
		java.lang.Integer idleMaxAgeInSeconds = rs.getInt("idleMaxAgeInSeconds");
		java.lang.Integer maxConnectionsPerPartition = rs.getInt("maxConnectionsPerPartition");
		java.lang.Integer minConnectionsPerPartition = rs.getInt("minConnectionsPerPartition");
		java.lang.Integer partitionCount = rs.getInt("partitionCount");
		java.lang.Integer acquireIncrement = rs.getInt("acquireIncrement");
		java.lang.Integer statementsCacheSize = rs.getInt("statementsCacheSize");
		java.lang.Integer flushDbInterval = rs.getInt("flush_db_interval");
		DbConfig instance = new DbConfig();
		instance.setId(id);
		instance.setIdleConnectionTestPeriodInMinutes(idleConnectionTestPeriodInMinutes);
		instance.setIdleMaxAgeInSeconds(idleMaxAgeInSeconds);
		instance.setMaxConnectionsPerPartition(maxConnectionsPerPartition);
		instance.setMinConnectionsPerPartition(minConnectionsPerPartition);
		instance.setPartitionCount(partitionCount);
		instance.setAcquireIncrement(acquireIncrement);
		instance.setStatementsCacheSize(statementsCacheSize);
		instance.setFlushDbInterval(flushDbInterval);
		return instance;
	}
	protected String getInsertSql() {
		return "INSERT INTO db_config (`id`,`idleConnectionTestPeriodInMinutes`,`idleMaxAgeInSeconds`,`maxConnectionsPerPartition`,`minConnectionsPerPartition`,`partitionCount`,`acquireIncrement`,`statementsCacheSize`,`flush_db_interval`) VALUES(:id,:idleConnectionTestPeriodInMinutes,:idleMaxAgeInSeconds,:maxConnectionsPerPartition,:minConnectionsPerPartition,:partitionCount,:acquireIncrement,:statementsCacheSize,:flushDbInterval)";
	}
	protected String getUpdateSql() {
		return "UPDATE db_config SET `idleConnectionTestPeriodInMinutes`=:idleConnectionTestPeriodInMinutes,`idleMaxAgeInSeconds`=:idleMaxAgeInSeconds,`maxConnectionsPerPartition`=:maxConnectionsPerPartition,`minConnectionsPerPartition`=:minConnectionsPerPartition,`partitionCount`=:partitionCount,`acquireIncrement`=:acquireIncrement,`statementsCacheSize`=:statementsCacheSize,`flush_db_interval`=:flushDbInterval WHERE id=:id";
	}
	protected java.lang.Integer getKey(DbConfig t){
		return t.getId();
	}
	protected String getKeyName(){
		return "id";
	}
	public String getDbName() {
		return "db_config";
	}
	public String getDbType(){
		return DbType.CONFIG_CENTER;
	}
}
