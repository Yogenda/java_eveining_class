package Session10;

import java.util.Scanner;

public class StrEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings: ");
		String str1= sc.next();
		String str2= sc.next();
		
		if(str1.compareToIgnoreCase(str2)>0)
			System.out.println("First string is Big");
		else if(str1.compareToIgnoreCase(str2)<0)
			System.out.println("Second string is big");
		else if(str1.compareToIgnoreCase(str2)==0)
			System.out.println("Both are same");
	}
}
