package Session19;

public class Outer4 {
	interface iface1{
		void put();
	}
	private int n;
	void get(int n) {
		this.n = n;
	}
	class Inner4 implements iface1{
		@Override
		public void put() {
			System.out.println(n+" Square value is: "+(n*n));
		}
	}
}
