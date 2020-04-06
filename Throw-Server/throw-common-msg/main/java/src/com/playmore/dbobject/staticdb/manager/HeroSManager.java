package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.HeroS;
import main.java.com.playmore.dbobject.staticdb.dao.HeroSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class HeroSManager extends AbstractManager<java.lang.Integer,HeroS> {

	private HeroSManager(){
	}
	private static final HeroSManager DEFAULT = new	HeroSManager();
	public static HeroSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<HeroS> queryAllFromDb() {
		return HeroSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(HeroS t) {
		return t.getId();
	}
}
