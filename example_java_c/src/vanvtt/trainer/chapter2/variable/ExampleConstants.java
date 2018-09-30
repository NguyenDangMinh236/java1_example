package vanvtt.trainer.chapter2.variable;

public class ExampleConstants {
	/**
	 * Static Modifier
	 * 
	 * Explain:
	 * Allows a variable to be used without first
	 * creating an instance of the class; a static class member is associated
	 * with the class itself, rather than an object. All class instances share
	 * the same copy of the variable.
	 */
	static int days_in_week = 7;
	
	/**
	 * Final Modifier
	 * 
	 * Explain:
	 * The final modifier means that the variable's value cannot change. Once the value is assigned, it cannot be reassigned. 
	 * 
	 * Note:
	 * Primitive data types (i.e., int, short, long, byte, char, float, double, boolean) can be made immutable/unchangeable using the final modifier.
	 */
	static final int DAYS_IN_WEEK = 7;
	
	static void main(String[] args) {
		System.out.println(ExampleConstants.days_in_week);
	}
}
