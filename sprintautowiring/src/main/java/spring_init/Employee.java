package spring_init;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{
	
	private int empId;
	private String name;
	private double salary;
	private Department department;
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.department=department;
	}
	public Employee() {
		super();
		//TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
/*	@PostConstruct
	public void init() {
		System.out.println("Employee added....");
		
	}*/
	//@PreDestroy
	public void destroy() {
		System.out.println("Employee Removed...");
	}
	
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Employee Removed...");
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
	//by programatic approcah
	/* Employee implements initializingBean,disposalBean*/


}
