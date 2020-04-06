package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.MoveS;
import main.java.com.playmore.dbobject.staticdb.dao.MoveSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class MoveSManager extends AbstractManager<java.lang.Integer,MoveS> {

	private MoveSManager(){
	}
	private static final MoveSManager DEFAULT = new	MoveSManager();
	public static MoveSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MoveS> queryAllFromDb() {
		return MoveSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(MoveS t) {
		return t.getId();
	}
}
