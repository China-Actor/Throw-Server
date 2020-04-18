package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GoodsS;
import com.playmore.dbobject.staticdb.dao.GoodsSDaoImpl;
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
public class GoodsSManager extends AbstractManager<java.lang.Integer,GoodsS> {

	@Autowired
	GoodsSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
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
