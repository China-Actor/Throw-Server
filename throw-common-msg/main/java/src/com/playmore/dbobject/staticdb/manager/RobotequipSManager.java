package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.RobotequipS;
import main.java.com.playmore.dbobject.staticdb.dao.RobotequipSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class RobotequipSManager extends AbstractManager<java.lang.Integer,RobotequipS> {

	private RobotequipSManager(){
	}
	private static final RobotequipSManager DEFAULT = new	RobotequipSManager();
	public static RobotequipSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<RobotequipS> queryAllFromDb() {
		return RobotequipSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(RobotequipS t) {
		return t.getId();
	}
}
