package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.MazeS;
import main.java.com.playmore.dbobject.staticdb.dao.MazeSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class MazeSManager extends AbstractManager<java.lang.Integer,MazeS> {

	private MazeSManager(){
	}
	private static final MazeSManager DEFAULT = new	MazeSManager();
	public static MazeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MazeS> queryAllFromDb() {
		return MazeSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(MazeS t) {
		return t.getId();
	}
}
