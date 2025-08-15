package Session22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx5 {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>(); 
		arrList.add("Humera");
		arrList.add("Dudee");
		arrList.add("Vinit");
		arrList.add("Hemant");
		arrList.add("Omkar");
		System.out.println(arrList);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Studdent name to Delete: ");
		String str = sc.next();
		
		if(arrList.remove(str)) {
			System.out.println("Student is deleted..");
			System.out.println(arrList);
		}
		else
			System.out.println("No such student...");
		
		
	}
}
