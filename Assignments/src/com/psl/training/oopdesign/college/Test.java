package com.psl.training.oopdesign.college;

public class Test {

	public static void main(String[] args) {
		
		Person p = new Student("Afiya",21,510346579,"aundh,pune","Pune university","T1098765","Computer");
		p.displayInfo();
		System.out.println();
		
		Person g = new Grad("Harsh",22,510346579,"aundh,pune","Pune university","T1098765","Computer","Computer Enginner",8.9);
		g.displayInfo();
		System.out.println();
		
		Person ug =new UnderGrad("ankita",21,510346579,"aundh,pune","Pune university","T1098765","Computer","First Year");
		ug.displayInfo();
		System.out.println();
		
		Person fact = new GradFaculty("Ravisha",30,510346579,"aundh,pune","Teacher",20000,'n');
		fact.setPanNumber("QEav65432");
		fact.displayInfo();
	
		System.out.println();
		
		Person fact2 = new UnderGradFactulty("Shrikant",21,510346579,"aundh,pune","Principal",20000,'y');
		fact2.displayInfo();
		System.out.println();
		
		
		
	}

}
