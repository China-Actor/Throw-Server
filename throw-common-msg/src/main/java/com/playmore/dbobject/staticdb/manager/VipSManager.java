package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.VipS;
import com.playmore.dbobject.staticdb.dao.VipSDaoImpl;
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
public class VipSManager extends AbstractManager<java.lang.Integer,VipS> {

	@Autowired
	VipSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<VipS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(VipS t) {
		return t.getId();
	}
}
