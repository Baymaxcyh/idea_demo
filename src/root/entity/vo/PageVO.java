package root.entity.vo;

import java.util.Date;

public class PageVO {
	private Integer stuid;
	private String stuname;
	private Date birthday;
	private Integer classid;
	private String classname;
	private Date createclass;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((classid == null) ? 0 : classid.hashCode());
		result = prime * result + ((classname == null) ? 0 : classname.hashCode());
		result = prime * result + ((createclass == null) ? 0 : createclass.hashCode());
		result = prime * result + ((stuid == null) ? 0 : stuid.hashCode());
		result = prime * result + ((stuname == null) ? 0 : stuname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PageVO other = (PageVO) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (classid == null) {
			if (other.classid != null)
				return false;
		} else if (!classid.equals(other.classid))
			return false;
		if (classname == null) {
			if (other.classname != null)
				return false;
		} else if (!classname.equals(other.classname))
			return false;
		if (createclass == null) {
			if (other.createclass != null)
				return false;
		} else if (!createclass.equals(other.createclass))
			return false;
		if (stuid == null) {
			if (other.stuid != null)
				return false;
		} else if (!stuid.equals(other.stuid))
			return false;
		if (stuname == null) {
			if (other.stuname != null)
				return false;
		} else if (!stuname.equals(other.stuname))
			return false;
		return true;
	}
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getClassid() {
		return classid;
	}
	public void setClassid(Integer classid) {
		this.classid = classid;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public Date getCreateclass() {
		return createclass;
	}
	public void setCreateclass(Date createclass) {
		this.createclass = createclass;
	}
	public PageVO(Integer stuid, String stuname, Date birthday, Integer classid, String classname, Date createclass) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.birthday = birthday;
		this.classid = classid;
		this.classname = classname;
		this.createclass = createclass;
	}
	public PageVO() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PageVO [" + (stuid != null ? "stuid=" + stuid + ", " : "")
				+ (stuname != null ? "stuname=" + stuname + ", " : "")
				+ (birthday != null ? "birthday=" + birthday + ", " : "")
				+ (classid != null ? "classid=" + classid + ", " : "")
				+ (classname != null ? "classname=" + classname + ", " : "")
				+ (createclass != null ? "createclass=" + createclass : "") + "]";
	}
	
}
