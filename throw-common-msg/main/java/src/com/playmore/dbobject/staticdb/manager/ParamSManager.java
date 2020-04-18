package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.ParamS;
import main.java.com.playmore.dbobject.staticdb.dao.ParamSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ParamSManager extends AbstractManager<java.lang.Integer,ParamS> {

	private ParamSManager(){
	}
	private static final ParamSManager DEFAULT = new	ParamSManager();
	public static ParamSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ParamS> queryAllFromDb() {
		return ParamSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ParamS t) {
		return t.getId();
	}
}
