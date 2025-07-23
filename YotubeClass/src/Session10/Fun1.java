package Session10;

public class Fun1 {
	static void Sample() {
		System.out.println("This is user def fun");
	}
	static void Sample(int x, float y) {
		System.out.println("Value of X is: "+x);
		System.out.println("Value of Y is: "+y);
		System.out.println("Addition of x and y: "+
		(x+y));
	}
	public static void main(String[] args) {
		System.out.println("This main fun");
		Sample();
		Sample(10,12.5f);
		System.out.println("--------------");
		int p = 10;
		float q = 19.5f;
		Sample(p,q);
		System.out.println("end of main() fun");
	}
}
