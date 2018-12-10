package methods;

/**
 * What is Method? : 
 * 	- Method is a block of codes which performers some business logic
 * 	- To achieve better code reusablity , 
 * 
 * How many types of methods are there in java?
 * 	- There are 2 types of method in java and those are
 * 		- Non-Parameterized Method
 * 			- Non-Parameterized method will not have any parameters in the method definition
 * 		- Parameterized Method
 * 			-Parameterized method will have parameters in the method definition
 * 			-There is no limit to define number of parameters
 * 			-Parameters can be any DataType or ClassType
 * 
 * How to Write a Non-Parameterized Method in Java ?
 * 
 * Syntax : <AccessModifer> <ReturnType> <MethodName> (){
 * 			Business Logic/java statement-1;
 * 			Business Logic/java statement-2;
 * }
 * e.g : <public/protected/private/default> <void/int/String/Char/anyDatatype or ClassType> <providedByUser> (){
 * 
 * 		System.out.println("I am inside a Non-Parameterized method"); 
 * 		//Business Logic/java statement-1;
 * 		int a = 1; //Business Logic/java statement-2;
 * 		.
 * 		..Continue your java statements;
 * }
 * 
 * e.g:Non-Parameterized method-1 without Return type
 * 
 * public void printUserName(){
 * 		String userName = "Aruna Kumari";
 * 		System.out.println(userName);
 * }
 * 
 * How to Call a Non-Parameterized Method?
 * 
 * 	- until unless you call the method -  the Code inside the method will not be executed
 * 	- for using a method you need to call it when there is need to execute the business logic which inside the method
 * 	- so for calling the Non-Parameterized method which is present in same class as the caller when there is need follow like: <methodName>()
 * 	- eg: main method wants to call printUserName method
 * 	- So main method is the caller method which is calling printUserName method
 * 	- so for calling printUserName inside main method , I need to write printUserName();
 */

public class NonParametrizedMethod_WithoutReturnType {
	
	public static void main(String[] args) {
		printUserName();
	}
	
	//Non-Parameterized method-1 without Return type
	public static void printUserName(){
		String userName = "Aruna Kumari";
		System.out.println(userName);
	}		

}
