package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.RewardlevelS;
import main.java.com.playmore.dbobject.staticdb.dao.RewardlevelSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class RewardlevelSManager extends AbstractManager<java.lang.Integer,RewardlevelS> {

	private RewardlevelSManager(){
	}
	private static final RewardlevelSManager DEFAULT = new	RewardlevelSManager();
	public static RewardlevelSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<RewardlevelS> queryAllFromDb() {
		return RewardlevelSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(RewardlevelS t) {
		return t.getId();
	}
}
