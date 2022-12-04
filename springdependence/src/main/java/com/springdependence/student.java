package com.springdependence;

import java.util.ArrayList;

public class student {
	
	
	
	private int rollNo;
	private String Name;
	ArrayList<String>certificates;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public student() {
		super();
	}
	public student(int rollNo, String name, ArrayList<String> certificates) {
		super();
		this.rollNo = rollNo;
		this.Name = name;
		this.certificates = certificates;
	}
	
	public ArrayList<String> getCertificates() {
		return certificates;
	}
	public void setCertificates(ArrayList<String> certificates) {
		this.certificates = certificates;
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", Name=" + Name + ", certificates=" + certificates + "]";
	}
	
	
	

}
