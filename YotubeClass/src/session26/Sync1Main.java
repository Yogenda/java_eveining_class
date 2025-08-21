package session26;

//method level syncronization
class SharedResource{
	public synchronized void Wish(String name) throws Exception {
		for(int i=1;i<=5;i++) {
			System.out.println("Good Moring: "+name);
			Thread.sleep(1000);
		}
	}
}
class SyncMethod extends Thread{
	private String sname;
	private SharedResource sr; //null obj
	
	public SyncMethod(String sname,SharedResource sr) {
		this.sname = sname;
		this.sr = sr;
	}
	public void run() {
		try {
			sr.Wish(sname);
		} catch (Exception e) {
		}
	}
}
public class Sync1Main {
	public static void main(String[] args) {
		SharedResource sr1 = new SharedResource();
		SyncMethod sm1 = new SyncMethod("Humera", sr1);
		SyncMethod sm2 = new SyncMethod("Rahul", sr1);
		sm1.start();
		sm2.start();
	}
}





