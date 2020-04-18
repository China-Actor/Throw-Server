package com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import com.playmore.dbobject.staticdb.CmdCodeS;
import com.playmore.dbobject.staticdb.dao.CmdCodeSDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class CmdCodeSManager extends AbstractManager<java.lang.String,CmdCodeS> {

	private CmdCodeSManager(){
	}
	private static final CmdCodeSManager DEFAULT = new	CmdCodeSManager();
	public static CmdCodeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<CmdCodeS> queryAllFromDb() {
		return CmdCodeSDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.String getKey(CmdCodeS t) {
		return t.getId();
	}
}
