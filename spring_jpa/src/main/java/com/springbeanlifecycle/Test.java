package com.springbeanlifecycle;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

abstract class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*Studentdao s1=new Studentdao();
		s1.selectAllRows();*/
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Studentdao s1=ac.getBean("studentdao",Studentdao.class);
		s1.selectAllRows();
		
		
	}

}
