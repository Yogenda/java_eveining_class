package Session14;

public class MultiMain {
	public static void main(String[] args) {
		Marksheet ms = new Marksheet();
		ms.getStdInfo("Hemant", "Java");
		ms.getStdMarks(45, 40);
		ms.printResutl();
	}
}
