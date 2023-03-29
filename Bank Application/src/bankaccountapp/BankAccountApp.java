package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file="E:\\Downloads Chrome Dfault\\NewBankAccounts.csv";
		// TODO Auto-generated method stub
//		Checking chkacc1= new Checking("Tom Willson", "123456780",1000);
//		Savings savacc1= new Savings("Rich Love","876541230", 50);
//		chkacc1.showInfo();
//		System.out.println("********************");
//		savacc1.showInfo();
//		System.out.println("-----------------");
//		savacc1.compound();
//		System.out.println("-----------------");
//		savacc1.showInfo();
////		savacc1.deposit(5000);
////		savacc1.withdraw(100);
////		savacc1.transfer("Rent", 1300);
		List<Account> accounts= new LinkedList<Account>();
//		
		// Read a CSV file then create new accounts based on that data
		List<String[]> newAccountHolders= utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolders) {
//			System.out.println("NEW ACCOUNT");
			String name= accountHolder[0];
			String sSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit= Double.parseDouble(accountHolder[3]);
//			System.out.println(name+" "+sSN+" "+accountType+" "+initDeposit);
			
			if(accountType.equals("Checking")) {
//				System.out.println("OPEN A CHECKING ACCOUNT");
				accounts.add(new Checking(name,sSN,initDeposit));
			}
			else if(accountType.equals("Savings")) {
//				System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name,sSN,initDeposit));
				
			}
			else System.out.println("ERROR READING ACCOUNT TYPE");
		}
		for(Account acc:accounts) {
			System.out.println("\n****************************");
			acc.showInfo();
		}

	}

}
