package springcoreIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class spring {

	public static void main(String[] args) {
		/*Airtel a1=new Airtel();
		a1.calling();
		a1.data();
		
		jio j=new jio();
		j.calling();
		j.data();*/
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Airtel a1=ac.getBean("airtel",Airtel.class);
		jio j=ac.getBean("Jio",jio.class);
		a1.calling();
		a1.data();
		j.calling();
		j.data(); 
		
	}

}
