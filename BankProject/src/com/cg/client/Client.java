package com.cg.client;


import com.cg.application.MMBankfactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.Bankfactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;


public class Client {

	public static void main(String[] args) 
	{
		 Bankfactory s=new  MMBankFactory();
		Object obj=s.getNewSavingAcc(11,"Pratiksha", 14000, false);
		 System.out.println(obj);
		 SavingAcc n=new MMSavingAcc(101, "Akanksha", 10000f, true);
		 CurrentAcc c1= new MMCurrentAcc(102,"Yash", 10000, 20000);
		 System.out.println("Saving Account");
		 n.withdraw(1000);
		
		
     	 System.out.println("Current Account");
		 c1.withdraw(2000);c1.getAccBal();
		 System.out.println(s.getNewSavingAcc(103,"Kush", 15000, false));
		 System.out.println(s.getNewCurrentAcc(103,"Ankita", 20000, 23000f));
		 System.out.println(n);
		 System.out.println(c1);
		
		
	}

}