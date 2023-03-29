package bankaccountapp;

public class Savings extends Account{

	// List properties specific to savings accounts
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//Constructor to initialize settings for the Savings properties
	 public Savings(String name, String sSN, double initDeposit) {
		 super(name,sSN, initDeposit);
		 accountNumber= "1"+accountNumber;
//		 System.out.println("Account Number: "+ this.accountNumber);
//		 System.out.println("New Savings Account");
		 setSafetyDepositBox();
	 }
	private void setSafetyDepositBox() {
		safetyDepositBoxID=(int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey =(int)(Math.random() * Math.pow(10, 4));
	}
	 
	//List any methods specific to the savings account
		public void showInfo() {
			System.out.println("Account Type: Savings Account");
			super.showInfo();
			System.out.println("Your Savings Account Features"+
			"\nSafety Deposit Box ID: "+safetyDepositBoxID+
			"\nSafety Deposit Box Code: "+safetyDepositBoxKey);
			
		}
		@Override
		public void setRate() {
			// TODO Auto-generated method stub
				rate=getBaseRate()-0.25;
		}
}
