package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.PlayerlevelS;
import com.playmore.dbobject.staticdb.dao.PlayerlevelSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class PlayerlevelSManager extends AbstractManager<java.lang.Integer,PlayerlevelS> {

	private PlayerlevelSManager(){
	}
	private static final PlayerlevelSManager DEFAULT = new	PlayerlevelSManager();
	public static PlayerlevelSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<PlayerlevelS> queryAllFromDb() {
		return PlayerlevelSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(PlayerlevelS t) {
		return t.getId();
	}
}
