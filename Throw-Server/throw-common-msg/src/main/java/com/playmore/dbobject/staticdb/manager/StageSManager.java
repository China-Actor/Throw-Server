package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.StageS;
import com.playmore.dbobject.staticdb.dao.StageSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class StageSManager extends AbstractManager<java.lang.Integer,StageS> {

	@Autowired
	StageSDaoImpl daoImpl;

	private StageSManager(){
	}
	private static final StageSManager DEFAULT = new	StageSManager();
	public static StageSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<StageS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(StageS t) {
		return t.getId();
	}
}
