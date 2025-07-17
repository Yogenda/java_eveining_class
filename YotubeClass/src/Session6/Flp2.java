package Session6;

public class Flp2 {
	public static void main(String[] args) {
		for(int x=2; x<=20;x+=2) {
			System.out.print(x+"  ");
		}
		System.out.println("--------------");
		for(int x=20; x>=1;x--) {
			if(x%2==0) {
				System.out.print(x+"  ");
			}
		}
	}
}
