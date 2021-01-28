package com.psl.training.collection;

import java.util.List;

public class Employee {

	int id ;
	String name;
	List <String>vehical;
	
	public Employee() {
		
	}

	public Employee(int id, String name, List<String> vehical) {
	
		this.id = id;
		this.name = name;
		this.vehical = vehical;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getVehical() {
		return vehical;
	}

	public void setVehical(List<String> vehical) {
		this.vehical = vehical;
	}
	public void display()
	{
		
		System.out.println("Name Of Employee: "+name);
		System.out.println("Id Of Employee: "+id);
		System.out.println("This employee has "+vehical.size()+" vehicals which are:");
		for (int i = 0; i < vehical.size(); i++) {
			System.out.println((i+1)+": "+vehical.get(i));
		}
		
	}
	
}
