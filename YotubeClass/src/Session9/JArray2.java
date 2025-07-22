package Session9;
import java.util.Scanner;

public class JArray2 {
	public static void main(String[] args) {
		int x[][] = new int [3][];
		x[0]=new int [3];
		x[1]=new int [4];
		x[2]=new int [2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<x.length;i++) {
			System.out.println("Enter "+x[i].length+" values");
			for(int j=0;j<x[i].length;j++) {
				x[i][j]=sc.nextInt();
			}
		}
		System.out.println("Output of JArray");
		for(int i = 0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
