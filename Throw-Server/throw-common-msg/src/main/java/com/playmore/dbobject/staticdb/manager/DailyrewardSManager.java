package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.DailyrewardS;
import com.playmore.dbobject.staticdb.dao.DailyrewardSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class DailyrewardSManager extends AbstractManager<java.lang.Integer,DailyrewardS> {

	@Autowired
	DailyrewardSDaoImpl daoImpl;

	private DailyrewardSManager(){
	}
	private static final DailyrewardSManager DEFAULT = new	DailyrewardSManager();
	public static DailyrewardSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<DailyrewardS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(DailyrewardS t) {
		return t.getId();
	}
}
