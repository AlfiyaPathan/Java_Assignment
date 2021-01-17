package com.psl.training.oopdesign.college;

public class Grad extends Student {

	String GradIn;double cgpa;
	public Grad(String Name,int age ,long adharNo,String address,String university,String prnNo,String dep,String GradIn,double cgpa) {
		super(Name,age,adharNo,address,university,prnNo,dep);
		this.GradIn=GradIn;
		this.cgpa=cgpa;
	
	}
	String getGradutedIn() {
		
		return GradIn;
	}
	double getCgpa()
	{
		return cgpa;
	}
	
	public void displayInfo()
	{
		System.out.println("********Its Graduated Student*********");
		super.displayInfo();
		System.out.println("Graduation Done In: "+getGradutedIn());
		System.out.println("CGPA: "+getCgpa());
	}
	
	
	
	
	}
