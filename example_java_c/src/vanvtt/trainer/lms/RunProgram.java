package vanvtt.trainer.lms;

import java.util.List;

public class RunProgram {
	public static void main(String[] args) {

		List<Student> list = SetupData.getDefaultData();

		Batch batch = new Batch();
		batch.setStudents(list);

		batch.printStudentList();
	}
}
