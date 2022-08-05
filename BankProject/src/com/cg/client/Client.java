package com.cg.client;


import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.Bankfactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	
	public static void main(String[] args) 
	{
		 Bankfactory s=new MMBankFactory();
		 	Object obj=s.getNewSavingAcc (11, "Akanksha", 14000, false);
		 System.out.println(obj);
		 SavingAcc n=new MMSavingAcc (101, "Ankita", 10000f, true);
		 CurrentAcc c1= new MMCurrentAcc (102,"Pratiksha", 10000, 20000);
		 System.out.println("Saving Account:"+n);
		 n.withdraw(1000);
		
		System.out.println("Current Account:"+c1);
		 c1.withdraw(2000);c1.getAccBal();
		 System.out.println(s.getNewSavingAcc(103, "Yash", 15000, false));
		 System.out.println(s.getNewCurrentAcc(103, "Kush", 20000, 23000f));
		 System.out.println(n);
		 System.out.println(c1);
		
		
	}

}

