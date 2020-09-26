package com.utc.app3demo;

import org.springframework.beans.factory.annotation.Value;

public class Child1 extends Parent {
	@Value("CHILD_VAR_I_AM_CHILD")
	private String child1_var;

	public String getChild1_var() {
		return child1_var;
	}

	public void setChild1_var(String child1_var) {
		this.child1_var = child1_var;
	}
	

}
