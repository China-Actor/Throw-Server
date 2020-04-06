package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;

/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class TimePeakMapConfig implements Serializable {

	private int id;
	private String mapText;

	public TimePeakMapConfig(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setMapText(String mapText) {
		this.mapText=mapText;
	}

	public String getMapText() {
		return mapText;
	}

	public String toString() {
		return "TimePeakMapConfig [id=" + id + " ,mapText=" + mapText+ "]";
	}
}
