package Session11;
import java.util.Scanner;
public class FunEg4 {
	static boolean isPall(String str) {
		str = str.replaceAll("\\s", " ");
		int left = 0;
		int right = str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String input = sc.nextLine();
		
		if(isPall(input))
			System.out.println("its palandrom");
		else
			System.out.println("Not palandrom");
	}
}
