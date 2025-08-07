package Session20;

import java.io.IOException;
import java.util.Scanner;

public class Except5 {
	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(System.in);
			float balance = 14000.00f;
			System.out.println("EMI Amount will be: ");
			int emi = sc.nextInt();
			if(balance>=emi)
				System.out.println("EMI cut gai...");
		/* 	else
				throw new VoteException("wait until you become 18");
		}catch(VoteException ve) {
			System.out.println(ve);
		}*/
			else
				throw new InsufficientFundException("Paisa khatam bank mai");
		}
		catch(InsufficientFundException ife) {
			System.out.println(ife);
		}
	}
}
