package Session22;

import java.util.List;
import java.util.Scanner;

public class LibMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = null;
		Liabrary lib = new Liabrary();
		while (true) {
			System.out.println("1. Add Member \n2.View All Members\n" + "3.Search Member by Location\n4.Exit ");
			System.out.println("Pickup your choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				System.out.println("Enter the Member ID: ");
				int mid = sc.nextInt();
				System.out.println("Enter the member name: ");
				String mname = sc.next();
				System.out.println("Enter the Location: ");
				String loc = sc.next();
				member = new Member(mid, mname, loc);
				lib.addMember(member);
				System.out.println("--------------");
				break;
			}
			case 2:
				List<Member> mall = lib.viewAllMembers();
				for (Member m : mall) {
					System.out.println(m.getMemberId() + "\t" + "" + m.getMemberName() + "\t" + m.getAddress());
				}
				System.out.println("--------------");
				break;
			case 3:
				System.out.println("Enter the location: ");
				String lc = sc.next();
				List<Member> adrsall = lib.viewMembersByAddress(lc);
				for (Member m : adrsall) {
					System.out.println(m.getMemberId() + "\t" + "" + m.getMemberName() + "\t" + m.getAddress());
				}
				System.out.println("--------------");
				break;
			case 4:
				System.out.println("Thank you for using our app");
				System.exit(0);
			}

		}
	}
}
