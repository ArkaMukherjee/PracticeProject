package com.practice;


public class Employee {
	
	
	private String name;
	private String address;
	private int age;
	private String designation;
	public Employee(String name, String address, int age, String designation) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.designation = designation;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", age=" + age + ", designation=" + designation
				+ "]";
	}
}
