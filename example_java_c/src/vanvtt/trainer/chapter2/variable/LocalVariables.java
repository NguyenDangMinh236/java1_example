package vanvtt.trainer.chapter2.variable;

public class LocalVariables {
	/**
	 * Local Variables
	 * A variable defined within a block or method or constructor is called local variable.
	 * 
	 * These variable are created when the
	 * block in entered or the function is called and destroyed after exiting
	 * from the block or when the call returns from the function. The scope of
	 * these variables exists only within the block in which the variable is
	 * declared. i.e. we can access these variable only within that block.
	 */
	public void StudentAge() {
		// local variable age
		int age = 0;
		age = age + 5;
		System.out.println("Student age is : " + age);
	}

	public static void main(String args[]) {
		LocalVariables obj = new LocalVariables();
		obj.StudentAge();
	}
	
	/**
	 * Example lỗi:
	 * Mesage: error: cannot find symbol + age);
	 public void StudentAge() {
	 	//local variable age 
        int age = 0; 
        age = age + 5; 
    } 
  
    public static void main(String args[]) {    
        //using local variable age outside it's scope 
        System.out.println("Student age is : " + age); 
    } 
	 */
}

