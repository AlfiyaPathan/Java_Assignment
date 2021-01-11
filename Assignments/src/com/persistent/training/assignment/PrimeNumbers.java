package com.persistent.training.assignment;

import java.util.Scanner;

class PrimeNumbers {
	
	void printPrime(int maxVal)
	{
		System.out.print("Prime Numbers:  ");
		for (int i = 2; i <  maxVal; i++) {
			
			if(IsPrime.isPrimeNumber(i)==true) {
				System.out.print(i+" ");
			}
				
			}
			
		}
		
		
	
	
public static void main(String args[]) {
		
		System.out.println("Range is");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt(); 
		PrimeNumbers obj = new PrimeNumbers();
		obj.printPrime(range);
		
		
	
		
			
		
		
}

}
