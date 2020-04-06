package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.RobotlevelS;
import com.playmore.dbobject.staticdb.dao.RobotlevelSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class RobotlevelSManager extends AbstractManager<java.lang.Integer,RobotlevelS> {

	@Autowired
	RobotlevelSDaoImpl daoImpl;

	private RobotlevelSManager(){
	}
	private static final RobotlevelSManager DEFAULT = new	RobotlevelSManager();
	public static RobotlevelSManager getDefault() {
		return DEFAULT;
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
