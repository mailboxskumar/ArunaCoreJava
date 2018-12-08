package conditionalstatements;

public class NestedIfElseCondition {

	static int a = 1;
	static int b = 10;

	static int c = 20;
	static int d = 30;

	public static void main(String[] args) {

		// Nested if else condition example

		if (a > b) {
			System.out.println("a is greater then b");
			if (c > d) {
				System.out.println("c is greater than d");
			} else {
				System.out.println("c is smaller than d");
			}

		} else {
			System.out.println("a is leser than b");
			if (c < d) {
				System.out.println("c is smaller than d");
			}
		}

	}

}
