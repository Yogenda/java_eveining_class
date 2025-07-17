package Session5;

import java.util.Scanner;

public class lp3 {
	public static void main(String[] args) {
		//accept the number then print it's factorial value
		// 5!=5x4x3x2x1 = 120
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		int fact = 1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println("my factorial of value is: "+fact);
	}
}
