package variabletypes;

public class ClassVariable {

	// Class variables

	static int a = 10;
	String str = "aruna";
	float ft = 10.0f;
	double dt = 10.32;

	static ClassVariable classvar;

	public static void main(String[] args) {
		// b is local variable to main method
		int b = 10;

		System.out.println(a); // a is class variable of class ClassVariable

		// System.out.println(c); //Error: c is local variable of printIt method. so
		// main method cannot access it.
	}

	public void printIt() {
		// c variable is local to printIT method
		int c = 10;

		System.out.println(str); // str is class variable of class ClassVariable which can be access by any
									// member
									// of the class

		// System.out.println(b); Error: b is local variable of main method. so printIt
		// cannot access it
	}

}
