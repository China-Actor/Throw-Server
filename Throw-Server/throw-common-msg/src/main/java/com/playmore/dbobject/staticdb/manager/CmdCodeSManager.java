package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.CmdCodeS;
import com.playmore.dbobject.staticdb.dao.CmdCodeSDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class CmdCodeSManager extends AbstractManager<java.lang.String,CmdCodeS> {

	@Autowired
	CmdCodeSDaoImpl daoImpl;

	private CmdCodeSManager(){
	}
	private static final CmdCodeSManager DEFAULT = new	CmdCodeSManager();
	public static CmdCodeSManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<CmdCodeS> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.String getKey(CmdCodeS t) {
		return t.getId();
	}
}
