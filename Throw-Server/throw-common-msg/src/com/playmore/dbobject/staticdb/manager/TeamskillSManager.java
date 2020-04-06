package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.TeamskillS;
import com.playmore.dbobject.staticdb.dao.TeamskillSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class TeamskillSManager extends AbstractManager<java.lang.Integer,TeamskillS> {

	private TeamskillSManager(){
	}
	private static final TeamskillSManager DEFAULT = new	TeamskillSManager();
	public static TeamskillSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TeamskillS> queryAllFromDb() {
		return TeamskillSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(TeamskillS t) {
		return t.getId();
	}
}
