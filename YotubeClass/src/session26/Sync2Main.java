package session26;

//block level syncronization
class BlockLevelSyncronization {
	public void wish(String name) {
		synchronized (this) {
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
}

class SyncBlock extends Thread {
	private String name;
	private BlockLevelSyncronization bls; // null obj

	public SyncBlock(String name, BlockLevelSyncronization bls) {
		super();
		this.name = name;
		this.bls = bls;
	}

	public void run() {
		bls.wish(name);
	}
}

public class Sync2Main {
	public static void main(String[] args) {
		BlockLevelSyncronization blsync = new BlockLevelSyncronization();
		SyncBlock sb1 = new SyncBlock("Humera", blsync);
		SyncBlock sb2 = new SyncBlock("King", blsync);

		sb1.start();
		sb2.start();
	}
}
