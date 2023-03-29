package bankaccountapp;

public class Checking extends Account{

	// List properties specific to checking accounts
	private int debitCardNumber;
	private int debitCardPIN;
	
	//Constructor to initialize our checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
//		System.out.println("Account Number: "+this.accountNumber);
//		System.out.println("New Checking Account");
		setDebitCard();
		
	}
	public void setDebitCard() {
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPIN=(int)(Math.random()*Math.pow(10, 4));
	}
	
	//List any methods specific to the checking account
	public void showInfo() {
		System.out.println("Account Type: Checking Account");
		super.showInfo();
		System.out.println("Debit Card Number: "+debitCardNumber+
				"\nDebit Card PIN: "+debitCardPIN );
	}
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		rate=getBaseRate()* 0.15;
	}
}
