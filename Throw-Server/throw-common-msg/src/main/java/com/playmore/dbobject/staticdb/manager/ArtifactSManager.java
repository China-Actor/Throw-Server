package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.ArtifactS;
import com.playmore.dbobject.staticdb.dao.ArtifactSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class ArtifactSManager extends AbstractManager<java.lang.Integer,ArtifactS> {

	@Autowired
	ArtifactSDaoImpl daoImpl;

	private ArtifactSManager(){
	}
	private static final ArtifactSManager DEFAULT = new	ArtifactSManager();
	public static ArtifactSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<ArtifactS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(ArtifactS t) {
		return t.getId();
	}
}
