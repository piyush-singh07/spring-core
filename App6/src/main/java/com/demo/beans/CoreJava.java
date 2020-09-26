package com.demo.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Qualifier("core_java")
public class CoreJava implements Course {
	
	@Value("c-11java")
	private String cid;
	@Value("CORE JAVA")
	private String cname;
	@Value("40 Days")
	private String cduration;
	
	public CoreJava(String cid, String cname, String cduration) {
		
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



	@Override
	public Course getCourse(String cid, String cname, String cduration) {
		
		return new CoreJava(cid,cname,cduration);
	}
	
	
	
	

}
