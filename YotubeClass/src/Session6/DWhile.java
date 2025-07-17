package Session6;

import java.util.Scanner;

public class DWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = "";
		float grTotal = 0.0f;
		do {
			System.out.println("Product Name: ");
			String pname = sc.next();
			System.out.println("Product Price: ");
			float price = sc.nextFloat();
			System.out.println("No of Product: ");
			int nop = sc.nextInt();
			
			float total = price*nop;
			grTotal = grTotal+total;
			
			System.out.println("Total Amount is: "+total);
			System.out.println("Do you want to add more product y/n");
			ch=sc.next();
		}while(ch.equals("y")||ch.equals("Y"));
		
		System.out.println("Grand Total: "+grTotal);
	}
}
