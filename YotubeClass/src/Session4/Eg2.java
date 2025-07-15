package Session4;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		// accept a number and check is it +ve or -ve
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a>0) {
			System.out.println("it is +ve number");
		}
		if (a<0) {
			System.out.println("it is -ve number");
		}
		if (a==0) {
			System.out.println("the nubmer is 0");
		}
	}
}
