package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GuildS;
import com.playmore.dbobject.staticdb.dao.GuildSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class GuildSManager extends AbstractManager<java.lang.Integer,GuildS> {

	@Autowired
	GuildSDaoImpl daoImpl;

	private GuildSManager(){
	}
	private static final GuildSManager DEFAULT = new	GuildSManager();
	public static GuildSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildS t) {
		return t.getId();
	}
}
