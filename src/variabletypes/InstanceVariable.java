package variabletypes;

public class InstanceVariable {

	/**
	 * Instance variable will hold an object reference of a class not any value
	 */

	// Instance variable
	static InstanceVariable instanceVar;

	public static void main(String[] args) {
		instanceVar = new InstanceVariable();
		InstanceVariable instanceVar1 = new InstanceVariable();
	}

}
