package Session12;

public class DemoMain {
	public static void main(String[] args) {
		DemoClass dc = new DemoClass();
		dc.getData();
		dc.putData();
		DemoClass dc1 = new DemoClass();
		dc1.getData();
		dc1.putData();
		System.out.println("------------");
		DemoStatic ds = new DemoStatic();
		ds.getData();
		ds.putData();
		DemoStatic.getData();
		DemoStatic.putData();
	}
}
