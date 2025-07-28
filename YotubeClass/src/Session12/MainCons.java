package Session12;

public class MainCons {
	public static void main(String[] args) {
		DemoCons dc = new DemoCons();
		dc.printValue();
		System.out.println("----------------");
		ConsParam cp1= new ConsParam(10, 20);
		cp1.printValue();
		ConsParam cp2= new ConsParam(150, 120);
		cp2.printValue();
		System.out.println("--Same name cons--");
		MultiCons mc1 = new MultiCons();
		mc1.printValue();
		MultiCons mc2 = new MultiCons(100,150);
		mc2.printValue();
	}
}
