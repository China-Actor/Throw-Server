package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.EquipforgeS;
import com.playmore.dbobject.staticdb.dao.EquipforgeSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class EquipforgeSManager extends AbstractManager<java.lang.Integer,EquipforgeS> {

	@Autowired
	EquipforgeSDaoImpl daoImpl;

	private EquipforgeSManager(){
	}
	private static final EquipforgeSManager DEFAULT = new	EquipforgeSManager();
	public static EquipforgeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<EquipforgeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(EquipforgeS t) {
		return t.getId();
	}
}
