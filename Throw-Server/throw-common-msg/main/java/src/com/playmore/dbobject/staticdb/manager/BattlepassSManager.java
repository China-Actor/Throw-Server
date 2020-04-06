package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.BattlepassS;
import main.java.com.playmore.dbobject.staticdb.dao.BattlepassSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class BattlepassSManager extends AbstractManager<java.lang.Integer,BattlepassS> {

	private BattlepassSManager(){
	}
	private static final BattlepassSManager DEFAULT = new	BattlepassSManager();
	public static BattlepassSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<BattlepassS> queryAllFromDb() {
		return BattlepassSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(BattlepassS t) {
		return t.getId();
	}
}
