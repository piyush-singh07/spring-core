package com.utc.app3demo;

import org.springframework.context.annotation.Bean;

public class Config {
	
	@Bean//(name="child")
	public Child1 getChild() {
		return new Child1();
	}

}
