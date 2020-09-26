package com.utc.app3demo;

import org.springframework.beans.factory.annotation.Value;

public class Parent {
	@Value("PARENT_VAR_I_AM_PARENT")
	private String parent_var;

	public String getParent_var() {
		return parent_var;
	}

	public void setParent_var(String parent_var) {
		this.parent_var = parent_var;
	}
	

	

}
