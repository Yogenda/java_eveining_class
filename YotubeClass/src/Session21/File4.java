package Session21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// read the data from file and copy to anoter file.
public class File4 {
	public static void main(String[] args)throws FileNotFoundException, IOException {
		FileInputStream fis  = new FileInputStream(
				"E:\\java youtube classes\\fileEx\\demo.txt");
		FileOutputStream fos = new FileOutputStream(
				"E:\\java youtube classes\\fileEx\\demoCopy.txt");
		int ch = fis.read();
		
		while(ch != -1) {
			System.out.print((char)ch);
			fos.write(ch);
			ch = fis.read();
		}
		fis.close();
		fos.close();
		System.out.println("copy of main file created....");
	}
}
