package Session21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File1 {
	public static void main(String[] args)throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream
				("E:\\java youtube classes\\fileEx\\demo.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("write some text: ");
		String str = sc.nextLine();
		
		// it will convert the string into bits and bytes
		byte arr[] = str.getBytes(); 
		
		// data has been written into file.
		fos.write(arr);
		
		fos.close();
		System.out.println("Data written sucessfully....");
		
	}
}
