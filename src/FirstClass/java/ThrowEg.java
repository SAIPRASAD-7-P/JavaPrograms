package FirstClass.java;

public class ThrowEg {

	public static void main(String[] args) {
		
		//create custom exception using throw keyword
		
		int age=9;
		if(age<18) {
			throw new ArithmeticException("Persin is eligible for voting");		
			
		}
	}
}