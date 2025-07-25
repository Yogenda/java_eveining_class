package Session12;

public class DemoStatic {
	private static int x,y;
	
	static void getData() {
		x=100;
		y=200;
	}
	static void putData() {
		System.out.println("Value of X is: "+x);
		System.out.println("Value of Y is: "+y);
		int sum = x+y;
		System.out.println("Addition is: "+sum);
	}
}
