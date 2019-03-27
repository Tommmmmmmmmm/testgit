package com.qin.PaymentSystem.entity;

public class Teacher {
	private int id;
	private int tno;
	private String tname;
	private int tgender;
	private String tpassword;
	private Boolean deleted;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public int getTgender() {
		return tgender;
	}
	public void setTgender(int tgender) {
		this.tgender = tgender;
	}
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", tno=" + tno + ", tname=" + tname + ", tgender=" + tgender + ", tpassword="
				+ tpassword + ", deleted=" + deleted + "]";
	}
	
}
