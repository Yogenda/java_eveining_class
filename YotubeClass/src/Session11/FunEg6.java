package Session11;
import java.util.Scanner;
public class FunEg6 {
	//without arg and with return type
	static int factorial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int x = sc.nextInt();
		int fact =1;
		while(x>0) {
			fact=fact*x;
			x--;
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println(factorial());
	}
}
