package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ArenarewardS;
import com.playmore.dbobject.staticdb.dao.ArenarewardSDaoImpl;
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
public class ArenarewardSManager extends AbstractManager<java.lang.Integer,ArenarewardS> {

	@Autowired
	ArenarewardSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<ArenarewardS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ArenarewardS t) {
		return t.getId();
	}
}
