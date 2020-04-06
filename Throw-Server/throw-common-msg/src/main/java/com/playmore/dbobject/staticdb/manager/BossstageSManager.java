package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.BossstageS;
import com.playmore.dbobject.staticdb.dao.BossstageSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class BossstageSManager extends AbstractManager<java.lang.Integer,BossstageS> {

	@Autowired
	BossstageSDaoImpl daoImpl;

	private BossstageSManager(){
	}
	private static final BossstageSManager DEFAULT = new	BossstageSManager();
	public static BossstageSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<BossstageS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(BossstageS t) {
		return t.getId();
	}
}
