package com.psl.training.oopdesign.college;

public class UnderGrad extends Student{
	
	String year;int cgpa;
	public UnderGrad(String Name,int age ,long adharNo,String address,String university,String prnNo,String dep,String year) {
		super(Name,age,adharNo,address,university,prnNo,dep);
		this.year=year;
		
	}
	String getYear() {
		
		return year;
	}
	
	public void displayInfo()
	{
		System.out.println("********Its not graduated student*********");
		super.displayInfo();
		System.out.println("Which Year Of Course: "+getYear());
	}
	

}
