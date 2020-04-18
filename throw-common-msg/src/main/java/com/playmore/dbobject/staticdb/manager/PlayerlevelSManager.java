package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.PlayerlevelS;
import com.playmore.dbobject.staticdb.dao.PlayerlevelSDaoImpl;
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
public class PlayerlevelSManager extends AbstractManager<java.lang.Integer,PlayerlevelS> {

	@Autowired
	PlayerlevelSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<PlayerlevelS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(PlayerlevelS t) {
		return t.getId();
	}
}
