package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.EquipmentS;
import com.playmore.dbobject.staticdb.dao.EquipmentSDaoImpl;
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
public class EquipmentSManager extends AbstractManager<java.lang.Integer,EquipmentS> {

	@Autowired
	EquipmentSDaoImpl daoImpl;


	@Override 
	public void load() {
	}

	@DataSource(DataSourceNames.STATIC)
	public void init() {
		super.load();
	}
	@Override
	public Collection<EquipmentS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(EquipmentS t) {
		return t.getId();
	}
}
