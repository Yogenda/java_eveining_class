package Session23;

import java.util.HashSet;
import java.util.Set;

public class SetEx2 {
	public static void main(String[] args) {
		Set<String> setStr = new HashSet<String>();
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
