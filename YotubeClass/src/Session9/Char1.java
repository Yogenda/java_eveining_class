package Session9;

public class Char1 {
	public static void main(String[] args) {
		String str = "Best YouTube Channel to learn Programming";
		System.out.println("String value is: "+str);
		System.out.println("Upper case Str: "+str.toUpperCase());
		System.out.println("Lower case Str: "+str.toLowerCase());
		System.out.println("Length of Str: "+str.length());
		System.out.println("First char: "+str.charAt(0));
		System.out.println("First char: "+str.charAt(1));
		System.out.println("First char: "+str.charAt(2));
		for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(i));
	}
}
