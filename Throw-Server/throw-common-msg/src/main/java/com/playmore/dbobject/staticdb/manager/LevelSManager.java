package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.LevelS;
import com.playmore.dbobject.staticdb.dao.LevelSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class LevelSManager extends AbstractManager<java.lang.Integer,LevelS> {

	@Autowired
	LevelSDaoImpl daoImpl;

	private LevelSManager(){
	}
	private static final LevelSManager DEFAULT = new	LevelSManager();
	public static LevelSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<LevelS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(LevelS t) {
		return t.getId();
	}
}
