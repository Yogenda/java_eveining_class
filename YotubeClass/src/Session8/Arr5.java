package Session8;

import java.util.Scanner;

public class Arr5 {

	public static void main(String[] args) {
		int x[][] = new int [3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 9 values");
		for(int i=0;i<3;i++) {//row
			for(int j=0;j<3;j++) { //col
				x[i][j]=sc.nextInt();
			}
		}
		int sum = 0;
		for(int i=0;i<3;i++) {//row
			for(int j=0;j<3;j++) { //col
				System.out.print(x[i][j]+" ");
				if(i==j)
					sum = sum+x[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of diagonal value: "+sum);
	}
}
