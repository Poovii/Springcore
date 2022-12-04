package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	@Value("101")
	private int empNo;
	@Value("Poovi")
	private String empName;
	@Value("50000")
	private float salary;
	//@Value("10""IT")
	private Department department;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee() {
		super();
	}
	public Employee(int empNo, String empName, float salary, Department department) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	

}
