package bankaccountapp;

public interface IBaseRate {

	// This will be decided by someone else like the Federal Bank or RBI or so that is why we are creating an interface
	// Write a method that returns the Base Rate
	 default double getBaseRate() {
		 return 2.5;
	 }
}
