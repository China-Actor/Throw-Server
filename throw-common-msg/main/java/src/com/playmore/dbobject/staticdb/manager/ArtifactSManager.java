package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.ArtifactS;
import main.java.com.playmore.dbobject.staticdb.dao.ArtifactSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class ArtifactSManager extends AbstractManager<java.lang.Integer,ArtifactS> {

	private ArtifactSManager(){
	}
	private static final ArtifactSManager DEFAULT = new	ArtifactSManager();
	public static ArtifactSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ArtifactS> queryAllFromDb() {
		return ArtifactSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(ArtifactS t) {
		return t.getId();
	}
}
