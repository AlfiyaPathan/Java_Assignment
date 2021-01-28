package com.persistent.training.medicine;
import java.util.Random;


public class MedicineTest {
	
	public static void main(String args[]) {
		
	Medicine m []=new Medicine[10];
	Random r = new Random();
	//Medicine me=new Medicine();
	
	for (int i = 0; i < m.length; i++) {
		int v =r.nextInt(3);
		if (v==0) {
			
			m[i]=new Ointment();
			m[i].displayLable("KJH Medicine", "Hinjewadi,Pune");
			System.out.println();
		}
		if (v==1) {
			
			m[i]=new Syrup();
			m[i].displayLable("MY Syrup", "Kharadi,Pune");
			System.out.println();
		}
		else {
	
			m[i]=new Tablet();
			m[i].displayLable("JM Tablets", "Aundh,Pune");
			System.out.println();
			}
		
		
	}
  }
	

}
