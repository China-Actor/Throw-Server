package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TeamskillS;
import com.playmore.dbobject.staticdb.dao.TeamskillSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class TeamskillSManager extends AbstractManager<java.lang.Integer,TeamskillS> {

	@Autowired
	TeamskillSDaoImpl daoImpl;

	private TeamskillSManager(){
	}
	private static final TeamskillSManager DEFAULT = new	TeamskillSManager();
	public static TeamskillSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TeamskillS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TeamskillS t) {
		return t.getId();
	}
}
