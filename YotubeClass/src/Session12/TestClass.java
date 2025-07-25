package Session12;

public class TestClass {
	int x;
	void getValue(int p) {
		x=p;
	}
	void printValue() {
		int sqr = x*x;
		System.out.println("Square of x is: "+sqr);
	}
	public static void main(String[] args) {
		TestClass tc = new TestClass();
		tc.getValue(10);
		tc.printValue();
	}
}
