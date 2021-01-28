package com.psl.training.collection;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {
		
		List vehical = new ArrayList<String>();
		vehical.add("Vista");
		vehical.add("Swift");
		vehical.add("Honda");
		Employee e = new Employee(101,"ajp",vehical);
		e.display();

	}

}
