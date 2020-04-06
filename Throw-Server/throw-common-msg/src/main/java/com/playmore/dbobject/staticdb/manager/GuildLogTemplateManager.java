package com.playmore.dbobject.staticdb.manager;

import com.playmore.dbobject.staticdb.GuildLogTemplate;
import com.playmore.dbobject.staticdb.dao.GuildLogTemplateDaoImpl;
import com.playmore.manager.AbstractManager;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Collection;
/**
 * Do not touch! Close it Now! 
 */
@Component
public class GuildLogTemplateManager extends AbstractManager<java.lang.Integer,GuildLogTemplate> {

	@Autowired
	GuildLogTemplateDaoImpl daoImpl;

	private GuildLogTemplateManager(){
	}
	private static final GuildLogTemplateManager DEFAULT = new	GuildLogTemplateManager();
	public static GuildLogTemplateManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildLogTemplate> queryAllFromDb() {
		return this.daoImpl.queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildLogTemplate t) {
		return t.getId();
	}
}
