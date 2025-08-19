package Session24;

import java.util.HashMap;
import java.util.Map;

public class MapEx4 {
	public static void main(String[] args) {
		Map<Integer, String> stdMap = new HashMap<Integer, String>();
		stdMap.put(102,"Hemant");
		stdMap.put(104,"Mohd");
		stdMap.put(101,"Humera");
		stdMap.put(103,"Vinit");
		System.out.println(stdMap);
		System.out.println("---------------");
		for(Map.Entry<Integer, String> obj: stdMap.entrySet()) {
			System.out.println(obj.getKey()+"\t"+obj.getValue());
		}
	}
}
