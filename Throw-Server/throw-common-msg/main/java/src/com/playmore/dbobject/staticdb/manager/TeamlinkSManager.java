package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.TeamlinkS;
import main.java.com.playmore.dbobject.staticdb.dao.TeamlinkSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TeamlinkSManager extends AbstractManager<java.lang.Integer,TeamlinkS> {

	private TeamlinkSManager(){
	}
	private static final TeamlinkSManager DEFAULT = new	TeamlinkSManager();
	public static TeamlinkSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TeamlinkS> queryAllFromDb() {
		return TeamlinkSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TeamlinkS t) {
		return t.getId();
	}
}
