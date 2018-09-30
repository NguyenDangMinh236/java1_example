package vanvtt.trainer.lms;

import java.util.ArrayList;
import java.util.List;

public class Batch {

	public String name;
	public SessionNameEnum sessionName;

	public List<Student> Students = new ArrayList<>();

	public void setStudents(List<Student> students) {
		if (students != null) {
			this.Students = students;
		}
	}

	public void printStudentList() {
		for (int i = 0; i < this.Students.size(); i++) {
			this.Students.get(i).print();
		}
	}

	public String getFriendlySessionName() {

		String friendlyName;

		switch (this.sessionName) {
		case EvenDay:
			friendlyName = "Monday - Wednesdat - Friday";
			break;
		case OddDay:
			friendlyName = "Tuesday - Thursday - Saturday";
			break;
		default:
			friendlyName = "Unknown";
			break;
		}

		return friendlyName;
	}
}
