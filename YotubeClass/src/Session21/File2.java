package Session21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File2 {
	public static void main(String[] args)throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream
				("E:\\java youtube classes\\fileEx\\demo.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("write some text: ");
		String str = sc.nextLine();
		//hello how are you
		for(int i =0;i<str.length();i++) {
			char ch = str.charAt(i);
			int n = ch;
			fos.write(n);
		}
		fos.close();
		System.out.println("Data written sucessfully....");
	}
}
