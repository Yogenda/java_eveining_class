package Session16;

public abstract class DemoAbs {
	protected int x;
	void getValue(int x) {
		this.x =x;
	}
	abstract void putValue();
}
class DemoAbsChild extends DemoAbs{
	private int sqr;
	@Override
	void putValue() {
		sqr=x*x;
		System.out.println(x+" square is: "+sqr);
	}
}
