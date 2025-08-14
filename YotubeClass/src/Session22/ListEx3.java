package Session22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>(); 
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a string Value: "
					+ "(Stop is use to stop it)");
			String st = sc.next();
			if(st.equalsIgnoreCase("stop"))
				break;
			arrList.add(st);
		}
		System.out.println(arrList);
	}
}
