package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.DiamondS;
import com.playmore.dbobject.staticdb.dao.DiamondSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class DiamondSManager extends AbstractManager<java.lang.Integer,DiamondS> {

	@Autowired
	DiamondSDaoImpl daoImpl;

	private DiamondSManager(){
	}
	private static final DiamondSManager DEFAULT = new	DiamondSManager();
	public static DiamondSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<DiamondS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(DiamondS t) {
		return t.getId();
	}
}
