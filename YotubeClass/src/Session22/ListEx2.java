package Session22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx2 {
	public static void main(String[] args) {
		List<Integer> arrList = new ArrayList<Integer>();
		arrList.add(101);
		arrList.add(102);
		arrList.add(103);
		arrList.add(104);
		arrList.add(105);
		System.out.println(arrList);
		
		//traversing 
		for(int str: arrList) {
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
