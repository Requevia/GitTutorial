package org.avr.pojo;

import java.util.Date;

public class Person {
//	private String name;
	private String nameFirst;
	private String nameLast;
	
	private Date dob;
	private Address addr;
//	public String getName() { return name; }
//	public void setName(String name) { this.name = name; }
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	public String getNameLast() {
		return nameLast;
	}
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}

}
