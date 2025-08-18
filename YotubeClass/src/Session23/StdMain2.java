package Session23;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import Session22.Studnet;

public class StdMain2 {
	public static void main(String[] args) {
		List<Studnet> lstStd = new Vector<Studnet>();
		Studnet std = new Studnet(101, "Hemant", "Java", 50000.00f);
		lstStd.add(std);
		std = new Studnet(102, "Vinit", "Python", 40000.00f);
		lstStd.add(std);
		std = new Studnet(103, "Rahul", "SQL", 30000.00f);
		lstStd.add(std);
		std = new Studnet(104, "Harry", "C", 20000.00f);
		lstStd.add(std);
		std = new Studnet(105, "Humera", "DSA", 20000.00f);
		lstStd.add(std);
		System.out.println(lstStd);
		System.out.println("------------");
		for(Studnet st:lstStd) {
			System.out.println(st.getRollNo()+"\t"+st.getSname()+
					"\t"+ st.getCourse()+"\t"+st.getFees());
		}
		System.out.println("------------");
		Iterator itr = lstStd.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
