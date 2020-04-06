package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GuildbossS;
import com.playmore.dbobject.staticdb.dao.GuildbossSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class GuildbossSManager extends AbstractManager<java.lang.Integer,GuildbossS> {

	@Autowired
	GuildbossSDaoImpl daoImpl;

	private GuildbossSManager(){
	}
	private static final GuildbossSManager DEFAULT = new	GuildbossSManager();
	public static GuildbossSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildbossS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildbossS t) {
		return t.getId();
	}
}
