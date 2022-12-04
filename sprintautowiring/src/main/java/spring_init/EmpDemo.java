package spring_init;

//import com.spring.autowiring.Department;
import com.spring.autowiring.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {

	public static void main(String[] args) {
	
		ApplicationContext ac=new ClassPathXmlApplicationContext("config2.xml");
		/*Department d=ac.getBean("department", Department.class);
		System.out.print(d);*/
		Employee e1=ac.getBean("e1", Employee.class);
		System.out.println(e1);
		Employee e2=ac.getBean("e2", Employee.class);
		System.out.println(e2);
		((AbstractApplicationContext) ac).close();
		
		
	}

}
