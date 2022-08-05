
package com.cg.framework;

public abstract class Bankfactory {
	abstract public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal,boolean isSalaried);
	abstract public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal,float creditLimit);
	public abstract void openAccount();
	public abstract void showAccount();
	public abstract void deposit();
	public abstract void withdrawal();
	public abstract boolean search(String ac_no);

}
