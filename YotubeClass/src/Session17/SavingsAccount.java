package Session17;

public class SavingsAccount extends Account {
	private double minimumBalance;

	public SavingsAccount(int accountNumber, Customer customerObj, double balance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = 1000;
	}

	public void printCustInfo() {
		System.out.println("Customer ID: "+customerObj.getCustomerId());
		System.out.println("Customer Name: "+customerObj.getCustomerName());
		System.out.println("Customer Email: "+customerObj.getEmailId());
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Balance: "+balance);
		System.out.println("Minimum Balance: "+minimumBalance);
	}
	
	public boolean withdraw(double amount) {
		if ((balance - amount) > minimumBalance) {
			balance = balance - amount;
			return true;
		} else
			return false;
	}
}
