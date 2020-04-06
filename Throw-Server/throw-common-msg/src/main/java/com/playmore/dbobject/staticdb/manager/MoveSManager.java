package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.MoveS;
import com.playmore.dbobject.staticdb.dao.MoveSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class MoveSManager extends AbstractManager<java.lang.Integer,MoveS> {

	@Autowired
	MoveSDaoImpl daoImpl;

	private MoveSManager(){
	}
	private static final MoveSManager DEFAULT = new	MoveSManager();
	public static MoveSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<MoveS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(MoveS t) {
		return t.getId();
	}
}
