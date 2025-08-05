package Session18;

public class PolyMain {
	public static void main(String[] args) {
		Poly1.area(4);
		Poly1.area(4,6);
		Poly1.area(4.6f,9.8f);
		System.out.println("-------------------");
		Poly2 p2 = new Poly2();
		p2.big(5, 9);
		p2.big(9, 35.4f);
		p2.big(35.6f, 35.4f);
	}
}
