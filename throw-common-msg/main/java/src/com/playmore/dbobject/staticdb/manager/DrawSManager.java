package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.DrawS;
import main.java.com.playmore.dbobject.staticdb.dao.DrawSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class DrawSManager extends AbstractManager<java.lang.Integer,DrawS> {

	private DrawSManager(){
	}
	private static final DrawSManager DEFAULT = new	DrawSManager();
	public static DrawSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<DrawS> queryAllFromDb() {
		return DrawSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(DrawS t) {
		return t.getId();
	}
}
