package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class DrawS implements Serializable {

	@DBFieldName(fieldName="卡池ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="卡池名字", isNullable="columnNullable")
	private String name;
	@DBFieldName(fieldName="卡池类型", isNullable="columnNullable")
	private int type;
	@DBFieldName(fieldName="卡池排序", isNullable="columnNullable")
	private int order;
	@DBFieldName(fieldName="开始时间", isNullable="columnNullable")
	private int start;
	@DBFieldName(fieldName="结束时间", isNullable="columnNullable")
	private int end;
	@DBFieldName(fieldName="卡池内容", isNullable="columnNullable")
	private int content;
	@DBFieldName(fieldName="卡池保底库", isNullable="columnNullable")
	private int least;
	@DBFieldName(fieldName="卡池保底次数", isNullable="columnNullable")
	private int num;
	@DBFieldName(fieldName="单抽消耗道具1", isNullable="columnNullable")
	private String costOne1;
	@DBFieldName(fieldName="单抽消耗道具2", isNullable="columnNullable")
	private String costOne2;
	@DBFieldName(fieldName="十抽消耗道具1", isNullable="columnNullable")
	private String costTen1;
	@DBFieldName(fieldName="十抽消耗道具2", isNullable="columnNullable")
	private String costTen2;
	@DBFieldName(fieldName="是否计入抽卡任务累积", isNullable="columnNullable")
	private int accumulate;
	@DBFieldName(fieldName="暂时没有用", isNullable="columnNullable")
	private int wish;
	@DBFieldName(fieldName="心愿单几率（百分比）", isNullable="columnNullable")
	private int probability;
	@DBFieldName(fieldName="背景图", isNullable="columnNullable")
	private String imagebg;
	@DBFieldName(fieldName="英雄图", isNullable="columnNullable")
	private String imagehero;
	@DBFieldName(fieldName="字体图", isNullable="columnNullable")
	private String imagefont;
	@DBFieldName(fieldName="图标", isNullable="columnNullable")
	private int imageicon;
	@DBFieldName(fieldName="卡池首X抽保底池", isNullable="columnNullable")
	private int firstLeast;
	@DBFieldName(fieldName="保底次数", isNullable="columnNullable")
	private int firstLeastNum;

	public DrawS(){
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

	public void setType(int type) {
		this.type=type;
	}

	public int getType() {
		return type;
	}

	public void setOrder(int order) {
		this.order=order;
	}

	public int getOrder() {
		return order;
	}

	public void setStart(int start) {
		this.start=start;
	}

	public int getStart() {
		return start;
	}

	public void setEnd(int end) {
		this.end=end;
	}

	public int getEnd() {
		return end;
	}

	public void setContent(int content) {
		this.content=content;
	}

	public int getContent() {
		return content;
	}

	public void setLeast(int least) {
		this.least=least;
	}

	public int getLeast() {
		return least;
	}

	public void setNum(int num) {
		this.num=num;
	}

	public int getNum() {
		return num;
	}

	public void setCostOne1(String costOne1) {
		this.costOne1=costOne1;
	}

	public String getCostOne1() {
		return costOne1;
	}

	public void setCostOne2(String costOne2) {
		this.costOne2=costOne2;
	}

	public String getCostOne2() {
		return costOne2;
	}

	public void setCostTen1(String costTen1) {
		this.costTen1=costTen1;
	}

	public String getCostTen1() {
		return costTen1;
	}

	public void setCostTen2(String costTen2) {
		this.costTen2=costTen2;
	}

	public String getCostTen2() {
		return costTen2;
	}

	public void setAccumulate(int accumulate) {
		this.accumulate=accumulate;
	}

	public int getAccumulate() {
		return accumulate;
	}

	public void setWish(int wish) {
		this.wish=wish;
	}

	public int getWish() {
		return wish;
	}

	public void setProbability(int probability) {
		this.probability=probability;
	}

	public int getProbability() {
		return probability;
	}

	public void setImagebg(String imagebg) {
		this.imagebg=imagebg;
	}

	public String getImagebg() {
		return imagebg;
	}

	public void setImagehero(String imagehero) {
		this.imagehero=imagehero;
	}

	public String getImagehero() {
		return imagehero;
	}

	public void setImagefont(String imagefont) {
		this.imagefont=imagefont;
	}

	public String getImagefont() {
		return imagefont;
	}

	public void setImageicon(int imageicon) {
		this.imageicon=imageicon;
	}

	public int getImageicon() {
		return imageicon;
	}

	public void setFirstLeast(int firstLeast) {
		this.firstLeast=firstLeast;
	}

	public int getFirstLeast() {
		return firstLeast;
	}

	public void setFirstLeastNum(int firstLeastNum) {
		this.firstLeastNum=firstLeastNum;
	}

	public int getFirstLeastNum() {
		return firstLeastNum;
	}

	public String toString() {
		return "DrawS [id=" + id + " ,name=" + name + " ,type=" + type + " ,order=" + order + " ,start=" + start + " ,end=" + end + " ,content=" + content + " ,least=" + least + " ,num=" + num + " ,costOne1=" + costOne1 + " ,costOne2=" + costOne2 + " ,costTen1=" + costTen1 + " ,costTen2=" + costTen2 + " ,accumulate=" + accumulate + " ,wish=" + wish + " ,probability=" + probability + " ,imagebg=" + imagebg + " ,imagehero=" + imagehero + " ,imagefont=" + imagefont + " ,imageicon=" + imageicon + " ,firstLeast=" + firstLeast + " ,firstLeastNum=" + firstLeastNum+ "]";
	}
}
