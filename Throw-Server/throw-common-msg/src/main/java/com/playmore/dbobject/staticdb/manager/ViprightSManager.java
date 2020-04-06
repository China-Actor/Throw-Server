package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ViprightS;
import com.playmore.dbobject.staticdb.dao.ViprightSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ViprightSManager extends AbstractManager<java.lang.Integer,ViprightS> {

	@Autowired
	ViprightSDaoImpl daoImpl;

	private ViprightSManager(){
	}
	private static final ViprightSManager DEFAULT = new	ViprightSManager();
	public static ViprightSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ViprightS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ViprightS t) {
		return t.getId();
	}
}
