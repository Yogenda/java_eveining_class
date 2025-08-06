package Session19;

public class Outer {
	private int x;
	void get(int x) {
		this.x = x;
	}
	class Inner{
		private int sq;
		void put() {
			sq = x*x;
			System.out.println("Square value is: "+ sq);
		}
	}
}
