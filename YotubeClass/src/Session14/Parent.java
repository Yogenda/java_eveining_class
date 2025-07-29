package Session14;
// single inheritance
public class Parent {
	protected int x,y;
	void getData(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Child extends Parent{
	private int sum;
	void putData() {
		sum = x+y;
		System.out.println("X value: "+ x);
		System.out.println("Y value: "+ y);
		System.out.println("Sum is: "+ sum);
	}
}




