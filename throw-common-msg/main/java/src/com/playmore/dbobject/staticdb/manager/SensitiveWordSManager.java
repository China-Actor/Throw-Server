package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.SensitiveWordS;
import main.java.com.playmore.dbobject.staticdb.dao.SensitiveWordSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class SensitiveWordSManager extends AbstractManager<java.lang.Integer,SensitiveWordS> {

	private SensitiveWordSManager(){
	}
	private static final SensitiveWordSManager DEFAULT = new	SensitiveWordSManager();
	public static SensitiveWordSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<SensitiveWordS> queryAllFromDb() {
		return SensitiveWordSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(SensitiveWordS t) {
		return t.getId();
	}
}
