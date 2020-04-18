package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.MazeGateS;
import com.playmore.dbobject.staticdb.dao.MazeGateSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class MazeGateSManager extends AbstractManager<java.lang.Integer,MazeGateS> {

	private MazeGateSManager(){
	}
	private static final MazeGateSManager DEFAULT = new	MazeGateSManager();
	public static MazeGateSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MazeGateS> queryAllFromDb() {
		return MazeGateSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(MazeGateS t) {
		return t.getId();
	}
}
