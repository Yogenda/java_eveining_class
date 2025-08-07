package Session20;

import java.io.IOException;

public class Except4 {
	public static void main(String[] args){
		try {
			System.out.println("Enter any alphabet: ");
			int ch = System.in.read(); //IOException
			System.out.println("Our Alphabet is: "+(char)ch);
		}catch(IOException ioe) {
			ioe.getMessage();
		}
		
	}	
}
