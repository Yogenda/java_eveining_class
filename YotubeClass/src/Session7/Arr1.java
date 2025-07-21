package Session7;

public class Arr1 {
	public static void main(String[] args) {
		int x[] = {10,20,30,40,50,60,70,80};
//		System.out.println(x);
		System.out.println("First value: "+x[0]);
		System.out.println(x[0]+"\t"+x[1]+"\t"+x[2]+"\t"+
				x[3]+"\t"+x[4]);
		System.out.println("length of array is: "+x.length);
		for(int i=0;i<=x.length-1;i++) {
			System.out.print(x[i]+" ");
		}
	}
}
