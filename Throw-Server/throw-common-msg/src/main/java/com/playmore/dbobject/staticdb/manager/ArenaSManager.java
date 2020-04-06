package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ArenaS;
import com.playmore.dbobject.staticdb.dao.ArenaSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ArenaSManager extends AbstractManager<java.lang.Integer,ArenaS> {

	@Autowired
	ArenaSDaoImpl daoImpl;

	private ArenaSManager(){
	}
	private static final ArenaSManager DEFAULT = new	ArenaSManager();
	public static ArenaSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ArenaS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ArenaS t) {
		return t.getId();
	}
}
