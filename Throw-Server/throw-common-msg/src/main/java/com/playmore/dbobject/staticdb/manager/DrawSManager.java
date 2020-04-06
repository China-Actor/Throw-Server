package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.DrawS;
import com.playmore.dbobject.staticdb.dao.DrawSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class DrawSManager extends AbstractManager<java.lang.Integer,DrawS> {

	@Autowired
	DrawSDaoImpl daoImpl;

	private DrawSManager(){
	}
	private static final DrawSManager DEFAULT = new	DrawSManager();
	public static DrawSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<DrawS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(DrawS t) {
		return t.getId();
	}
}
