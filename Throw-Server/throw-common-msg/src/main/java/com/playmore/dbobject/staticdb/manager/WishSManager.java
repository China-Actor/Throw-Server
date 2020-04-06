package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.WishS;
import com.playmore.dbobject.staticdb.dao.WishSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class WishSManager extends AbstractManager<java.lang.Integer,WishS> {

	@Autowired
	WishSDaoImpl daoImpl;

	private WishSManager(){
	}
	private static final WishSManager DEFAULT = new	WishSManager();
	public static WishSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<WishS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(WishS t) {
		return t.getId();
	}
}
