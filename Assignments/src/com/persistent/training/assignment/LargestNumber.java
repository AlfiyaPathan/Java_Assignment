package com.persistent.training.assignment;

import java.util.Scanner;

class CalMax{
 
	public static int x,y,z;
static int calMax(int x,int y,int z) {
	
	
	int temp;
	
	if(x>y||x==y) 
	 temp =x;
	else
		temp=y;
	 if(temp>z)
		 return temp;
	 else
		 return z;
	
	
}
}
class LargestNumber {
	
	public static void main(String args[]) {
		
		System.out.println("Give Three Numbers:");
		Scanner sc = new Scanner(System.in);
		int r =sc.nextInt();
		int t =sc.nextInt();
		int v =sc.nextInt();
		System.out.println("Largest Number is:"+ CalMax.calMax(r, t, v));
		
		
		
	}

}
