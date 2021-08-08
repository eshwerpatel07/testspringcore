package com.spring.stereotypeannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("s1")
public class Student {

	@Value("Eshwer")
	String sname;
	
	@Value("Indore")
	String city;
	
	@Value("#{temp}")
	List<String> address; 
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", city=" + city + "]";
	}
	
}
