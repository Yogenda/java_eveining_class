package Session4;

import java.util.Scanner;

public class Eg6 {
	//Accept person age and gender, then check marriage eligibility
	// male: age>= 21 and gender=male
	// female: age >=18 and gender = female
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your gender Male/Female: ");
		String gender = sc.next();

		if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female")) {
			System.out.println("Enter your age: ");
			int age = sc.nextInt();
			if(gender.equals("Male")) {
				if(age>=21) {
					System.out.println("You can do marriage");
				}
				else {
					System.out.println("Sorry you have wait");
				}
			}
			if(gender.equalsIgnoreCase("Female")) {
				if(age>=18) {
					System.out.println("You can do marriage");
				}
				else {
					System.out.println("Sorry you have wait");
				}
			}
		}
		else {
			System.out.println("Other gender");
		}
		
	}
}
