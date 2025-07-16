package Session5;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Add \n2: Minus");
		System.out.println("Enter you choice: ");
		int ch = sc.nextInt();
		if(ch==1 || ch==2) {
			System.out.println("Enter your numbers");
			int x = sc.nextInt();
			int y = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Addition: "+ (x+y));
				break;
			case 2:
				System.out.println("Sub: "+(x-y));
				break;
			}
		}
		else {
			System.out.println("Invalid choice");
		}
	}
}
