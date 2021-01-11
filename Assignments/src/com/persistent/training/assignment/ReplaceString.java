package com.persistent.training.assignment;

import java.util.Scanner;

class ReplaceString {
	
public static void main(String args[]) {
		
		System.out.println("String is:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		System.out.println("Old String is:");
		String old = sc.nextLine(); 
		System.out.println("New String is:");
		String new1 = sc.nextLine(); 
		System.out.println("After Replacing String is:");
		System.out.println(str.replace(old, new1));
		
		
	
		
			
		
		
}
	

}
