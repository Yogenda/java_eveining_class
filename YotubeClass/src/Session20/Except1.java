package Session20;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any 2 values: ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException ae) {
			System.out.println("Number not divided by 0");
		}
		finally {
			System.out.println("Don't worry");
		}
	}	
}
