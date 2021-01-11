package com.persistent.training.assignment;

import java.util.Scanner;

class MakeReverse {
	
	
static String makeReverse(String Str) {
		char[] string = Str.toCharArray();
		String reverse = "";
		char[] str= new char[Str.length()];
		for(int i=string.length-1, j=0; i>=0 && j<string.length; i--,j++)
		{   
						str[j]=string[i];
			
			
		}
		reverse = String.valueOf(str);
		//System.out.print(reverse);
		return reverse;
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Give Sentence to reverse: ");
		String sentence = sc.nextLine();
		System.out.print("Reverse of Sentence is: "+MakeReverse.makeReverse(sentence));
		
		
	}

}
