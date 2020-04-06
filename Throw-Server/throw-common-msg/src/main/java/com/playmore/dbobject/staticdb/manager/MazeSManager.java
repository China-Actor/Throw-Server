package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.MazeS;
import com.playmore.dbobject.staticdb.dao.MazeSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class MazeSManager extends AbstractManager<java.lang.Integer,MazeS> {

	@Autowired
	MazeSDaoImpl daoImpl;

	private MazeSManager(){
	}
	private static final MazeSManager DEFAULT = new	MazeSManager();
	public static MazeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MazeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(MazeS t) {
		return t.getId();
	}
}
