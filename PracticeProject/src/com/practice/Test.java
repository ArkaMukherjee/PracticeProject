package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

final class Test{  
	 int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }  
	     
	 public static void main(String args[]){

		 AtomicInteger i = new AtomicInteger(10);
/*		 Test op=new Test();  
	  
	   System.out.println("before change "+op.data);  
	   op.change(500);  
	   System.out.println("after change "+op.data);
	   Collections.sort(new ArrayList<String>());
	   
	   Map<String,String> tree= new TreeMap<String,String>();
	   tree.put("A","Raghu");
	   tree.put("Z", "Hero");
	   tree.put("B", "value");
	   tree.forEach((k,v)->{
		   System.out.println("Key is: "+k +" and value is  "+v);
	   });*/
	   
		 List l= new ArrayList() ;
		 l.add(5);
		 l.add(4);
		 l.add(2);
		 l.add("Arka");
		 System.out.println(l);
		 
		 
		 int a=4 ;
		 int b=3;
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("a"+a +"  b:"+b);
				 

	 }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (data != other.data)
			return false;
		return true;
	}  
	}  

interface A
{
	String value="";
	void test();
}

