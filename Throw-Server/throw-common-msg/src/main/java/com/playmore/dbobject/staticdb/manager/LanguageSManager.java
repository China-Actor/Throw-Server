package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.LanguageS;
import com.playmore.dbobject.staticdb.dao.LanguageSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class LanguageSManager extends AbstractManager<java.lang.Integer,LanguageS> {

	@Autowired
	LanguageSDaoImpl daoImpl;

	private LanguageSManager(){
	}
	private static final LanguageSManager DEFAULT = new	LanguageSManager();
	public static LanguageSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<LanguageS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(LanguageS t) {
		return t.getId();
	}
}
