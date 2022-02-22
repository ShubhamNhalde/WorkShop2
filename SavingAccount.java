package com.bridgelabz.savingbalance;

public class SavingAccount {
	static private double annualInterestRate;
	private double savingBalance;
	
	public SavingAccount(double savingBalance) {
		this.savingBalance = savingBalance; }
	
	public double getSavingBalance() {
		return savingBalance;
	}
	public void setSavingBalance(double savingBalance) {
		this.savingBalance = savingBalance;
	}
	
	public static void modifyInterestRate(double newInterestRate)  {
		annualInterestRate = newInterestRate;	
		}
	public void calculateMonthlyInterest()  {
		double monthlyI;
		monthlyI = (this.savingBalance*annualInterestRate/12);
		this.savingBalance += monthlyI;
	}
	
	
}
