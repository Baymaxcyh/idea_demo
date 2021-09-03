package root.entity.po;

import java.util.Date;

public class Classinfo {
	private Integer classid;
	private String classname;
	private String tra;
	private Date createclass;
	public Classinfo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Classinfo [" + (classid != null ? "classid=" + classid + ", " : "")
				+ (classname != null ? "classname=" + classname + ", " : "") + (tra != null ? "tra=" + tra + ", " : "")
				+ (createclass != null ? "createclass=" + createclass : "") + "]";
	}
	public Classinfo(Integer classid, String classname, String tra, Date createclass) {
		super();
		this.classid = classid;
		this.classname = classname;
		this.tra = tra;
		this.createclass = createclass;
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
	public String getTra() {
		return tra;
	}
	public void setTra(String tra) {
		this.tra = tra;
	}
	public Date getCreateclass() {
		return createclass;
	}
	public void setCreateclass(Date createclass) {
		this.createclass = createclass;
	}
}
