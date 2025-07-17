package Session5;

import java.util.Scanner;

public class lp4 {
	public static void main(String[] args) {
		//Accept the number then print it's reverse number
		// 123 = 321
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n = sc.nextInt();
		int rev = 0;
		while(n>0) {
			int r=n%10;
			rev = rev*10+r;
			n=n/10;
			System.out.println(n+"\t"+r+"\t"+rev);
		}
		System.out.println("reverse value is: "+rev);
	}
}
