package Session5;

import java.util.Scanner;

public class Switch1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: India \n2: UK \n3: Canada");
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		switch(ch) {
			case 1:
				System.out.println("You are from India");
				break;
			case 2:
				System.out.println("You are from UK");
				break;
			case 3:
				System.out.println("You are from Canada");
				break;
			default:
				System.out.println("You are the member of ISIS");
				break;
		}
	}
}
