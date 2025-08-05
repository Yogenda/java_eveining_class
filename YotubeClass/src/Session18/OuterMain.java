package Session18;

public class OuterMain {
	public static void main(String[] args) {
//		OuterClass.InnerClass <object> = 
//		OuterClassObj. new InnerClass();
		Outer o1 = new Outer();
		o1.get(5);
		Outer.Inner i1 =  o1. new Inner();
		i1.put();		
	}
}
