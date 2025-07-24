package Session11;
import java.util.Scanner;
public class FunEg3 {
	//with arg and without return type
	static void factorial(int x) {
		int fact =1;
		while(x>0) {
			fact=fact*x;
			x--;
		}
		System.out.println("Factorial is: "+fact);
	}
	public static void main(String[] args) {
		factorial(4);
		factorial(5);
		factorial(7);
		factorial(10);
	}
}
