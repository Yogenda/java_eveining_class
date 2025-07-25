package Session12;

public class ConsParam {
	private int x, y;
	public ConsParam(int x, int y) {
		System.out.println("This is out constructor");
		this.x=x;
		this.y=y;
	}
	void printValue() {
		System.out.println("Value of X is: "+x);
		System.out.println("Value of Y is: "+y);
	}
}
