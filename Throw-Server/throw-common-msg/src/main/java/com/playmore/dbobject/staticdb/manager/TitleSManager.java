package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.TitleS;
import com.playmore.dbobject.staticdb.dao.TitleSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class TitleSManager extends AbstractManager<java.lang.Integer,TitleS> {

	@Autowired
	TitleSDaoImpl daoImpl;

	private TitleSManager(){
	}
	private static final TitleSManager DEFAULT = new	TitleSManager();
	public static TitleSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<TitleS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(TitleS t) {
		return t.getId();
	}
}
