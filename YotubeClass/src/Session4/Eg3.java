package Session4;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		// even or odd
		System.out.println("Enter any number to find E/O: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n%2!=0) {
			System.out.println("odd number");
		}
		else {
			System.out.println("even number");
		}
		
//		if(n%2==0) {
//			System.out.println("Even number");
//		}
//		else {
//			System.out.println("Odd number");
//		}
		
	}
}
