package Session18;

public class Poly2 {
	void big(int x, int y) {
		if(x>y)
			System.out.println(x +" and "+y+" Big No: "+x);
		else
			System.out.println(x +" and "+y+" Big No: "+y);
	}
	void big(float x, float y) {
		if(x>y)
			System.out.println(x +" and "+y+" Big No: "+x);
		else
			System.out.println(x +" and "+y+" Big No: "+y);
	}
	void big(int x, float y) {
		if(x>y)
			System.out.println(x +" and "+y+" Big No: "+x);
		else
			System.out.println(x +" and "+y+" Big No: "+y);
	}
}
