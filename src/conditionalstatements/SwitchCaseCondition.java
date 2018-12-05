package conditionalstatements;

public class SwitchCaseCondition {

	public static void main(String[] args) {

		// I want to print week day name bases upon a input no
		// e.g if my number is 1, I want to print Sunday
		// e.g if my number is 2, I want to print Monday and so on

		int day = 8;
		String str = "Height";

		switch (day) {
		case 1:
			System.out.println("Current day is Sunday");
			break;
		case 2:
			System.out.println("Current day is Monday");
			break;
		case 3:
			System.out.println("Current day is Tuesday");
			break;
		case 4:
			System.out.println("Current day is Wednesday");
			break;
		case 5:
			System.out.println("Current day is Thrusday");
			break;
		case 6:
			System.out.println("Current day is Friday");
			break;
		case 7:
			System.out.println("Current day is Saturday");
			break;
		default:
			System.out.println("the value entered is wrong");

		}
		
		swtichCaseCallingFromMethod(str) ;
	}

	public static void swtichCaseCallingFromMethod(String field) {
		System.out.println("Executing When");
		switch (field) {
		case "Date Of Birth":
			System.out.println(field);
			break;
		case "Gender":
			System.out.println(field);
			break;
		case "Height":
			System.out.println(field);
			break;
		case "Location":
			System.out.println(field);
			break;
		}
	}

}
