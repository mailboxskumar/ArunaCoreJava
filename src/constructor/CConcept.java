package constructor;

public class CConcept {

	/**
	 * Constructor is to create class objects in java. Constructor name should be
	 * same as class name Constructor access modifier should be same as class access
	 * modifier Constructor cannot return any value but method can
	 * 
	 * There are 2 types constructor -Default Constructor / Non Parameterized
	 * constructor -Parameterized constructor - paramteres each construcotr shoul
	 * contain different type and number of parametere(s)
	 */

	String myName = "Test";

	// Default Constructor / Non Parameterized constructor
	
	public CConcept() {
		Test testobj = new Test();
		System.out.println("I am inside default constructor");
	}

	// Parameterized constructor

	public CConcept(int a, int b) {
		System.out.println(a + b);

	}

	public CConcept(int c, int d, int e) {
		System.out.println(c + d + e);
	}

	public CConcept(String str) {
		System.out.println(str);

	}

	public CConcept(float f) {
		System.out.println(f);

	}

	public void test() {
		System.out.println("test");
		System.out.println("test2");
		System.out.println("test1");
	}

	public static void main(String[] args) {

		CConcept constConcept = new CConcept();

		CConcept constConcept1 = new CConcept(1, 2);

		CConcept constConcept2 = new CConcept(1, 2, 3);

		CConcept constConcept3 = new CConcept("ConstrucorString");

		CConcept constConcept4 = new CConcept(2.0f);

		Test testobj = new Test();
		System.out.println(constConcept.myName);
		constConcept.test();
	}

}
