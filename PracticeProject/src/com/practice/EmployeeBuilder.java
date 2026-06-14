package com.practice;

public class EmployeeBuilder {
	private String name;
	private String address;
	private int age;
	private String designation;

	public EmployeeBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public EmployeeBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public EmployeeBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public EmployeeBuilder setDesignation(String designation) {
		this.designation = designation;
		return this;
	}
	
	public Employee getEmployeeData()
	{
		return new Employee(name, address, age, designation);
	}


}

