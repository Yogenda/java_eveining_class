package Session17;

import java.util.Scanner;

public class YzeeBank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Customer ID: ");
		int cid=sc.nextInt();
		
		System.out.println("Customer Name: ");
		String cname=sc.next();
		
		System.out.println("Email ID: ");
		String email =sc.next();
		
		Customer cust =new Customer(cid, cname, email); 
		
		System.out.println("Account No: ");
		int accno = sc.nextInt();
		
		System.out.println("Total amount to Deposit: ");
		double tamt = sc.nextDouble();
		
		System.out.println("Minimum balance: ");
		double mbal= sc.nextDouble();
		
		SavingsAccount sa = new SavingsAccount(accno, cust, mbal);
		sa.printCustInfo();
		System.out.println("-------------");
		
		System.out.println("How much amout to withdraw: ");
		double amt = sc.nextDouble();
		
		boolean b =  sa.withdraw(amt);
		if(b==true)
			System.out.println("Withdraw sucessfully");
		else
			System.out.println("Insufficient Balance");
		
	}
	
}
