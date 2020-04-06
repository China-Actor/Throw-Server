package com.playmore.dbobject.configcenter;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DbConfig implements Serializable {

	@DBFieldName(fieldName="id", externalKey="AppType", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="检查数据库连接池中空闲连接的间隔时间(分)", isNullable="columnNoNulls")
	private int idleConnectionTestPeriodInMinutes;
	@DBFieldName(fieldName="连接池中未使用的链接最大存活时间(秒)", isNullable="columnNoNulls")
	private int idleMaxAgeInSeconds;
	@DBFieldName(fieldName="每个分区最大的连接数", isNullable="columnNoNulls")
	private int maxConnectionsPerPartition;
	@DBFieldName(fieldName="每个分区最小的连接数", isNullable="columnNoNulls")
	private int minConnectionsPerPartition;
	@DBFieldName(fieldName="分区数最小值：1", isNullable="columnNoNulls")
	private int partitionCount;
	@DBFieldName(fieldName="连接数不够时，每次创建的新链接个数", isNullable="columnNoNulls")
	private int acquireIncrement;
	@DBFieldName(fieldName="Statement实例缓存个数", isNullable="columnNoNulls")
	private int statementsCacheSize;
	@DBFieldName(fieldName="定时入库时间间隔秒", isNullable="columnNoNulls")
	private int flushDbInterval;

	public DbConfig(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setIdleConnectionTestPeriodInMinutes(int idleConnectionTestPeriodInMinutes) {
		this.idleConnectionTestPeriodInMinutes=idleConnectionTestPeriodInMinutes;
	}

	public int getIdleConnectionTestPeriodInMinutes() {
		return idleConnectionTestPeriodInMinutes;
	}

	public void setIdleMaxAgeInSeconds(int idleMaxAgeInSeconds) {
		this.idleMaxAgeInSeconds=idleMaxAgeInSeconds;
	}

	public int getIdleMaxAgeInSeconds() {
		return idleMaxAgeInSeconds;
	}

	public void setMaxConnectionsPerPartition(int maxConnectionsPerPartition) {
		this.maxConnectionsPerPartition=maxConnectionsPerPartition;
	}

	public int getMaxConnectionsPerPartition() {
		return maxConnectionsPerPartition;
	}

	public void setMinConnectionsPerPartition(int minConnectionsPerPartition) {
		this.minConnectionsPerPartition=minConnectionsPerPartition;
	}

	public int getMinConnectionsPerPartition() {
		return minConnectionsPerPartition;
	}

	public void setPartitionCount(int partitionCount) {
		this.partitionCount=partitionCount;
	}

	public int getPartitionCount() {
		return partitionCount;
	}

	public void setAcquireIncrement(int acquireIncrement) {
		this.acquireIncrement=acquireIncrement;
	}

	public int getAcquireIncrement() {
		return acquireIncrement;
	}

	public void setStatementsCacheSize(int statementsCacheSize) {
		this.statementsCacheSize=statementsCacheSize;
	}

	public int getStatementsCacheSize() {
		return statementsCacheSize;
	}

	public void setFlushDbInterval(int flushDbInterval) {
		this.flushDbInterval=flushDbInterval;
	}

	public int getFlushDbInterval() {
		return flushDbInterval;
	}

	public String toString() {
		return "DbConfig [id=" + id + " ,idleConnectionTestPeriodInMinutes=" + idleConnectionTestPeriodInMinutes + " ,idleMaxAgeInSeconds=" + idleMaxAgeInSeconds + " ,maxConnectionsPerPartition=" + maxConnectionsPerPartition + " ,minConnectionsPerPartition=" + minConnectionsPerPartition + " ,partitionCount=" + partitionCount + " ,acquireIncrement=" + acquireIncrement + " ,statementsCacheSize=" + statementsCacheSize + " ,flushDbInterval=" + flushDbInterval+ "]";
	}
}
