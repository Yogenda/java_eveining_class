package Session7;

public class Nest2 {
	public static void main(String[] args) {
		// 1 2 3
		// 1 2 3
		// 1 2 3
		int x = 1;
		while (x <= 3) {
			int y = 1;
			while (y <= 3) {
				System.out.print(y + " ");
				y++;
			}
			System.out.println();
			x++;
		}
		
		System.out.println("---For loop--");
		
		for(int i=1;i<=3;i++) {
			System.out.print("outer loop ");
			System.out.println(i+" ");
			for(int j=1;j<=3;j++) {
				System.out.print(" inner loop ");
				System.out.print(""+j+" ");
			}
			System.out.println();
		}
		
	}
}
