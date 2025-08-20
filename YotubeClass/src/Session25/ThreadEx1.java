package Session25;

class myThread1 extends Thread{
	public void run() { //abstract method of thread class
		System.out.println("This is first Thread class");
	}
}
class myThread2 extends Thread{
	public void run() { //abstract method of thread class
		System.out.println("This is second Thread class");
	}
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("This is main method");
		myThread1 mt1 = new myThread1();
		mt1.start();
		myThread2 mt2 = new myThread2();
		mt2.start();
		System.out.println("This is main method");
	}
	
}
