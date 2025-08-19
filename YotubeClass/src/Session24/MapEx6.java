package Session24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx6 {
	public static void main(String[] args) {
		Map<Integer, String> stdMap = new HashMap<Integer, String>();
		stdMap.put(102,"Hemant");
		stdMap.put(104,"Mohd");
		stdMap.put(101,"Humera");
		stdMap.put(103,"Vinit");
		System.out.println(stdMap);
		System.out.println("---------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key: ");
		int k = sc.nextInt();
		if(stdMap.containsKey(k)) {
			System.out.println("Value is: "+ stdMap.get(k));
			stdMap.remove(k);
			System.out.println("Value after delete: "+ stdMap);
		}else
			System.out.println("Key not present....");
	}
}
