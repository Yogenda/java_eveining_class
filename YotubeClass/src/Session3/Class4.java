package Session3;
import java.util.Scanner;  //import the scanner class

public class Class4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // object create
		System.out.println("Enter any Value: ");
		float n = sc.nextFloat(); // use to accept int value
		float result = n*n;
		System.out.println("Square of Value is: "+result);
	}
}
