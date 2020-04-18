package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.ControlS;
import main.java.com.playmore.dbobject.staticdb.dao.ControlSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ControlSManager extends AbstractManager<java.lang.Integer,ControlS> {

	private ControlSManager(){
	}
	private static final ControlSManager DEFAULT = new	ControlSManager();
	public static ControlSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ControlS> queryAllFromDb() {
		return ControlSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ControlS t) {
		return t.getId();
	}
}
