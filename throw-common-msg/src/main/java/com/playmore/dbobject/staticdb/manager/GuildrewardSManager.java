package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GuildrewardS;
import com.playmore.dbobject.staticdb.dao.GuildrewardSDaoImpl;
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
public class GuildrewardSManager extends AbstractManager<java.lang.Integer,GuildrewardS> {

	@Autowired
	GuildrewardSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<GuildrewardS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildrewardS t) {
		return t.getId();
	}
}
