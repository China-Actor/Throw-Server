package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.VipS;
import main.java.com.playmore.dbobject.staticdb.dao.VipSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class VipSManager extends AbstractManager<java.lang.Integer,VipS> {

	private VipSManager(){
	}
	private static final VipSManager DEFAULT = new	VipSManager();
	public static VipSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<VipS> queryAllFromDb() {
		return VipSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(VipS t) {
		return t.getId();
	}
}
