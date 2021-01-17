package com.psl.training.oopdesign.college;
import java.util.*;
public class Person implements IPerson {
	
	String Name;
	int age;
	long adharNo;
	String address;
	String panNo;
	
	public Person() {
		
	}

	public Person(String Name,int age,long adharNo,String address) {
		
		this.Name=Name;
		this.age = age;
		this.adharNo=adharNo;
		this.address=address;
		
	}
	String getName()
	{
		return Name;
	}
	void setName(String Name)
	{
		this.Name=Name;
	}
	int getAge()
	{
		return age;
	}
	/*void setAge(int age)
	{
		this.age=age;
	}*/
	long getAdhar()
	{
		return adharNo;
	}
	void setAdhar(long adharNo)
	{
		this.adharNo =adharNo;
	}
	String getAddress()
	{
		return address;
	}
	void setAddress(String address)
	{
		this.address=address;
	}
	@Override
	public String getPanNumber() {
		return panNo;
	}
	@Override
	public void setPanNumber(String panNo) {
		this.panNo=panNo;
		
	}

	
	
	public void displayInfo() {
		
		System.out.println("Name is: "+getName());
		System.out.println("Age is: "+this.getAge() );
		System.out.println("Adhar Number is : "+this.getAdhar() );
		System.out.println("Address is : "+this.getAddress());
		if(panNo!=null)
			System.out.println("Pan Number is:"+getPanNumber());
		else
			System.out.println("No Pan Number");
			
			
		
		
	}

	
	
	
	
}
