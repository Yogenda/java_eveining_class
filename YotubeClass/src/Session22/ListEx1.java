package Session22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx1 {
	public static void main(String[] args) {
		List<String> arrList = new ArrayList<String>();
		arrList.add("Hemant");
		arrList.add("Vinit");
		arrList.add("Humera");
		arrList.add("Ritika");
		arrList.add("MergeSote");
		System.out.println(arrList);
		
		//traversing 
		for(String str: arrList) {
			System.out.print(str+"\t");
		}
		//------------
		//using the iterator
		System.out.println();
		Iterator itr = arrList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
}
