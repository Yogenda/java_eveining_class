package Session14;
//multi level
public class Studnet {
	protected String sname, course;
	void getStdInfo(String sname, String course) {
		this.sname = sname;
		this.course = course;
	}
}

class Marks extends Studnet{
	protected int sub1, sub2;
	void getStdMarks(int sub1, int sub2) {
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
}

class Marksheet extends Marks{
	void printResutl() {
		System.out.println("Student Name: "+ sname);
		System.out.println("Student Course: "+ course);
		System.out.println("Sub1 Marks: "+ sub1);
		System.out.println("Sub2 Marks: "+ sub2);
		System.out.println("Total Marks: "+ (sub1+sub2));
	}
}

