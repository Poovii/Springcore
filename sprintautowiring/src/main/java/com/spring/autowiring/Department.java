package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 

public class Department {
	@Value("10")
	
	private int deptNo;
	@Value("IT")
	private String name;
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department(int deptNo, String name) {
		super();
		this.deptNo = deptNo;
		this.name = name;
	}
	public Department() {
		super();
		
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", name=" + name + "]";
	}
	
	

}
