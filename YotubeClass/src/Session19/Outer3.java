package Session19;

public class Outer3 {
	private static int n;
	void get(int x) {
		this.n = x;
	}
	
	static class Inner3 {
		private int sq;
		void square() {
			sq=n*n;
			System.out.println("Square value is: "+ sq);
		}
		static void cube() {
			System.out.println("cube is: "+ (n*n*n));
		}
	}
}
