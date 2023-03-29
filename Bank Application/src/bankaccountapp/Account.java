package bankaccountapp;

public abstract class Account implements IBaseRate {

	//List common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	private static int index=10000;
	protected String accountNumber;
	protected double rate;
	
//	private int socialSecurtiyNumber;
//	private String accountType;
//	private double initialDeposit;
//	private int accountNumber;
	
	//Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDeposit) {

		this.name=name;
		this.sSN=sSN;
		balance= initDeposit;
//		System.out.println("Name: "+ name + "SSN: "+ sSN + "Balance: $"+balance);
		//Set Account Number
		index++;
		this.accountNumber=setAccountNumber();
		setRate();
//		System.out.println("Account Number: "+this.accountNumber);
	}
	
	private String setAccountNumber() {
		String lastTwoOfSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index;
		int randomNumber= (int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	public abstract void setRate(); // We are defining this class here and as abstract is because we want to make it mandatory to implement
	//in Checking and Saving class we dont want to hard code it into the sav and check class.If this method is not implemented than the other
	// two classes will throw error.
	public void compound() {
		double accruedInterest= balance * (rate/100);
		balance+=accruedInterest;
		System.out.println("Accrued Interest: $"+accruedInterest);
		printBalance();
	}
	//List of common methods
	//Deposit Method
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	//Withdraw Method
	public void withdraw(double amount) {
		balance-=amount;
		System.out.println("Withdraw $"+amount);
		printBalance();
	}
	//Transfer Method
	public void transfer(String whereTo, double amount) {
		balance-=amount;
		System.out.println("Transferring $"+ amount+" to "+whereTo);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your Balance is now: $"+balance);
	}
	
	public void showInfo() { // This same function is present in Savings and Checkings class as well(Ex of Polymorphism and methode overwriting)
		System.out.println("Name: "+name+
				"\nAccount Number: "+ this.accountNumber+
				"\nBalance: "+ balance+
				"\nRate: "+rate+"%");
				
	}
	
}
