package vanvtt.trainer.chapter2.variable;

public class TestVariablesScope {
	/**
	 * Member Variables (Class Level Scope)
	 * khởi tạo khi chương trình được start debug để thấy
	 */
	static int x = 11;
	private int y = 33;

	/**
	 * Each object will have its own copy of instance variable whereas We can
	 * only have one copy of a static variable per class irrespective of how
	 * many objects we create. Changes made in an instance variable using one
	 * object will not be reflected in other objects as each object has its own
	 * copy of instance variable. In case of static, changes will be reflected
	 * in other objects as static variables are common to all object of a class.
	 * We can access instance variables through object references and Static
	 * Variables can be accessed directly using class name.
	 */
	public void method1(int x) {
		TestVariablesScope t = new TestVariablesScope();
		this.x = 22;
		y = 44;
		int z = x + y;// Local variable (Method level scope)

		System.out.println("Test.x: " + TestVariablesScope.x);
		System.out.println("t.x: " + t.x);
		System.out.println("t.y: " + t.y);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
	}

	public static void main(String args[]) {
		TestVariablesScope t = new TestVariablesScope();
		t.method1(5);
	}
}
