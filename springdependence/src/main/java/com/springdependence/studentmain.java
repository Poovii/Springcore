package com.springdependence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentmain {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        student s1=ac.getBean("st",student.class);
        System.out.println(s1);
        

        s1=ac.getBean("st1",student.class);
        System.out.println(s1);
        
        s1=ac.getBean("st2",student.class);
        System.out.println(s1);
        
	}

}
