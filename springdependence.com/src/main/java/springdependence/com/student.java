package springdependence.com;

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
	public ArrayList<String> getCertificates() {
		return certificates;
	}
	public void setCertificates(ArrayList<String> certificates) {
		this.certificates = certificates;
	}
	public student() {
		super();
	
	}
	@Override
	public String toString() {
		return "student [rollNo=" + rollNo + ", Name=" + Name + ", certificates=" + certificates + "]";
	}
	
	
	

}
