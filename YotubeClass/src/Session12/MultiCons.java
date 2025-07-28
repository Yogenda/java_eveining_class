package Session12;

public class MultiCons {
	private int x,y;
	public MultiCons() {
		System.out.println("This is constructore "
				+ "without param");
		x=10;
		y=20;
	}
	public MultiCons(int p, int q) {
		System.out.println("This is constructore "
				+ "with param");
		x=p;
		y=q;
	}
	void printValue() {
		System.out.println("Value of X: "+ x);
		System.out.println("Value of Y: "+ y);
	}
}
