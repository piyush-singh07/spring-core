package com.utc.app2demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;

public class WelcomeBean implements InitializingBean, DisposableBean {
	
	@Value("Hello!!!! There how are you?")
	private String message;
	

	public String getMessage() {
		System.out.println("getter method");
		return message;
	}

	public void setMessage(String message) {
		System.out.println("setter method");
		this.message = message;
	}

	public void destroy() throws Exception {
		System.out.println("destroy method");
		

	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Set Property Method");
		

	}

	public String greetMe() {
		return "YOUR GREETINGS ARE: "+message;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("postconstruct method()");
		
	}
	@PreDestroy
	public void destroy1() {
		System.out.println("predestroy method()");
	}
	
}
