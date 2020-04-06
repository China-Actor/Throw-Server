package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ShopS;
import com.playmore.dbobject.staticdb.dao.ShopSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ShopSManager extends AbstractManager<java.lang.Integer,ShopS> {

	@Autowired
	ShopSDaoImpl daoImpl;

	private ShopSManager(){
	}
	private static final ShopSManager DEFAULT = new	ShopSManager();
	public static ShopSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ShopS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ShopS t) {
		return t.getId();
	}
}
