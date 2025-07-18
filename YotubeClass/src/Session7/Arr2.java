package Session7;

import java.util.Scanner;

public class Arr2 {
	public static void main(String[] args) {
		int x[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+x.length+" value");
		for(int i=0;i<x.length;i++) {
			x[i] = sc.nextInt();
		}
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i]+" ");
		}
	}
}
