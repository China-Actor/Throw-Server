package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.GuildiconS;
import main.java.com.playmore.dbobject.staticdb.dao.GuildiconSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class GuildiconSManager extends AbstractManager<java.lang.Integer,GuildiconS> {

	private GuildiconSManager(){
	}
	private static final GuildiconSManager DEFAULT = new	GuildiconSManager();
	public static GuildiconSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildiconS> queryAllFromDb() {
		return GuildiconSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildiconS t) {
		return t.getId();
	}
}
