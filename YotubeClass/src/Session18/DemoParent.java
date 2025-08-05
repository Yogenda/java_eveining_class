package Session18;

public class DemoParent {
	void getValue(int x) {
		System.out.println("Value of x in parent is: " + x);
	}
}

class DemoChild extends DemoParent {
	void getValue(int x) {
		System.out.println("Value of x in child is: " + x);
	}
}