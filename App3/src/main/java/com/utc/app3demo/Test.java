package com.utc.app3demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
		Child1 bean= (Child1) ctx.getBean("getChild");
		System.out.println(bean.getParent_var());
		System.out.println(bean.getChild1_var());
		
		

	}

}
