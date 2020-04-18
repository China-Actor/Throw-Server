package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.RobotlevelS;
import com.playmore.dbobject.staticdb.dao.RobotlevelSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class RobotlevelSManager extends AbstractManager<java.lang.Integer,RobotlevelS> {

	private RobotlevelSManager(){
	}
	private static final RobotlevelSManager DEFAULT = new	RobotlevelSManager();
	public static RobotlevelSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<RobotlevelS> queryAllFromDb() {
		return RobotlevelSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(RobotlevelS t) {
		return t.getId();
	}
}
