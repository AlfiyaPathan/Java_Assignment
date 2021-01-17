package com.psl.training.oopdesign.college;

import java.util.Date;

public class Faculty extends Person implements Salaried,Temporary{
	
	double salary;
	String jobName,tempJob;
	char status;
	public Faculty() {
		System.out.println("In Superclass Faculty default costructor");
	}

	public Faculty(String Name,int age ,long adharNo,String address,String jobName,double salary,char status) {
		
			super(Name,age,adharNo,address);
			this.jobName=jobName;
			this.salary=salary;
			this.status=status;
			
	}

	String getJob()
	{
		return jobName;
	}
	
	@Override
	public double getSalary() {
		return salary;
	}
	

	@Override
	public void tempJob() {
		if (this.status=='Y'||this.status=='y') {
			System.out.println("It has less salary ");
		}
		else
			System.out.println("Its has full salary");
		
	}
	
	char getStatus(){
		return status;
	}
	
	public void displayInfo()
	{
		
		super.displayInfo();
		System.out.println("Job Name : "+getJob());
		System.out.println("Salary is: "+getSalary());
		System.out.println("Is it temporary job ?: "+getStatus());
		this.tempJob();
		
	}

}
