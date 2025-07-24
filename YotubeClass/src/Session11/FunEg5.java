package Session11;
import java.util.Scanner;
public class FunEg5 {
	//with arg and with return type
	static float sample(int x, float y) {
		System.out.println("Value of x is: "+x);
		System.out.println("Value of y is: "+y);
		float add = x+y;
		return add;
	}
	public static void main(String[] args) {
		float res =sample(10, 10.5f);
		System.out.println("Result is: "+res);
		System.out.println("Add of x and y is: "+
		sample(50, 10.65f));
	}
}
