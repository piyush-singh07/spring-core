package com.dip.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dip.beans.HelloBean;

public class Test {
	
	public static void main(String[] args) {
	XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/dip/config/config.xml"));
	HelloBean bean = (HelloBean)factory.getBean("helloBean");
	System.out.println(bean.getMessage());
	}

}
