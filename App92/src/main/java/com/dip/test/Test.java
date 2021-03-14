package com.dip.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dip.beans.Address;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/dip/config/config.xml");
		Address adBean = (Address)context.getBean("addrBean");
		Address adBean1 = (Address)context.getBean("adsBean");
		Address adBean2 = (Address)context.getBean("aBean");
		System.out.println(adBean);
		System.out.println(adBean1);
		System.out.println(adBean2);
	}
}
