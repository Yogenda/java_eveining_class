package Session13;

public class Bank {
	private String cname;
	private int AccBal;
	private static int BankBal;
	void getCustDetail(String cn, int bal) {
		cname = cn;
		AccBal = bal;
		BankBal = BankBal+AccBal;
	}
	void printCust() {
		System.out.println("Customer Name: "+cname);
		System.out.println("Account Bal: "+ AccBal);
	}
	static void printBankBal() {
		System.out.println("Bank Balance is: "+ BankBal);
	}
}
