package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.CopymasterS;
import com.playmore.dbobject.staticdb.dao.CopymasterSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class CopymasterSManager extends AbstractManager<java.lang.Integer,CopymasterS> {

	@Autowired
	CopymasterSDaoImpl daoImpl;

	private CopymasterSManager(){
	}
	private static final CopymasterSManager DEFAULT = new	CopymasterSManager();
	public static CopymasterSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<CopymasterS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(CopymasterS t) {
		return t.getId();
	}
}
