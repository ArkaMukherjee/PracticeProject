package com.practice;

public class BuilderPatterTest {
	
	public static void main(String arg[])
	{
		Employee e=new EmployeeBuilder().setName("Arka").setAge(28).getEmployeeData();
		System.out.println(e);


				
	}

}
