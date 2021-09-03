package root.entity.po;

import java.util.Date;

// getter setter
// tostring
// con
public class Student {
	private Integer stuid;
	private String stuname;
	private String tel;
	private String idcard;
	private Date birthday;
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Student(Integer stuid, String stuname, String tel, String idcard, Date birthday) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.tel = tel;
		this.idcard = idcard;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Student [" + (stuid != null ? "stuid=" + stuid + ", " : "")
				+ (stuname != null ? "stuname=" + stuname + ", " : "") + (tel != null ? "tel=" + tel + ", " : "")
				+ (idcard != null ? "idcard=" + idcard + ", " : "") + (birthday != null ? "birthday=" + birthday : "")
				+ "]";
	}
	public Student() {
	}
}
