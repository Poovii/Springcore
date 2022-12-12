package springcore.DI;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class di_main {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		 Employee employ1=ac.getBean("e1",Employee.class);
	        System.out.println(employ1);
	        
	      Employee employ2=ac.getBean("e2", Employee.class);
	      System.out.println(employ2);
	}

}
