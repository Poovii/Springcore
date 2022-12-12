package springcore.DI;

public class Employee {
	
	private int empID;
	private String name;
	private float salary;
	private Department department;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int empID, String name, float salary) {
		super();
		this.empID = empID;
		this.name = name;
		this.salary = salary;
		this.department=department;
	}
	public Employee() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	

}