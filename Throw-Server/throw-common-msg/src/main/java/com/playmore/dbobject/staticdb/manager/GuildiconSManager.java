package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GuildiconS;
import com.playmore.dbobject.staticdb.dao.GuildiconSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class GuildiconSManager extends AbstractManager<java.lang.Integer,GuildiconS> {

	@Autowired
	GuildiconSDaoImpl daoImpl;

	private GuildiconSManager(){
	}
	private static final GuildiconSManager DEFAULT = new	GuildiconSManager();
	public static GuildiconSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildiconS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildiconS t) {
		return t.getId();
	}
}
