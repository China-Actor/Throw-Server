package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.GuildrewardS;
import com.playmore.dbobject.staticdb.dao.GuildrewardSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class GuildrewardSManager extends AbstractManager<java.lang.Integer,GuildrewardS> {

	private GuildrewardSManager(){
	}
	private static final GuildrewardSManager DEFAULT = new	GuildrewardSManager();
	public static GuildrewardSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildrewardS> queryAllFromDb() {
		return GuildrewardSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildrewardS t) {
		return t.getId();
	}
}
