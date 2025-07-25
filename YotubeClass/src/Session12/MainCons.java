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
	}
}
