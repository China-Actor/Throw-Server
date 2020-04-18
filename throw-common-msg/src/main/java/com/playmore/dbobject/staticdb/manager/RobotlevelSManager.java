package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.RobotlevelS;
import com.playmore.dbobject.staticdb.dao.RobotlevelSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import com.playmore.annotation.DataSource;
import com.playmore.opsconfig.DataSourceNames;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class RobotlevelSManager extends AbstractManager<java.lang.Integer,RobotlevelS> {

	@Autowired
	RobotlevelSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<RobotlevelS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(RobotlevelS t) {
		return t.getId();
	}
}
