package com.cg.inheritance;

public class Hierarchical {
	public static void main(String[] args) {
		HomeLoan homeLoan = new HomeLoan();
		CarLoan carLoan = new CarLoan();
		PersonalLoan personalLoan = new PersonalLoan();
		homeLoan.getHomeLoanDetails();
		carLoan.getCarLoanDetails();
		personalLoan.getPersonalLoanDetails();
	}

}
