package com.utc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.utc.beans.College;
import com.utc.beans.MathTeacher;
import com.utc.beans.Principal;
import com.utc.beans.Teacher;

@Configuration
@ComponentScan(basePackages= "com.utc.beans")
public class ConfigApp {

/*	@Bean 
	public Principal getPrincipal()
	{
		return new Principal();
	}
	
	@Bean
	public Teacher mathTeacher()
	{
		return new MathTeacher();
	}
	
	@Bean(name="colBean") 
	public College getCollege()
	{
		College college = new College();
		college.setPrincipal(getPrincipal());
		college.setTeacher(mathTeacher());
		return college;
	}*/
	
	
}
