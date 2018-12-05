package conditionalstatements;

public class IfElseIfCondition {

	public static void main(String[] args) {

		// I want to print week day name bases upon a input no
		// e.g if my number is 1, I want to print Sunday
		// e.g if my number is 2, I want to print Monday and so on

		int day = 4;

		if (day == 1) {
			System.out.println("Current day is Sunday");
		} else if (day == 2) {
			System.out.println("Current day is Monday");
		} else if (day == 3) {
			System.out.println("Current day is Tuesday");
		} else if (day == 4) {
			System.out.println("Current day is Wednesday");
		} else if (day == 5) {
			System.out.println("Current day is Thrusday");
		} else if (day == 6) {
			System.out.println("Current day is Friday");
		} else if (day == 7) {
			System.out.println("Current day is Saturday");
		} else {
			System.out.println("Wrong day number entered");
		}
		
		printCurrentDay(day);

	}

	public static void printCurrentDay(int dayNo) {

		if (dayNo == 1) {
			System.out.println("Current day is Sunday");
		} else if (dayNo == 2) {
			System.out.println("Current day is Monday");
		} else if (dayNo == 3) {
			System.out.println("Current day is Tuesday");
		} else if (dayNo == 4) {
			System.out.println("Current day is Wednesday");
		} else if (dayNo == 5) {
			System.out.println("Current day is Thrusday");
		} else if (dayNo == 6) {
			System.out.println("Current day is Friday");
		} else if (dayNo == 7) {
			System.out.println("Current day is Saturday");
		} else {
			System.out.println("Wrong day number entered");
		}
	}

}
