package com.app1.folder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Address bean1 = (Address) context.getBean("addrbean");
		StudentBean bean = (StudentBean) context.getBean("stdbean");
	
		bean1.setHno("h-111");
		bean1.setStreet("41 jounamal");
		bean1.setCity("hyd");
		bean.setSid("s-111");
		bean.setSname("Rahul");
		System.out.println(bean.sayHello());

	}

}
