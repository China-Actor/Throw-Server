package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DailyrewardS implements Serializable {

	@DBFieldName(fieldName="悬赏任务ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="悬赏任务名称", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="时长（小时）", isNullable="columnNullable")
	private int time;
	@DBFieldName(fieldName="类型(1个人2团队）", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="品质", isNullable="columnNullable")
	private int quality;
	@DBFieldName(fieldName="星级", isNullable="columnNullable")
	private int star;
	@DBFieldName(fieldName="奖励道具类型", isNullable="columnNullable")
	private int dropType;
	@DBFieldName(fieldName="奖励道具", isNullable="columnNullable")
	private int dropValue;
	@DBFieldName(fieldName="数量", isNullable="columnNullable")
	private int dropNum;
	@DBFieldName(fieldName="权重", isNullable="columnNullable")
	private int percent;
	@DBFieldName(fieldName="出现等级", isNullable="columnNullable")
	private int appear;
	@DBFieldName(fieldName="消失等级", isNullable="columnNullable")
	private int disappear;
	@DBFieldName(fieldName="悬赏任务名称", isNullable="columnNullable")
	private String desc;
	@DBFieldName(fieldName="派遣英雄数量", isNullable="columnNullable")
	private int heroNum;
	@DBFieldName(fieldName="要求品质", isNullable="columnNullable")
	private int heroQuality;
	@DBFieldName(fieldName="要求达到品质的数量", isNullable="columnNullable")
	private int heroQualityNum;

	public DailyrewardS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setTime(int time) {
		this.time=time;
	}

	public int getTime() {
		return time;
	}

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setQuality(int quality) {
		this.quality=quality;
	}

	public int getQuality() {
		return quality;
	}

	public void setStar(int star) {
		this.star=star;
	}

	public int getStar() {
		return star;
	}

	public void setDropType(int dropType) {
		this.dropType=dropType;
	}

	public int getDropType() {
		return dropType;
	}

	public void setDropValue(int dropValue) {
		this.dropValue=dropValue;
	}

	public int getDropValue() {
		return dropValue;
	}

	public void setDropNum(int dropNum) {
		this.dropNum=dropNum;
	}

	public int getDropNum() {
		return dropNum;
	}

	public void setPercent(int percent) {
		this.percent=percent;
	}

	public int getPercent() {
		return percent;
	}

	public void setAppear(int appear) {
		this.appear=appear;
	}

	public int getAppear() {
		return appear;
	}

	public void setDisappear(int disappear) {
		this.disappear=disappear;
	}

	public int getDisappear() {
		return disappear;
	}

	public void setDesc(String desc) {
		this.desc=desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setHeroNum(int heroNum) {
		this.heroNum=heroNum;
	}

	public int getHeroNum() {
		return heroNum;
	}

	public void setHeroQuality(int heroQuality) {
		this.heroQuality=heroQuality;
	}

	public int getHeroQuality() {
		return heroQuality;
	}

	public void setHeroQualityNum(int heroQualityNum) {
		this.heroQualityNum=heroQualityNum;
	}

	public int getHeroQualityNum() {
		return heroQualityNum;
	}

	public String toString() {
		return "DailyrewardS [id=" + id + " ,name=" + name + " ,time=" + time + " ,type=" + type + " ,quality=" + quality + " ,star=" + star + " ,dropType=" + dropType + " ,dropValue=" + dropValue + " ,dropNum=" + dropNum + " ,percent=" + percent + " ,appear=" + appear + " ,disappear=" + disappear + " ,desc=" + desc + " ,heroNum=" + heroNum + " ,heroQuality=" + heroQuality + " ,heroQualityNum=" + heroQualityNum+ "]";
	}
}
