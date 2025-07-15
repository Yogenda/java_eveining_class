package Session4;

import java.util.Scanner;

public class Eg4 {

	public static void main(String[] args) {
		// 3 values x y z which nubmer is greater
		int x = 7;
		int y = 6;
		int z = 7;
		if(x>y&&x>z) {
			System.out.println("X is greater then all");
		}
		else if(y>x&&y>z) {
			System.out.println("Y is greater then all");
		}
		else if(z>x&&z>y) {
			System.out.println("Z is greater then all");
		}
		else {
			System.out.println("Any 2 or all value may be same");
		}
	}
}
