package Session14;

public class Parent2 {
	Parent2(int p, int q) {
		System.out.println("Parent constructor");
		System.out.println("P: "+p+"\t"+"Q: "+q);
	}
}
class Child2 extends Parent2 {
	Child2(int a, int b, int c){
		super(b,c);
		System.out.println("Child constructor");
		System.out.println("A value: "+a);
	}
}
