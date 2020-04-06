package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ArenarewardS;
import com.playmore.dbobject.staticdb.dao.ArenarewardSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ArenarewardSManager extends AbstractManager<java.lang.Integer,ArenarewardS> {

	@Autowired
	ArenarewardSDaoImpl daoImpl;

	private ArenarewardSManager(){
	}
	private static final ArenarewardSManager DEFAULT = new	ArenarewardSManager();
	public static ArenarewardSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ArenarewardS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ArenarewardS t) {
		return t.getId();
	}
}
