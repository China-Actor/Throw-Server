package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.GuildS;
import main.java.com.playmore.dbobject.staticdb.dao.GuildSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class GuildSManager extends AbstractManager<java.lang.Integer,GuildS> {

	private GuildSManager(){
	}
	private static final GuildSManager DEFAULT = new	GuildSManager();
	public static GuildSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildS> queryAllFromDb() {
		return GuildSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildS t) {
		return t.getId();
	}
}
