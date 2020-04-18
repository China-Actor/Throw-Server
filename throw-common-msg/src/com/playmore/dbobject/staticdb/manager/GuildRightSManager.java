package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.GuildRightS;
import com.playmore.dbobject.staticdb.dao.GuildRightSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class GuildRightSManager extends AbstractManager<java.lang.Integer,GuildRightS> {

	private GuildRightSManager(){
	}
	private static final GuildRightSManager DEFAULT = new	GuildRightSManager();
	public static GuildRightSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildRightS> queryAllFromDb() {
		return GuildRightSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildRightS t) {
		return t.getId();
	}
}
