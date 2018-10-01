package vanvtt.trainer.nestedinterface.example;

public class TestingClass implements TestClass.TestIn {

	@Override
	public void show() {
		System.out.println("Show method of interface into TestingClass");
		
	}

}
