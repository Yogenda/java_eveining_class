package Session10;

import java.util.Scanner;

public class StrEx4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings: ");
		String str1= sc.next();
		String str2= sc.next();
		System.out.println(str1.concat(str2));
		System.out.println(str1);
		System.out.println(str2);
	}
}
