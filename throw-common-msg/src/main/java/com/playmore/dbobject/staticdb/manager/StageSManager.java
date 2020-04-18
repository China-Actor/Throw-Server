package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.StageS;
import com.playmore.dbobject.staticdb.dao.StageSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
import com.playmore.annotation.DataSource;
import com.playmore.opsconfig.DataSourceNames;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class StageSManager extends AbstractManager<java.lang.Integer,StageS> {

	@Autowired
	StageSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
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
