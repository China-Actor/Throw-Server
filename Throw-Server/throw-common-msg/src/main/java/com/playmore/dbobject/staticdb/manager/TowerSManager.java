package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TowerS;
import com.playmore.dbobject.staticdb.dao.TowerSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class TowerSManager extends AbstractManager<java.lang.Integer,TowerS> {

	@Autowired
	TowerSDaoImpl daoImpl;

	private TowerSManager(){
	}
	private static final TowerSManager DEFAULT = new	TowerSManager();
	public static TowerSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TowerS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TowerS t) {
		return t.getId();
	}
}
