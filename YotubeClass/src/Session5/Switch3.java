package Session5;

public class Switch3 {
	public static void main(String[] args) throws Exception {
		System.out.println("Enter your alphabet: ");
		int ch = System.in.read(); 
		System.out.println("you have entered: "+(char)ch);
		switch((char)ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("it is a vovel");
			break;
		default:
			System.out.println("it is not vovel");
			break;
		}
	}
}
