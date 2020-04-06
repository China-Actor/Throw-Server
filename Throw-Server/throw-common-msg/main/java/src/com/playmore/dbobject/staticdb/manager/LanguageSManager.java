package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.LanguageS;
import main.java.com.playmore.dbobject.staticdb.dao.LanguageSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class LanguageSManager extends AbstractManager<java.lang.Integer,LanguageS> {

	private LanguageSManager(){
	}
	private static final LanguageSManager DEFAULT = new	LanguageSManager();
	public static LanguageSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<LanguageS> queryAllFromDb() {
		return LanguageSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(LanguageS t) {
		return t.getId();
	}
}
