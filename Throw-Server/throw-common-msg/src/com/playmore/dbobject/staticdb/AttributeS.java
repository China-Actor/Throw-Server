package com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class AttributeS implements Serializable {

	@DBFieldName(fieldName="等级", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="普通", isNullable="columnNullable")
	private int quality1;
	@DBFieldName(fieldName="稀有", isNullable="columnNullable")
	private int quality2;
	@DBFieldName(fieldName="稀有+", isNullable="columnNullable")
	private int quality3;
	@DBFieldName(fieldName="精英", isNullable="columnNullable")
	private int quality4;
	@DBFieldName(fieldName="精英+", isNullable="columnNullable")
	private int quality5;
	@DBFieldName(fieldName="史诗", isNullable="columnNullable")
	private int quality6;
	@DBFieldName(fieldName="史诗+", isNullable="columnNullable")
	private int quality7;
	@DBFieldName(fieldName="传说", isNullable="columnNullable")
	private int quality8;
	@DBFieldName(fieldName="传说+", isNullable="columnNullable")
	private int quality9;
	@DBFieldName(fieldName="神话", isNullable="columnNullable")
	private int quality10;
	@DBFieldName(fieldName="神话1星", isNullable="columnNullable")
	private int quality11;
	@DBFieldName(fieldName="神话2星", isNullable="columnNullable")
	private int quality12;
	@DBFieldName(fieldName="神话3星", isNullable="columnNullable")
	private int quality13;
	@DBFieldName(fieldName="神话4星", isNullable="columnNullable")
	private int quality14;
	@DBFieldName(fieldName="神话5星", isNullable="columnNullable")
	private int quality15;

	public AttributeS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setQuality1(int quality1) {
		this.quality1=quality1;
	}

	public int getQuality1() {
		return quality1;
	}

	public void setQuality2(int quality2) {
		this.quality2=quality2;
	}

	public int getQuality2() {
		return quality2;
	}

	public void setQuality3(int quality3) {
		this.quality3=quality3;
	}

	public int getQuality3() {
		return quality3;
	}

	public void setQuality4(int quality4) {
		this.quality4=quality4;
	}

	public int getQuality4() {
		return quality4;
	}

	public void setQuality5(int quality5) {
		this.quality5=quality5;
	}

	public int getQuality5() {
		return quality5;
	}

	public void setQuality6(int quality6) {
		this.quality6=quality6;
	}

	public int getQuality6() {
		return quality6;
	}

	public void setQuality7(int quality7) {
		this.quality7=quality7;
	}

	public int getQuality7() {
		return quality7;
	}

	public void setQuality8(int quality8) {
		this.quality8=quality8;
	}

	public int getQuality8() {
		return quality8;
	}

	public void setQuality9(int quality9) {
		this.quality9=quality9;
	}

	public int getQuality9() {
		return quality9;
	}

	public void setQuality10(int quality10) {
		this.quality10=quality10;
	}

	public int getQuality10() {
		return quality10;
	}

	public void setQuality11(int quality11) {
		this.quality11=quality11;
	}

	public int getQuality11() {
		return quality11;
	}

	public void setQuality12(int quality12) {
		this.quality12=quality12;
	}

	public int getQuality12() {
		return quality12;
	}

	public void setQuality13(int quality13) {
		this.quality13=quality13;
	}

	public int getQuality13() {
		return quality13;
	}

	public void setQuality14(int quality14) {
		this.quality14=quality14;
	}

	public int getQuality14() {
		return quality14;
	}

	public void setQuality15(int quality15) {
		this.quality15=quality15;
	}

	public int getQuality15() {
		return quality15;
	}

	public String toString() {
		return "AttributeS [id=" + id + " ,quality1=" + quality1 + " ,quality2=" + quality2 + " ,quality3=" + quality3 + " ,quality4=" + quality4 + " ,quality5=" + quality5 + " ,quality6=" + quality6 + " ,quality7=" + quality7 + " ,quality8=" + quality8 + " ,quality9=" + quality9 + " ,quality10=" + quality10 + " ,quality11=" + quality11 + " ,quality12=" + quality12 + " ,quality13=" + quality13 + " ,quality14=" + quality14 + " ,quality15=" + quality15+ "]";
	}
}
