package Session8;

import java.util.Scanner;

public class Arr3 {
	//accept the n number into array 
	//and find the biggest number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int x[] = new int[n];
		System.out.println("Enter "+x.length+" value");
		for(int i = 0; i<x.length;i++) {
			x[i] = sc.nextInt();
		}
		int big = 0;
		for(int i = 0;i<x.length;i++) {
			System.out.print(x[i]+" ");
			if(big<x[i])
				big=x[i];
		}
		System.out.println("\nBiggest nubmer is: "+big);
	}
}
