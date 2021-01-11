package com.persistent.training.assignment;

import java.util.Scanner;

class IsPrime {
	
	static boolean isPrimeNumber(int Num)
	{
		
		int m=0,flag=0;
		m=Num/2;
		for(int j=2;j<=m;j++)
		{
			if(Num%j==0) {
				flag=1;
				break;
			}}
			if(flag==0) {
				return true;
				
				}
			else
				return false;
	}

	
	
public static void main(String args[]) {
		
		System.out.print("Number is:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 
		//PrimeNumbers obj = new PrimeNumbers();
		//obj.isPrimeNumber(number);
		System.out.print(number+" "+"Is Prime Number: "+IsPrime.isPrimeNumber(number));
		
		
	
}
}
