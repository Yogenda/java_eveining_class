package Session21;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File6 {
	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter(
				"E:\\java youtube classes\\fileEx\\Books.txt");
		Scanner sc = new Scanner(System.in);
		String ch = "";
		
		do {
			System.out.println("Enter the name of book: ");
			String bname = sc.next();
			System.out.println("Enter the Price of book: ");
			float price = sc.nextFloat();
			System.out.println("Enter the name of Autor: ");
			String author = sc.next();
			
			String result = bname+ "\t"+ price+"\t"+author;
			fw.write(result);
			System.out.println("Do you want to add more books Y/N: ");
			ch = sc.next();
		}
		while(ch.equalsIgnoreCase("Y"));
		fw.close();
		System.out.println("Data added .....");
		
	}
}
