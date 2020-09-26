package com.app1.folder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean(name="stdbean")
	@Scope(value="singleton")
	public StudentBean getStudent() {
		return new StudentBean();
	}
	
	@Bean(name="addrbean")
	@Scope(value="singleton")
	public Address getAddress()
	{
		return new Address();
	}
	
}
