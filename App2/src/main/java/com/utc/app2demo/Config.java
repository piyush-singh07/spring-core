package com.utc.app2demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	@Bean(name="wel")
	@Scope(value="singleton")
	public WelcomeBean getWelcomeBean()
	{
		return new WelcomeBean();
	}
}
