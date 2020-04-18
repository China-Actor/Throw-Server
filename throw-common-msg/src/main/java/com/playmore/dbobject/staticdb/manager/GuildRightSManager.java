package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GuildRightS;
import com.playmore.dbobject.staticdb.dao.GuildRightSDaoImpl;
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
public class GuildRightSManager extends AbstractManager<java.lang.Integer,GuildRightS> {

	@Autowired
	GuildRightSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<GuildRightS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildRightS t) {
		return t.getId();
	}
}
