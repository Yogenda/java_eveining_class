package Session18;

public class OverRideMain {
	public static void main(String[] args) {
		DemoParent dp = new DemoParent();
		dp.getValue(100); // value of parent method
		
		DemoChild dc = new DemoChild();
		dc.getValue(50); // value of child method
		
		dp = dc; //overriding method
		dp.getValue(60); //child class method
	}
}
