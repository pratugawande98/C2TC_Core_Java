package com.cg.application;

import com.cg.framework.Bankfactory;

public abstract class MMBankFactory extends Bankfactory
	{

		@Override
		public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried)
		{
			MMSavingAcc s=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
			return s;
		}

		@Override
		public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
		{
			MMCurrentAcc c=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
			return c;
		}

	}

