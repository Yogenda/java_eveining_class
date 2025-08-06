package Session19;

public class OuterMain {
	public static void main(String[] args) {

//Member Inner class
		Outer o1 = new Outer();
		o1.get(5);
		Outer.Inner i1 = o1.new Inner();
		i1.put();
//Member Inner class using Interface
		Outer4 o4 = new Outer4();
		o4.get(5);
		Outer4.Inner4 i4 = o4.new Inner4();
		i4.put();
		
//local inner class
		Outer2 o2 = new Outer2();
		o2.get(4);
		o2.show();
		
// static inner class
//OuterClass.InnerClass obj = new outerClass.InnerClass();
		Outer3 o3 = new Outer3();
		o3.get(3);
		Outer3.Inner3 i3 = new Outer3.Inner3();
		i3.square();
		Outer3.Inner3.cube();
		
	}
}
