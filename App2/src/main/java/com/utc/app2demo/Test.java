package com.utc.app2demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx= new AnnotationConfigApplicationContext(Config.class);
//		ctx.register(Config.class);
//		ctx.refresh();
		WelcomeBean bean= (WelcomeBean) ctx.getBean("wel");
		System.out.println(bean.greetMe());
		((AbstractApplicationContext) ctx).registerShutdownHook();
		
	}

}
