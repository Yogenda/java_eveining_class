package Session15;

import java.util.Scanner;

public class StdMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Studnet ID: ");
		int sid = sc.nextInt();
		System.out.println("Studnet Name: ");
		String sname = sc.next();
		System.out.println("Studetn Address: ");
		String addr = sc.next();
		
		while(true) {
			System.out.println("Are you from NIT college(yes/no): ");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("Yes")||ch.equalsIgnoreCase("No")) {
				if(ch.equalsIgnoreCase("Yes")) {
					Student std = new Student(sid,sname,addr);
					System.out.println("Studnet ID: "+std.getStudentId());
					System.out.println("Studnet Name: "+std.getStudentName());
					System.out.println("Student Address: "+std.getStudentAddress());
					System.out.println("College Name: "+std.getCollegeName());
				}
				else {
					System.out.println("Enter College Name: ");
					String clg = sc.next();
					Student std = new Student(sid,sname,addr,clg);
					System.out.println("Studnet ID: "+std.getStudentId());
					System.out.println("Studnet Name: "+std.getStudentName());
					System.out.println("Student Address: "+std.getStudentAddress());
					System.out.println("College Name: "+std.getCollegeName());
				}
				break;
			}
			System.out.println("Wrong Input");
		}
	}
}
