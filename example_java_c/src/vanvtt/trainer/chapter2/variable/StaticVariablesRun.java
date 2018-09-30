package vanvtt.trainer.chapter2.variable;

public class StaticVariablesRun {
	public static void main(String args[]) {

		// accessing static variable without object
		StaticVariables.salary = 1000;
		System.out.println(StaticVariables.name + "'s average salary:" + StaticVariables.salary);
	}

}
