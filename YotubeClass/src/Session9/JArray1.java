package Session9;

public class JArray1 {
	public static void main(String[] args) {
		int x[][] = {{10,20,30},{40,50},{60,70,80,90}};
		System.out.println("length of Row is: "+x.length);
		System.out.println("Value in 1st row: "+x[0].length);
		System.out.println("Value in 2nd row: "+x[1].length);
		System.out.println("Value in 3rd row: "+x[2].length);
		for(int i=0; i<x.length;i++) {//row
			for(int j = 0;j<x[i].length;j++) { //col
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
