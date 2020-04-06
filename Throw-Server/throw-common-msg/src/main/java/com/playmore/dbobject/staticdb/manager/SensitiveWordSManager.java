package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.SensitiveWordS;
import com.playmore.dbobject.staticdb.dao.SensitiveWordSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class SensitiveWordSManager extends AbstractManager<java.lang.Integer,SensitiveWordS> {

	@Autowired
	SensitiveWordSDaoImpl daoImpl;

	private SensitiveWordSManager(){
	}
	private static final SensitiveWordSManager DEFAULT = new	SensitiveWordSManager();
	public static SensitiveWordSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<SensitiveWordS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(SensitiveWordS t) {
		return t.getId();
	}
}
