package Session21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File7 {
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader(
				"E:\\java youtube classes\\fileEx\\Books.txt");
		BufferedReader br = new BufferedReader(fr);
//		BufferedReader br = new BufferedReader(new FileReader(
//				"E:\\java youtube classes\\fileEx\\Books.txt"));
		String str = br.readLine();
		while(str!=null) {
			System.out.println(str);
			str= br.readLine();
		}
		br.close();
		fr.close();
	}
}
