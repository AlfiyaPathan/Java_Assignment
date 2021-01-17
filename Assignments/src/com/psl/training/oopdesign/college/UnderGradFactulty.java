package com.psl.training.oopdesign.college;

public class UnderGradFactulty extends Faculty {
	
	public UnderGradFactulty(String Name,int age ,long adharNo,String address,String jobName,int salary,char status) {
		super(Name,age,adharNo,address,jobName,salary,status);
		
		
	}
	void TeachesToUnderGrad()
	{
		System.out.println("Teaches to Undergraduated college Students ");
	}
	public void displayInfo()
	{
		System.out.println("********Under Graduated Faculty*********");
		super.displayInfo();
		this.TeachesToUnderGrad();
		
	}

}
