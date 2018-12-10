package methods;

/**
 * 	What is Return Type?
 * 
 * 		- Return type is nothing but when a method executes some business logic
 * 		- and returns some value for further usage by other members
 * 
 *   Brief description about Method ReturnType:
 *   
 *  	1. Return Type is mandatory in Java Methods
 *  	2. By Default the ReturnType of Java Method is void
 *  	3. Void Return type means : that particular method does not return any value
 *  	4. If the method RetunType is other then void then the method should return same dataType value
 *  	5. The last java statement of the method should be return <aVariable/ClassObject_WIthSameDataType>
 *  	5. eg. if the return type is int , then the method should return int value
 *  	6. eg. if the return type is String , then the method should return String value
 *  	7. eg. if the return type is a ClassType , the the method should return a class value/object
 *  
 *e.g:Non-Parameterized method-2 with a String Return type
 * public String printUserName(){
 * 		String userName = "Aruna Kumari";
 * 		System.out.println(userName);
 * 		return userName;
 * }
 */

public class NonParametrizedMethod_WithReturnType {
	
	public static void main(String[] args) {}
	
	//Non-Parameterized method-1 with String Return type
	public String printUserName(){
		String userName = "Aruna Kumari";
		System.out.println(userName);
		return userName;
	}		

	
	
	

}
