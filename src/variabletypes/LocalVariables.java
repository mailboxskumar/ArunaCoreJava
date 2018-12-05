package variabletypes;

public class LocalVariables {
	
	/**
	 * Local Variables : is local to a method 
	 * In below methods b is local to main method
	 * b cannot be accessed by any member outside main method
	 * c is local variable to prinntIt method and cannot be access by any member outsides
	 */

	public static void main(String[] args) {
		// b is local variable to main method
		int b = 10;
		System.out.println(b);
	}

	public void printIt() {
		// c variable is local to printIT method
		int c = 10;
		System.out.println(c);
	}

}
