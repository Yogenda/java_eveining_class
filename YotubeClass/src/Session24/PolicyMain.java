package Session24;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PolicyMain {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Policy pcy = new Policy();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			System.out.println("1. Add Policy\n2. View All policy"
					+ "\n3. Search Policy\n4. Exit");
			System.out.println("Enter your option: ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the Policy ID: ");
				int pid = sc.nextInt();
				System.out.println("Enter the Policy Name: ");
				String pname = sc.next();
				pcy.addPolicyDetail(pid, pname);
				System.out.println("Added policy..");
				break;
			case 2:
				Map<Integer, String> allPolicy = pcy.ViewAllPolicy();
				for(Map.Entry<Integer, String> obj: allPolicy.entrySet()) {
					System.out.println(obj.getKey()+"\t"+obj.getValue());
				}
				break;
			case 3:
				System.out.println("Enter the type of policy: ");
				String str = br.readLine();
				List<Integer> pidInfo  = pcy.serchBasedOnPolicyType(str);
				for(int n : pidInfo) {
					System.out.println(n);
				}
				break;
			case 4:
				System.out.println("Thank you for using app...");
				System.exit(0);
			}
		}
	}
}




