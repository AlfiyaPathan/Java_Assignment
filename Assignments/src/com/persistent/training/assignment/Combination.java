package com.persistent.training.assignment;

import java.util.Scanner;

class Combination {

	
	static void findCombination(String str ,String result) {
		
		
		if (str.length() == 0) { 
            System.out.print(result + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            
            char ch = str.charAt(i); 
  
           
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
           
            findCombination(ros, result + ch); 
        } 
		
		
		
	}
	public static void main(String args[]) {
	
		System.out.println("String is:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		findCombination(str ,"");
		
		
		//int n = str.length();
		/*int fact=1;
		for (int k=1;k<=n;k++)
		{
			fact= fact*k;
		}
		//System.out.print(fact);
		char str1[]=new char[n+1];
		char str2[]=new char[n+1];
		for(int i=0;i<n;i++) {
		 str1[i]=str.charAt(i);
		}
		//System.out.println(str1);
		for(int i=0;i<fact;i++)
		{
			System.out.println("Started");
			//int j, k=0;
			for( int k=0;k<=n;k++)
			{
				for( int j=k+1;j<=n;k++)
				{
				/*if(j==n)
				{
					j=0;
					continue;
					//str2[k]=str1[j];
				}
				str2[k]=str1[j];
				System.out.println(k+" "+(j));*/
				
				//System.out.println(str2[k]);
			
			
		}
		
	
}
