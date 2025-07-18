package Session7;

public class Nest3 {
	public static void main(String[] args) {
		// 1 
		// 1 2 
		// 1 2 3
		// 1 2 3 4
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		int x=1;
		while(x<=4) {
			int y=1;
			while(y<=x) {
				System.out.print("*"+" ");
				y++;
			}
			System.out.println();
			x++;
		}
		
	}
}
