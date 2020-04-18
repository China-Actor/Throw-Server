package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TeamlinkS;
import com.playmore.dbobject.staticdb.dao.TeamlinkSDaoImpl;
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
public class TeamlinkSManager extends AbstractManager<java.lang.Integer,TeamlinkS> {

	@Autowired
	TeamlinkSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<TeamlinkS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TeamlinkS t) {
		return t.getId();
	}
}
