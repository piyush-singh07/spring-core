package com.dip.beans;

public class HelloBean {
	
	static {
		System.out.println("Bean Loading");
	}
	
	public HelloBean()
	{
		System.out.println("Bean Created");
	}
	
	public String getMessage()
	{
		return "HELLO User!!";
	}

}
