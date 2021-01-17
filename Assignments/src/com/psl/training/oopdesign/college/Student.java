package com.psl.training.oopdesign.college;

import java.util.Date;

public class Student extends Person{
	
	String university,prnNo,dep;
	public Student() {
		System.out.println("In Superclass student default costructor");
	}

	public Student(String Name,int age ,long adharNo,String address,String university,String prnNo,String dep) {
		super(Name,age,adharNo,address);
		this.university=university;
		this.prnNo=prnNo;
		this.dep =dep;
	}
	
	String getUni() {
		return this.university;
	}
	String getDep() {
		return dep;
	}
	String getPrn() {
		return prnNo;
	}
	public void displayInfo()
	{
		
		super.displayInfo();
		System.out.println("University of this student is: "+getUni());
		System.out.println("Department is: "+getDep());
		System.out.println("University Enrollment of this student is: "+getPrn());
	}
	

}
