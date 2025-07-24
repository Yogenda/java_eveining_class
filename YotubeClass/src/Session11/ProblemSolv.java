package Session11;

public class ProblemSolv {
//- Write a program to extract all even number 
//	from double dimensional array, then add those 
//	values into single dimensional array, then print
	public static void main(String[] args) {
		int [][] twoDimArr= {{1,2,3},{4,5,6},
				{7,8,9},{10,11,12}};
		// count the even numbers
		int evenCount=0;
		for(int i=0; i<twoDimArr.length;i++) {
			for(int j=0; j<twoDimArr[i].length;j++) {
				if(twoDimArr[i][j]%2==0) {
					evenCount++;
				}
			}
		}
		
		int[] oneDimArr =new int[evenCount];
		int index =0;
		
		//one dim array create
		for(int i=0;i<twoDimArr.length;i++) {
			for(int j=0;j<twoDimArr[i].length;j++) {
				if(twoDimArr[i][j]%2==0) {
					oneDimArr[index++]=twoDimArr[i][j];
				}
			}
		}
		//result print
		System.out.println("Even nubmers from 2d array");
		for(int num: oneDimArr) {
			System.out.print(num+" ");
		}
		
	}
}
