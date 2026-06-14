package com.practice;

abstract class A
{
	
	public abstract void test();
}

class B extends A {
	 public void test2()
	 {
		 
	 }

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}

class C 
{
	String a;
	String b;
}

 

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer a = 42 / 0;

		try {
			
			Integer b = 40 / 0;
		} finally {
			System.out.println("Check from finally");
		}*/
		
		C o= new C();
		o.a="test";
		System.out.println(o.a);
	}

}
