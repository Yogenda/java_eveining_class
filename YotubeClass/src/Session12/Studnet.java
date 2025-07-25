package Session12;

import java.util.Scanner;

public class Studnet {
	private String sname;
	private String course;
	private int sub1, sub2;
	
	void getStdDetail() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name and "
				+ "course");
		sname = sc.next();
		course = sc.next();
		System.out.println("Enter the marks of "
				+ "sub1 and sub2");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
	}
	void printStdDetails() {
		int total = sub1+sub2;
		System.out.println("Total is: "+total);
		float avg = total/2.0f;
		System.out.println("Average is: "+ avg);
		if(sub1>=35 && sub2>=35)
			System.out.println("you are pass");
		else
			System.out.println("Fir sai padho");
	}	
}
