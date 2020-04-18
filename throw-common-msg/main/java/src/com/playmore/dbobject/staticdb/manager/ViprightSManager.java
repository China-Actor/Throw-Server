package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.ViprightS;
import main.java.com.playmore.dbobject.staticdb.dao.ViprightSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ViprightSManager extends AbstractManager<java.lang.Integer,ViprightS> {

	private ViprightSManager(){
	}
	private static final ViprightSManager DEFAULT = new	ViprightSManager();
	public static ViprightSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ViprightS> queryAllFromDb() {
		return ViprightSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ViprightS t) {
		return t.getId();
	}
}
