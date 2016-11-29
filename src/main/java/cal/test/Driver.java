package cal.test;

public class Driver {

	public static void main(String[] args) {
		Calculator cal = new Calculator(20, "*", 21);
		System.out.println(cal.calculate());
	}
}
