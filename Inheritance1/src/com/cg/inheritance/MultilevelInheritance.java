package com.cg.inheritance;

public class MultilevelInheritance {
	public static void main(String[] args) {

		SavingAccount savingAccount = new SavingAccount();
		savingAccount.getAccountDetails();
		savingAccount.getCurrentAccountDetails();
		savingAccount.getSavingAccountDetails();
	}

}
