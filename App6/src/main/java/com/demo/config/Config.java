package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.demo.beans.Course;
import com.demo.beans.Student;

@ComponentScan("com.demo.beans")
public class Config {

	@Bean(name="std")
	public Student getStudent() {
		return new Student();
	}
	

	
}
