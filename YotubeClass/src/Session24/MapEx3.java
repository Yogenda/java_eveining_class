package Session24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx3 {
	public static void main(String[] args) {
		Map<Integer, String> stdMap = new TreeMap<Integer, String>();
		stdMap.put(102,"Hemant");
		stdMap.put(104,"Mohd");
		stdMap.put(101,"Humera");
		stdMap.put(103,"Vinit");
		System.out.println(stdMap);
	}
}
