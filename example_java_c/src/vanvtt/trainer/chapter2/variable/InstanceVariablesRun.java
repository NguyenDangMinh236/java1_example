package vanvtt.trainer.chapter2.variable;

public class InstanceVariablesRun {
	
	/**
	 * As you can see in the above program the variables, engMarks , mathsMarks
	 * , phyMarksare instance variables. In case we have multiple objects as in
	 * the above program, each object will have its own copies of instance
	 * variables. It is clear from the above output that each object will have
	 * its own copy of instance variable.
	 *
	 */
	public static void main(String args[]) { // first object
		InstanceVariables obj1 = new InstanceVariables();
		obj1.engMarks = 50;
		obj1.mathsMarks = 80;
		obj1.phyMarks = 90;

		// second object
		InstanceVariables obj2 = new InstanceVariables();
		obj2.engMarks = 80;
		obj2.mathsMarks = 60;
		obj2.phyMarks = 85;

		// displaying marks for first object
		System.out.println("Marks for first object:");
		System.out.println(obj1.engMarks);
		System.out.println(obj1.mathsMarks);
		System.out.println(obj1.phyMarks);

		// displaying marks for second object
		System.out.println("Marks for second object:");
		System.out.println(obj2.engMarks);
		System.out.println(obj2.mathsMarks);
		System.out.println(obj2.phyMarks);
	}
}
