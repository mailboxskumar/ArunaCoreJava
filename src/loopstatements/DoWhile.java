package loopstatements;

public class DoWhile {

	// Problem Statement : I want to print numbers from 1 to 10

	static int a = 1;

	public static void main(String[] args) {

		do {
			System.out.println("Current Value is :" + a);
			a++;
		} while (a <= 10);
	}
}
