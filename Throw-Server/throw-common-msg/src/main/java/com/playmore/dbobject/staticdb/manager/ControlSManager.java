package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ControlS;
import com.playmore.dbobject.staticdb.dao.ControlSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ControlSManager extends AbstractManager<java.lang.Integer,ControlS> {

	@Autowired
	ControlSDaoImpl daoImpl;

	private ControlSManager(){
	}
	private static final ControlSManager DEFAULT = new	ControlSManager();
	public static ControlSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ControlS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ControlS t) {
		return t.getId();
	}
}
