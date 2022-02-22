package com.bridgelabz.savingbalance;

public class SavingAccountTest {
	
	public static void main(String[] args) {
		SavingAccount saver1, saver2;
		
		saver1 = new SavingAccount (2000.0);
		saver2 = new SavingAccount (3000.0);
	
		
		SavingAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		 
		System.out.println("New Balance for saver1 in month: \nsaver1 balance = "+ saver1.getSavingBalance());
		System.out.println("New Balance for saver2 in month: \nsaver2 balance = "+ saver2.getSavingBalance()); 
		
		
		SavingAccount.modifyInterestRate(0.05);  
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		
		System.out.println("Next month Balance for saver1 in month: \nsaver1 balance = "+ saver1.getSavingBalance());
		System.out.println("New next month Balance for saver2 in month: \nsaver2 balance = "+ saver2.getSavingBalance());
	}
	
	

}
