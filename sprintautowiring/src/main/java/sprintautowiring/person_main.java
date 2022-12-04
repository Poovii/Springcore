package sprintautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class person_main {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config1.xml");
		Person p=ac.getBean("person",Person.class);
		System.out.println(p);
		
	}

}
