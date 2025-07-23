package Session10;

import java.util.Scanner;

public class StrEx8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the sentence: ");
		String str1= sc.nextLine();
		System.out.println("String to search: ");
		String str2= sc.nextLine();
		
		if(str1.contains(str2))
			System.out.println("Exist");
		else
			System.out.println("Not there");
	}
}
