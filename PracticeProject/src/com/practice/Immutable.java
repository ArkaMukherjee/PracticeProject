package com.practice;

public  class Immutable {
	
	/*private final String name;
	private final int age;
	
	public Immutable(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}

}

class main{
	public static void main(String arg[])
	{
		
	}*/
	
	
	public int fib(int n)
	{
		if(n==1||n==0)
		{
			System.out.println(1);
			return 0;
		}
		else 
			return fib(n-1)+fib(n-2);
		//System.out.println(fibonnacci(n-1)+fibonnacci(n-2));
	}
	
	public static void main(String arg[])
	{
		int n=10;
		int[] a= new int[10];
		a[0]=1;
		a[1]=1;
		System.out.println(a[0]);
		System.out.println(a[1]);
		for(int i=2;i<n;i++)
		{
			a[i]= a[i-1]+a[i-2];
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println(7%1);
	
	}
	
	
}
