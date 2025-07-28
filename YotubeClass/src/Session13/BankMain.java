package Session13;
public class BankMain {
	public static void main(String[] args) {
		Bank c1 = new Bank();
		c1.getCustDetail("Rahul", 12000);
		Bank c2 = new Bank();
		c2.getCustDetail("Comfoxy", 20000);
		Bank c3 = new Bank();
		c3.getCustDetail("Aryan", 15000);
		
		c1.printCust();
		System.out.println("-------------");
		c2.printCust();
		System.out.println("-------------");
		c3.printCust();
		Bank.printBankBal();
	}
}
