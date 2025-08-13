package Session21;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File8 {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name: ");
		String fname = sc.next();
		
		File f = new File(
				"E:\\java youtube classes\\fileEx\\"+fname);
		
		if(f.exists()==true)
			System.out.println("File already exist...");
		else {
			f.createNewFile();
			System.out.println("File created....");
		}
			
		
	}
}
