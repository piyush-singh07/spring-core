package com.app1.folder;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentBean {
	private String sid;
	private String sname;
	//private Address address;
	
	
	@Autowired
	private Address address;
	
//	public Address getAddress() {
//		return address;
//	}
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public String sayHello() {
		return "Hello !!! "+sid+" "+sname+" "+address.getAddressOfStudent();
	}

}
