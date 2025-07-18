package Session7;

public class Nest4 {
	public static void main(String[] args) {
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		System.out.println("---for loop---");
		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("---while loop---");
		
		int x=4;
		while(x>=1) {
			int y=1;
			while(y<=x) {
				System.out.print(y+" ");
				y++;
			}
			System.out.println();
			x--;
		}
		
	}
}
