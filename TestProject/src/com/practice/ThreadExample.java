package com.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/*class counter {

	public int increment(int c) {
		c=c+1;
		return c;
	}

}*/

public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {

		StringBuilder s = new StringBuilder();
		int A = 61;
		int B = 56;
		int j = B/2;
		int reminderA = A % 2;
		int reminderB = B % 2;
		if (A > 2 && B > 2) {
			for (int i = A/2; i > 0; i--) {
				s.append("a");
				if (j != 0 && j > 0) {
					s.append("b");
					j--;
				}

			}
			if (reminderA != 0) {
				s.append("a");
			}
			if (reminderB != 0) {
				s.append("b");
			}
		}
		else if(A <2 && B > 2)
		{
			
		}
		System.out.println(s.toString());
		
	}
	
}
