package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.SkillS;
import com.playmore.dbobject.staticdb.dao.SkillSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class SkillSManager extends AbstractManager<java.lang.Integer,SkillS> {

	private SkillSManager(){
	}
	private static final SkillSManager DEFAULT = new	SkillSManager();
	public static SkillSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<SkillS> queryAllFromDb() {
		return SkillSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(SkillS t) {
		return t.getId();
	}
}
