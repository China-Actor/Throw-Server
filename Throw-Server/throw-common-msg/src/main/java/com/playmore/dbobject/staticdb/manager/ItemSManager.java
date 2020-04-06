package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ItemS;
import com.playmore.dbobject.staticdb.dao.ItemSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ItemSManager extends AbstractManager<java.lang.Integer,ItemS> {

	@Autowired
	ItemSDaoImpl daoImpl;

	private ItemSManager(){
	}
	private static final ItemSManager DEFAULT = new	ItemSManager();
	public static ItemSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ItemS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ItemS t) {
		return t.getId();
	}
}
