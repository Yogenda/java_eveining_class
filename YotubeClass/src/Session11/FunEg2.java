package Session11;

import java.util.Scanner;

public class FunEg2 {
	//without arg and without return type
	static void factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int x = sc.nextInt();
		int fact =1;
		while(x>0) {
			fact=fact*x;
			x--;
		}
		System.out.println("Factorial is: "+fact);
	}
	public static void main(String[] args) {
		factorial();
	}
}
