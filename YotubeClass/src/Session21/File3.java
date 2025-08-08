package Session21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File3 {
	public static void main(String[] args)throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream
				("E:\\java youtube classes\\fileEx\\demo.txt");
		int ch = fis.read();
		while(ch != -1) {
			System.out.print((char)ch);
			ch = fis.read();
		}
		fis.close();
	}
}
