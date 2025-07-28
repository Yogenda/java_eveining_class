package Session13;

import java.util.Scanner;

public class EmpProcess {
	private Scanner sc = new Scanner(System.in);
	private Employee emp = new Employee();
	
	void getEmpDetail() {
		System.out.println("Enter Emp number: ");
		emp.setEmpno(sc.nextInt());
		System.out.println("Enter Emp Name: ");
		emp.setEname(sc.next());
		System.out.println("Enter Emp job: ");
		emp.setJob(sc.next());
		System.out.println("Enter Emp salary: ");
		emp.setSal(sc.nextInt());
	}
	void setEmpDetail() {
		System.out.println("Emp Number is: "+ emp.getEmpno());
		System.out.println("Emp Name is: "+ emp.getEname());
		System.out.println("Emp Job is: "+ emp.getJob());
		System.out.println("Emp Salary is: "+ emp.getSal());
	}
}
