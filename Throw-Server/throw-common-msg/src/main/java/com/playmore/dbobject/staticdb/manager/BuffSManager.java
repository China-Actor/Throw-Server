package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.BuffS;
import com.playmore.dbobject.staticdb.dao.BuffSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class BuffSManager extends AbstractManager<java.lang.Integer,BuffS> {

	@Autowired
	BuffSDaoImpl daoImpl;

	private BuffSManager(){
	}
	private static final BuffSManager DEFAULT = new	BuffSManager();
	public static BuffSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<BuffS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(BuffS t) {
		return t.getId();
	}
}
