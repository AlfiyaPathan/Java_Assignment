package com.psl.training.oopdesign.college;

public class GradFaculty extends Faculty {

	public GradFaculty(String Name,int age ,long adharNo,String address,String jobName,double salary,char status) {
		super(Name,age,adharNo,address,jobName,salary,status);
		
		
	}
	void TeachesToGrad()
	{
		System.out.println("Teaches to  Graduated Students ");
	}
	public void displayInfo()
	{
		System.out.println("******** Graduated Faculty*********");
		super.displayInfo();
		this.TeachesToGrad();
		
	}

}
