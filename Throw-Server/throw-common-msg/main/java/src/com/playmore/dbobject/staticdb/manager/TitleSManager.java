package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.TitleS;
import main.java.com.playmore.dbobject.staticdb.dao.TitleSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TitleSManager extends AbstractManager<java.lang.Integer,TitleS> {

	private TitleSManager(){
	}
	private static final TitleSManager DEFAULT = new	TitleSManager();
	public static TitleSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TitleS> queryAllFromDb() {
		return TitleSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TitleS t) {
		return t.getId();
	}
}
