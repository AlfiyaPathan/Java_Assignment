package com.persistent.training.assignment;

class RectangularArray {
	
	public static void main(String arg[]) {
		
		int array[][]= new int[13][13];
		System.out.print("       :");
		for (int x=1;x<=12;x++)
		{
			System.out.print(x+"     ");
		}
		System.out.println();
		for(int i=0;i<12;i++) {
			System.out.print("Row "+i+ (i<10?"  "+":":" "+":"));
			for(int j=0;j<12;j++)
			{
				array[i][j]=(i+1)*(j+1);
				System.out.print(array[i][j]+(array[i][j]<10?"   ":"  ")+(array[i][j]>=100?" ":"  "));
				
			}
			System.out.println();
		}
			
		
		
	}
	

}
