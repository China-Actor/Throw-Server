package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.SkillS;
import com.playmore.dbobject.staticdb.dao.SkillSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class SkillSManager extends AbstractManager<java.lang.Integer,SkillS> {

	@Autowired
	SkillSDaoImpl daoImpl;

	private SkillSManager(){
	}
	private static final SkillSManager DEFAULT = new	SkillSManager();
	public static SkillSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<SkillS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(SkillS t) {
		return t.getId();
	}
}
