package Session5;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your alphabet: ");
		String str = sc.next();
		switch(str) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("it is a vovel");
			break;
		default:
			System.out.println("it is not vovel");
			break;
		}
	}
}
