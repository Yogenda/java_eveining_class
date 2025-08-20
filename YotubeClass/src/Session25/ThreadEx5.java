package Session25;

class myThread111 extends Thread{
	public void run() { //abstract method of thread class
		System.out.println("This is first Thread class");
	}
}
class myThread222 extends Thread{
	public void run() { //abstract method of thread class
		System.out.println("This is second Thread class");
	}
}

public class ThreadEx5 {
	public static void main(String[] args) {
		myThread111 mt1 = new myThread111();
		mt1.start();
//		System.out.println("Thread 1 Priority is: "+mt1.getPriority());
//		mt1.setPriority(1);
//		System.out.println("Thread 1 new Priority is: "+mt1.getPriority());
		mt1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread 1 Priority is: "+mt1.getPriority());
		
		myThread222 mt2 = new myThread222();
		mt2.start();
//		System.out.println("Thread 2 Priority is: "+mt2.getPriority());
//		mt2.setPriority(1);
//		System.out.println("Thread 2 new Priority is: "+mt2.getPriority());
		mt2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Thread 2 Priority is: "+mt2.getPriority());
	}	
}
