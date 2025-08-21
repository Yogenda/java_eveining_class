package session26;

import java.util.Scanner;

//write a program for syncronization(Method)

//-- task 1: Print all the even numbers b/w 1-n
//-- task 2: Print all factors of 5 upto n

class SharedItem {
	public synchronized void printAllEvenNumbers(int n) throws InterruptedException {
		System.out.println("\nEven number");
		for (int i = 2; i <= n; i+=2) {
			System.out.print(i+" ");
			Thread.sleep(1000);
		}
	}
	public synchronized void print_fact_to_5(int n) throws InterruptedException {
		System.out.println("\nFactorial is ");
		for (int i = 5; i <= n; i +=5) {
			System.out.print(i+" ");
			Thread.sleep(1000);
		}
	}
}

class EvenNumber extends Thread {
	private int n;
	private SharedItem si;

	public EvenNumber(int n, SharedItem si) {
		super();
		this.n = n;
		this.si = si;
	}

	public void run() {
		try {
			si.printAllEvenNumbers(n);
		} catch (InterruptedException e) {
		}
	}
}

class Factors extends Thread {
	private int n;
	private SharedItem si;

	public Factors(int n, SharedItem si) {
		super();
		this.n = n;
		this.si = si;
	}

	public void run() {
		try {
			si.print_fact_to_5(n);
		} catch (InterruptedException e) {
		}
	}
}
public class DemoSyncMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SharedItem si1 = new SharedItem();
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		EvenNumber en = new EvenNumber(n, si1);
		Factors fa = new Factors(n, si1);
		
		en.start();
		fa.start();
	}
}
