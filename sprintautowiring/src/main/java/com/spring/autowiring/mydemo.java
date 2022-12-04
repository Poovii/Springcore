package com.spring.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mydemo {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config2.xml");
		Department d=ac.getBean("department", Department.class);
		System.out.print(d);
		Employee e=ac.getBean("employee", Employee.class);
		System.out.println(e);
		
		
	}

}
