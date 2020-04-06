package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.AttributeS;
import com.playmore.dbobject.staticdb.dao.AttributeSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class AttributeSManager extends AbstractManager<java.lang.Integer,AttributeS> {

	@Autowired
	AttributeSDaoImpl daoImpl;

	private AttributeSManager(){
	}
	private static final AttributeSManager DEFAULT = new	AttributeSManager();
	public static AttributeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<AttributeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(AttributeS t) {
		return t.getId();
	}
}
