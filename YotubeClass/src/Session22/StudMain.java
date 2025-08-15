package Session22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudMain {
	public static void main(String[] args) {
		List<Studnet> lstStd = new ArrayList<Studnet>();
		Studnet std = new Studnet(101, "Hemant", "Java", 50000.00f);
		lstStd.add(std);
		std = new Studnet(102, "Vinit", "Python", 40000.00f);
		lstStd.add(std);
		std = new Studnet(103, "Rahul", "SQL", 30000.00f);
		lstStd.add(std);
		std = new Studnet(104, "Harry", "C", 20000.00f);
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
