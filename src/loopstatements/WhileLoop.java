package loopstatements;

public class WhileLoop {

	// Problem Statement : I want to print numbers from 1 to 10

	static int a = 1;

	public static void main(String[] args) {

		while (a <= 10) {
			System.out.println("Current value of a is: " + a);
			a++;
			// a = a + 1;
		}
	}

}
