package com.persistent.training.assignment;

import java.util.Scanner;

class FindPosition {
	
	
	
	static int findPosition(int num,int number[])
	{
		int i=0;
		int flag=0;
		for(i=0;i<number.length;i++)
		{
			if(number[i]==num)
			{
				//return i+1;
				flag=1;
				break;
			}
			
		}
		if(flag==1)
			return i+1;
		else
			return i=0;
		
		
	}
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Numbers of number present in list:");
		int n = sc.nextInt();
		System.out.println("Give Number For list:");
		int num[]=new int[n];
		for(int i=0;i<n;i++)
		{
			num[i]=sc.nextInt();
			
		}
		System.out.println("Give Number To Find:");
		int Number = sc.nextInt();
		if(FindPosition.findPosition(Number, num)==0)
			System.out.println("Not Present In List");
		else
		System.out.println("The Position Of Number Is:"+FindPosition.findPosition(Number, num));
	}
	
	
	
}
