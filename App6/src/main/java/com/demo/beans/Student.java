package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("s-101")
	private String sid;
	@Value("Yash Punjabi Boy")
	private String sname;
	
	
	@Autowired(required=true)
	@Qualifier("core_java")
	private Course scourse;

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

	public Course getScourse() {
		return scourse;
	}

	public void setScourse(Course scourse) {
		this.scourse = scourse;
	}
	
	public void getStudentDetails()
	{
		System.out.println("Student Details-----------");
		System.out.println("Student Id  :"+ sid);
		System.out.println("Student Name  :"+ sname);
		System.out.println("Course Details-----------");
		System.out.println("Course Id  :"+ scourse);
		System.out.println("Course Name  :"+ sname);
	}
	
	
	

}
