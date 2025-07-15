package Session4;

import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {
		// value (100-999) fist, second, third
		// f-1 s-2 t-3 
		System.out.println("Enter any 3 digit number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>100 && n<1000) {
			int first = n/100;
			System.out.println("First digit is: "+first);
			int second = (n%100)/10;
			System.out.println("Second digit is: "+ second);
			int third = n%10;
			System.out.println("Third digit is: "+third);
		}
		else {
			System.out.println("invalid number");
		}
	}
}
