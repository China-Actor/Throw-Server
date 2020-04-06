package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.MonsterTeamS;
import main.java.com.playmore.dbobject.staticdb.dao.MonsterTeamSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class MonsterTeamSManager extends AbstractManager<java.lang.Integer,MonsterTeamS> {

	private MonsterTeamSManager(){
	}
	private static final MonsterTeamSManager DEFAULT = new	MonsterTeamSManager();
	public static MonsterTeamSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MonsterTeamS> queryAllFromDb() {
		return MonsterTeamSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(MonsterTeamS t) {
		return t.getId();
	}
}
