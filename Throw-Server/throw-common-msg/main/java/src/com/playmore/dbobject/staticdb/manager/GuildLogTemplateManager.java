package main.java.com.playmore.dbobject.staticdb.manager;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import main.java.com.playmore.dbobject.staticdb.GuildLogTemplate;
import main.java.com.playmore.dbobject.staticdb.dao.GuildLogTemplateDaoImpl;
import com.playmore.manager.AbstractManager;
/**
 * Do not touch! Close it Now! 
 */
@SuppressWarnings("serial")
public class GuildLogTemplateManager extends AbstractManager<java.lang.Integer,GuildLogTemplate> {

	private GuildLogTemplateManager(){
	}
	private static final GuildLogTemplateManager DEFAULT = new	GuildLogTemplateManager();
	public static GuildLogTemplateManager getDefault() {
		return DEFAULT;
	}
	@Override
	public Collection<GuildLogTemplate> queryAllFromDb() {
		return GuildLogTemplateDaoImpl.getDefault().queryAll();
	}
	@Override
	public java.lang.Integer getKey(GuildLogTemplate t) {
		return t.getId();
	}
}
