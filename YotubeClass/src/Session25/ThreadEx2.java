package Session25;

class myth1 implements Runnable{
	@Override
	public void run() {
		System.out.println("This is my runnable interface 1");
	}
}
class myth2 implements Runnable{
	@Override
	public void run() {
		System.out.println("This is my runnable interface 2");
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		myth1 m1 = new myth1();
		Thread t1 = new Thread(m1);
		t1.start();
		
		Thread t2 = new Thread(new myth2());
		t2.start();
		System.out.println("main method");
	}	
}
