package Session25;

class Thd1 extends Thread{
	public void run() {
		for(int i =1;i<=5; i++) {
			System.out.println("Thread-A "+i);
			try {
				Thread.sleep(1000); // 1000 mili sec - 1sec
				//block state
			}catch(Exception e) {
				
			}
		}
	}
}
class Thd2 extends Thread{
	public void run() {
		for(int i =1;i<=5; i++) {
			System.out.println("Thread-B "+i);
			try {
				Thread.sleep(1000); // 1000 mili sec - 1sec
			}catch(Exception e) {
				
			}
		}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) {
		Thd1 t1= new Thd1(); //new born state
		t1.start(); //runnable state
		Thd2 t2= new Thd2(); //new born state
		t2.start(); //runnable state
	}	
}
