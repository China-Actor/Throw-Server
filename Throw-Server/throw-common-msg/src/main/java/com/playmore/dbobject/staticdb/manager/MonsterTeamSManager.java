package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.MonsterTeamS;
import com.playmore.dbobject.staticdb.dao.MonsterTeamSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class MonsterTeamSManager extends AbstractManager<java.lang.Integer,MonsterTeamS> {

	@Autowired
	MonsterTeamSDaoImpl daoImpl;

	private MonsterTeamSManager(){
	}
	private static final MonsterTeamSManager DEFAULT = new	MonsterTeamSManager();
	public static MonsterTeamSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MonsterTeamS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(MonsterTeamS t) {
		return t.getId();
	}
}
