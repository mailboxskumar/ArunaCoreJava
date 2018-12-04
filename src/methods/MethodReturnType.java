package methods;

public class MethodReturnType {

	public static void main(String[] args) {
		
		//Main method needs the division of a and b value from divideTwoNumbers
		int div;
		
		// divideTwoNumbersWithReturnType method return a int type value 
		// So the caller method which is main method should store the return type value in int only 
		
		div = divideTwoNumbersWithReturnType(10,5);
		System.out.println("Value of x after returning :" + div);
		
		int testname;
		// returnAString method returning a String value. We cannot store String in a integer.
		//testname = returnAString("Selenium");
		
		String studentName;
		studentName = returnAString("Selenium");
		System.out.println(studentName);
		
		System.out.println(returnAString("Selenium"));
		
		//Method is returning a class object
		JavaMethods javaMethods;
		javaMethods = returnClassObject();
		
		javaMethods.addTwoNumbers();
		javaMethods.addTwoNumbersNew(1, 2);
	}
	
	
	// Public: AccessModifier Type
	// Void : Method Return Type
	// divideTwoNumbers : User defined Method name
	
	// Return type is mandatory in java methods
	// Void Return type is default , which will return no value
	
	public void divideTwoNumbers(int a ,int b) {
	}
	
	//Method : divideTwoNumbersWithReturnType :  Returns a int type value
	public static int divideTwoNumbersWithReturnType(int c ,int d) {
		int x;
		x = c/d;
		System.out.println("Value of x before returning :" + x);
		return x;
	}
	
	//Return a String from method
	public static String returnAString(String username) {
		
		String lastname = " Automation";
		String fullname = username + lastname;
		
		return fullname;
	}
	
	//Return a class object from a method
	public static JavaMethods returnClassObject() {
		return new JavaMethods();
	}
	

}
