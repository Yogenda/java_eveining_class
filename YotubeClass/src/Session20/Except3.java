package Session20;

import java.io.IOException;

public class Except3 {
	public static void main(String[] args) throws IOException{
		System.out.println("Enter any alphabet: ");
		int ch = System.in.read(); //IOException
		System.out.println("Our Alphabet is: "+(char)ch);
	}	
}
