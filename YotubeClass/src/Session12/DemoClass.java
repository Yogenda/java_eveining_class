package Session12;

public class DemoClass {
	private int x,y; // instance var
	void getData() {
		x=10;
		y=20;
	}
	void putData() {
		System.out.println("Value of X is: "+x);
		System.out.println("Value of Y is: "+y);
		int sum = x+y;
		System.out.println("Addition is: "+sum);
	}
}
