package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.DrawcontentS;
import main.java.com.playmore.dbobject.staticdb.dao.DrawcontentSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class DrawcontentSManager extends AbstractManager<java.lang.Integer,DrawcontentS> {

	private DrawcontentSManager(){
	}
	private static final DrawcontentSManager DEFAULT = new	DrawcontentSManager();
	public static DrawcontentSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<DrawcontentS> queryAllFromDb() {
		return DrawcontentSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(DrawcontentS t) {
		return t.getId();
	}
}
