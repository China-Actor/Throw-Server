package com.playmore.dbobject.gameserver;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MazeTemplateData implements Serializable {

	private int id;
	@DBFieldName(fieldName="迷宫章节", isNullable="columnNullable")
	private int stageType;
	@DBFieldName(fieldName="迷宫模板", isNullable="columnNullable")
	private String mazeTemplate;
	@DBFieldName(fieldName="创建时间", isNullable="columnNullable")
	private String createDate;

	public MazeTemplateData(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setStageType(int stageType) {
		this.stageType=stageType;
	}

	public int getStageType() {
		return stageType;
	}

	public void setMazeTemplate(String mazeTemplate) {
		this.mazeTemplate=mazeTemplate;
	}

	public String getMazeTemplate() {
		return mazeTemplate;
	}

	public void setCreateDate(String createDate) {
		this.createDate=createDate;
	}

	public String getCreateDate() {
		return createDate;
	}

	public String toString() {
		return "MazeTemplateData [id=" + id + " ,stageType=" + stageType + " ,mazeTemplate=" + mazeTemplate + " ,createDate=" + createDate+ "]";
	}
}
