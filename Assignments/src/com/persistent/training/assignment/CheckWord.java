package com.persistent.training.assignment;

import java.util.Scanner;




class CheckWord {

	static int check(String Sentence,String word) {
		
		String tmp[]=Sentence.split(" ");
		int i,count=0;
		for( i=0;i<tmp.length;i++) {
			if(word.equals(tmp[i]))
				count++;
			
		}
		return count;
	}
	
	public static void main(String args[]) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Give Sentence: ");
		String sentence = sc.nextLine();
		System.out.print("Give Word: ");
		String word = sc.next();
		System.out.print("Occurance of word count is: "+CheckWord.check(sentence,word));
		
		
	}
	
}
