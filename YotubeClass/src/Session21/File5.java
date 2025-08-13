package Session21;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File5 {
	public static void main(String[] args)throws IOException, FileNotFoundException {
		FileWriter fw = new FileWriter
				("E:\\java youtube classes\\fileEx\\demo1.txt",true);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your text: ");
		String str = sc.nextLine();
	
		str = "\n"+ str;
//		str = " "+ str;
		
		fw.write(str);
		fw.close();
		System.out.println("Data added sucessfully...");
	}
}
