package Session22;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudMainDynamic {
	public static void main(String[] args) {
		List<Studnet> lstStd = new ArrayList<Studnet>();
		Studnet std = null;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Studnet Roll No: ");
			int rno = sc.nextInt();
			System.out.println("Student Name: ");
			String sname = sc.next();
			System.out.println("Course Name: ");
			String course = sc.next();
			System.out.println("Course Fees: ");
			float fees = sc.nextFloat();
			std = new Studnet(rno, sname, course, fees);
			lstStd.add(std);
			System.out.println("Do you want more studnets Y/N: ");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("n"))
				break;
		}
		System.out.println("------------");
		for(Studnet st:lstStd) {
			System.out.println(st.getRollNo()+"\t"+st.getSname()+
					"\t"+ st.getCourse()+"\t"+st.getFees());
		}
	}
}
