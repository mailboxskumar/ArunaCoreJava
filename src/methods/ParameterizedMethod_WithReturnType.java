package methods;

/**
 * How to Write a Parameterized Method in Java ?
 
 * Syntax : <AccessModifer> <ReturnType> <MethodName> (dataType1 var1,dataType2 var2.......dataTypeN varN){
 * 			Business Logic/java statement-1;
 * 			Business Logic/java statement-2;
 * }
 * e.g : <public/protected/private/default> <void/int/String/Char/anyDatatype or ClassType> <providedByUser> (int a, String b){
 * 
 * 		System.out.println("I am inside a Parameterized method"); //Business Logic/java statement-1;
 * 		int a = 1; //Business Logic/java statement-2;
 * 		.
 * 		..Continue your java statements;
 * }
 * 
 * e.g-1:Parameterized method-1 without Return type and 1 String Parameter
 * 
 * public void printUserNameWithOneParameter(String userName){ 
 * 		System.out.println("Aruna Kumari");
 * }
 * 		-printUserNameWithOneParameter method takes one Parameter and the dataType of the parameter is String
 *
 * e.g-2:Parameterized method-2 without Return type and 2 Parameters ( 1 is int and other is String)
 * 
 * public void printUserNameWithTwoParameters(int counter,String userName){ 
 * 		System.out.println("Aruna Kumari");
 * }
 * 		-printUserNameWithTwoParameters method takes two Parameters
 * 		-1st parameter is a int dataType and the Parameter name is counter
 * 		-2nd parameter is a String dataType and the parameter name is userName
 * 
 * e.g-3:Parameterized method-3 with a int Return type and 2 int Parameters
 * 
 * public int addTwoNumbersAndReturnTheSum(int counter,int counter1){
 * 			int sum;
 * 			sum = counter + counter1;
 * 			return sum;
 * }
 * 		-addTwoNumbersAndReturnTheSum method takes two Parameters
 * 		-1st parameter is a int dataType and the Parameter name is counter
 * 		-2nd parameter is a int dataType and the parameter name is counter1
 * 		-addTwoNumbersAndReturnTheSum Method returns a int value
 * 		-So the last java statement of addTwoNumbersAndReturnTheSum method should be : return <intvariable>
 * 		-In above example the the return statement is like: return sum;
 *
 */

public class ParameterizedMethod_WithReturnType {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
