package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.RobotequipS;
import com.playmore.dbobject.staticdb.dao.RobotequipSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class RobotequipSManager extends AbstractManager<java.lang.Integer,RobotequipS> {

	@Autowired
	RobotequipSDaoImpl daoImpl;

	private RobotequipSManager(){
	}
	private static final RobotequipSManager DEFAULT = new	RobotequipSManager();
	public static RobotequipSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<RobotequipS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(RobotequipS t) {
		return t.getId();
	}
}
