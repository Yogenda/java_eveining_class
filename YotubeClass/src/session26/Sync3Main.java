package session26;

//static syncronization

class SharedResourseStaticLevel {
	public synchronized static void wish(String name) {
		System.out.println("Thread started...");
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good Moring: " + name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
class SyncStatic extends Thread {
	private String name;
	public SyncStatic(String name) {
		super();
		this.name = name;
	}
	public void run() {
		SharedResourseStaticLevel.wish(name);
	}
}

public class Sync3Main {
	public static void main(String[] args) {
		SyncStatic ss = new SyncStatic("Humera");
		SyncStatic ss1 = new SyncStatic("King");
		ss.start();
		ss1.start();
	}
}
