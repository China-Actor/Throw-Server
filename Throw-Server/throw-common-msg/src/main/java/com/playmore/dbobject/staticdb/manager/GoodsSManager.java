package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GoodsS;
import com.playmore.dbobject.staticdb.dao.GoodsSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class GoodsSManager extends AbstractManager<java.lang.Integer,GoodsS> {

	@Autowired
	GoodsSDaoImpl daoImpl;

	private GoodsSManager(){
	}
	private static final GoodsSManager DEFAULT = new	GoodsSManager();
	public static GoodsSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GoodsS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GoodsS t) {
		return t.getId();
	}
}
