package com.persistent.training.assignment;

import java.util.Scanner;

class FindPrimeBetRange {

	
	void printPrimeBetRange(int minVal ,int maxVal)
	{
		System.out.print("Prime Numbers:  ");
		for (int i = minVal; i <  maxVal; i++) {
			
			if(IsPrime.isPrimeNumber(i)==true) {
				System.out.print(i+" ");
			}
				
			}
			
		}
public static void main(String args[]) {
		
		System.out.println("Min Range is:");
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt(); 
		System.out.println("Max Range is:");
		int max = sc.nextInt(); 
		FindPrimeBetRange obj = new FindPrimeBetRange();
		obj.printPrimeBetRange(min,max);
		
		
	
		
			
		
		
}
	
	
	
}


