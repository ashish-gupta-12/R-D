package com.ashish.bank;

// 1 line comment

/* Multiple line based comment
 */

/** this  comment is documentation based comment
 * 
 * @author agupt139
 * @since 03-10-2018
 */
public abstract class BankAccount {
	int accountNo;
	String accountHolderName;
	double accountBalance;
	static int autoAccountNoGen;
	
	public BankAccount() {
		accountNo=++autoAccountNoGen;
		accountHolderName="Unknown";
		accountBalance=0;
		
	}

	public BankAccount(int accountNo, String accountHolderName, double accountBalance) {
		super();
		accountNo = ++autoAccountNoGen;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	} 
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public abstract void withdraw();
	
	public void deposite(double amount) {
		accountBalance+=amount;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + "]";
	}
	
}
