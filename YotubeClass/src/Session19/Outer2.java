package Session19;

public class Outer2 {
	private int x;
	void get(int x) {
		this.x = x;
	}
	//local inner class
	void show() {
		class Inner2{
			private int sq;
			void put() {
				sq = x*x;
				System.out.println("Square value is: "+ sq);
			}
		}
		Inner2 i2= new Inner2();
		i2.put();
	}
}
