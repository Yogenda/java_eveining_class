package Session10;

import java.util.Scanner;

public class StrEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings: ");
		String str1= sc.next();
		String str2= sc.next();
		
		if(str1.equalsIgnoreCase(str2))
			System.out.println("Both the string are equal");
		else
			System.out.println("Both the string are not equal");
	}
}
