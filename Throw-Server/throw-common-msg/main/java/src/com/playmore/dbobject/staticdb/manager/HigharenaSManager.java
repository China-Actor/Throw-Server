package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.HigharenaS;
import main.java.com.playmore.dbobject.staticdb.dao.HigharenaSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class HigharenaSManager extends AbstractManager<java.lang.Integer,HigharenaS> {

	private HigharenaSManager(){
	}
	private static final HigharenaSManager DEFAULT = new	HigharenaSManager();
	public static HigharenaSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<HigharenaS> queryAllFromDb() {
		return HigharenaSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(HigharenaS t) {
		return t.getId();
	}
}
