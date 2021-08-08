package com.spring.xmlautowire;

public class Student {

	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(Address address) {
		super();
		this.address = address;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
	
	
}
