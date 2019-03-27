package com.qin.PaymentSystem.entity;

public class Stu {
	private int id;
	private int sno;
	private String sname;
	private int sgender;
	private int sclass;
	private String spassword;
	private String smajor;
	private Boolean deleted;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSgender() {
		return sgender;
	}
	public void setSgender(int sgender) {
		this.sgender = sgender;
	}
	public int getSclass() {
		return sclass;
	}
	public void setSclass(int sclass) {
		this.sclass = sclass;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	public String getSmajor() {
		return smajor;
	}
	public void setSmajor(String smajor) {
		this.smajor = smajor;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", sno=" + sno + ", sname=" + sname + ", sgender=" + sgender + ", sclass=" + sclass
				+ ", spassword=" + spassword + ", smajor=" + smajor + ", deleted=" + deleted + "]";
	}
	
}
