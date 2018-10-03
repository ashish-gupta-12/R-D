package com.ashish.cust;

import com.ashish.bank.Insurance;
import com.ashish.bank.SavingsAccountV2;

public class Customer {

	public static void main(String[] args) {
		
		Insurance insuranceObj=null;
		insuranceObj = new SavingsAccountV2();
		System.out.println(insuranceObj.getInsuranceName("JeevanBema"));
		System.out.println(insuranceObj.getInsuranceAmount(100));
	}

}
