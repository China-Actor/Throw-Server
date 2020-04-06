package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.MazeCardsS;
import com.playmore.dbobject.staticdb.dao.MazeCardsSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class MazeCardsSManager extends AbstractManager<java.lang.Integer,MazeCardsS> {

	private MazeCardsSManager(){
	}
	private static final MazeCardsSManager DEFAULT = new	MazeCardsSManager();
	public static MazeCardsSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MazeCardsS> queryAllFromDb() {
		return MazeCardsSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(MazeCardsS t) {
		return t.getId();
	}
}
