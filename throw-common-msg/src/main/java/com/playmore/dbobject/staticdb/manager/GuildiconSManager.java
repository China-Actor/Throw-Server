package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GuildiconS;
import com.playmore.dbobject.staticdb.dao.GuildiconSDaoImpl;
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
public class GuildiconSManager extends AbstractManager<java.lang.Integer,GuildiconS> {

	@Autowired
	GuildiconSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<GuildiconS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildiconS t) {
		return t.getId();
	}
}
