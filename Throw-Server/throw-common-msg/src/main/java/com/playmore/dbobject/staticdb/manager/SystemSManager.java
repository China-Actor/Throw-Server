package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.SystemS;
import com.playmore.dbobject.staticdb.dao.SystemSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class SystemSManager extends AbstractManager<java.lang.Integer,SystemS> {

	@Autowired
	SystemSDaoImpl daoImpl;

	private SystemSManager(){
	}
	private static final SystemSManager DEFAULT = new	SystemSManager();
	public static SystemSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<SystemS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(SystemS t) {
		return t.getId();
	}
}
