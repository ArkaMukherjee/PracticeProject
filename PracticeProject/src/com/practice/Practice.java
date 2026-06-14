package com.practice;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice {
	
	public static void main(String arg[])
	{
		
		/*try {
			Practice p= new Practice();
			p.test();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

		String numbers= "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
		String[] arr= numbers.split(" ");
		int[] intArray=Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray();
		for(int i=0;i<intArray.length;i++)
		{
			for(int j=0;j<intArray.length-i-1;j++)
			{
				if(intArray[j]>intArray[j+1])
				{
					int temp=intArray[j];
					intArray[j]=intArray[j+1];
					intArray[j+1]=temp;
				}
			}
		}
		String finalString=intArray[arr.length-1]+" "+intArray[0];

		System.out.println(finalString);

	
	}
	
	public   void test() throws MyException
	{
		if(true)
		{
			throw new MyException("Exception has been thrown");
		}
	}
	
	
	class MyException extends Exception
	{
		MyException(String msg)
		{
			super(msg);
		}
		
		MyException(String msg,Throwable e)
		{
			super(msg,e);
		}
	}

}
