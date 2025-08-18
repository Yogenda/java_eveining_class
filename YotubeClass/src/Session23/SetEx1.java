package Session23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<String> setStr = new LinkedHashSet<String>();
		setStr.add("Hemant");
		setStr.add("Humera");
		setStr.add("Mohd");
		setStr.add("Ritika");
		setStr.add("Vinit");
		setStr.add("Abhishek");
		setStr.add(null);
		System.out.println(setStr);
	}
}
