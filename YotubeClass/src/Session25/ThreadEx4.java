package Session25;

class myThread11 extends Thread{
	public void run() { //abstract method of thread class
		System.out.println("This is first Thread class");
	}
}
class myThread22 extends Thread{
	public void run() { //abstract method of thread class
		System.out.println("This is second Thread class");
	}
}

public class ThreadEx4 {
	public static void main(String[] args) {
		myThread11 mt1 = new myThread11();
		mt1.start();
		System.out.println("Thread 1 name is: "+mt1.getName());
		mt1.setName("MyThread-11");
		System.out.println("Thread 1 new name is: "+mt1.getName());
		myThread22 mt2 = new myThread22();
		mt2.start();
		System.out.println("Thread 2 name is: "+mt2.getName());
		mt1.setName("MyThread-22");
		System.out.println("Thread 2 new name is: "+mt2.getName());
	}	
}
