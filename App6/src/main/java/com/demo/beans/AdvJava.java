package com.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("adv_java")
public class AdvJava implements Course {
	
	@Value("c-22java")
	private String cid;
	@Value("ADV JAVA")
	private String cname;
	@Value("80 Days")
	private String cduration;
	
	

	@Override
	public Course getCourse() {
		
		return new AdvJava();
	}



	public String getCid() {
		return cid;
	}



	public void setCid(String cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getCduration() {
		return cduration;
	}



	public void setCduration(String cduration) {
		this.cduration = cduration;
	}
	
	
	
	

}
