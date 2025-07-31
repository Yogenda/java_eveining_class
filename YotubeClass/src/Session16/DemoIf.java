package Session16;

interface shape{
	void get(int x);
	void put();
}
//abstract class shape{
//	abstract void get(int x);
//	abstract void put();
//}
class Square implements shape{
	private int x;

	@Override
	public void get(int x) {
		this.x = x;
	}
	@Override
	public void put() {
		System.out.println(x + " Square is: "+ x*x);
	}
	
}

class Cube implements shape{
	private int x;		
	@Override
	public void get(int x) {
		this.x = x;
	}
	@Override
	public void put() {
		System.out.println(x + " Cube is: "+ x*x*x);
	}
}


public class DemoIf {
	public static void main(String[] args) {
		Square s = new Square();
		s.get(10);
		s.put();
		Cube c = new Cube();
		c.get(10);
		c.put();
	}
}
