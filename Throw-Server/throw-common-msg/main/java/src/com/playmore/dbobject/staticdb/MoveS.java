package main.java.com.playmore.dbobject.staticdb;

import java.io.Serializable;
import com.playmore.database.DBFieldName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
/**
 * Do not touch! Close it Now!
 */
@SuppressWarnings("serial")
public class MoveS implements Serializable {

	@DBFieldName(fieldName="位移ID", isNullable="columnNoNulls")
	private int id;
	@DBFieldName(fieldName="位移方式（0通常移动，1加速移动，2瞬移，3瞬移之后再回到原处）", isNullable="columnNullable")
	private String moveType;
	@DBFieldName(fieldName="是否免疫控制（1是0否", isNullable="columnNullable")
	private int immuneControl;
	@DBFieldName(fieldName="是否免疫伤害（1是0否", isNullable="columnNullable")
	private int immuneHurt;
	@DBFieldName(fieldName="是否可被选中（1是0否", isNullable="columnNullable")
	private int isTarget;
	@DBFieldName(fieldName="位移位置（0任意，1身前，2身后）", isNullable="columnNullable")
	private String position;
	@DBFieldName(fieldName="位移位置参数", isNullable="columnNullable")
	private int moveParam;
	@DBFieldName(fieldName="朝向（0：朝向目标 1：背对目标 2：当前朝向）", isNullable="columnNullable")
	private int orientation;

	public MoveS(){
	}

	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setMoveType(String moveType) {
		this.moveType=moveType;
	}

	public String getMoveType() {
		return moveType;
	}

	public void setImmuneControl(int immuneControl) {
		this.immuneControl=immuneControl;
	}

	public int getImmuneControl() {
		return immuneControl;
	}

	public void setImmuneHurt(int immuneHurt) {
		this.immuneHurt=immuneHurt;
	}

	public int getImmuneHurt() {
		return immuneHurt;
	}

	public void setIsTarget(int isTarget) {
		this.isTarget=isTarget;
	}

	public int getIsTarget() {
		return isTarget;
	}

	public void setPosition(String position) {
		this.position=position;
	}

	public String getPosition() {
		return position;
	}

	public void setMoveParam(int moveParam) {
		this.moveParam=moveParam;
	}

	public int getMoveParam() {
		return moveParam;
	}

	public void setOrientation(int orientation) {
		this.orientation=orientation;
	}

	public int getOrientation() {
		return orientation;
	}

	public String toString() {
		return "MoveS [id=" + id + " ,moveType=" + moveType + " ,immuneControl=" + immuneControl + " ,immuneHurt=" + immuneHurt + " ,isTarget=" + isTarget + " ,position=" + position + " ,moveParam=" + moveParam + " ,orientation=" + orientation+ "]";
	}
}
