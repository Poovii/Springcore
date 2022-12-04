package sprintautowiring;

public class Person {
	


	private String name;
	private String contactNo;
	
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress1() {
		return address;
	}

	public void setAddress(Address address1) {
		this.address = address;
	}
	public Person(String name, String contactNo, Address address1) {
		super();
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
	}
	public Person() {
		super();
		
	}



	@Override
	public String toString() {
		return "person [name=" + name + ", contactNo=" + contactNo + ", address=" + address + "]";
	}
	

}
