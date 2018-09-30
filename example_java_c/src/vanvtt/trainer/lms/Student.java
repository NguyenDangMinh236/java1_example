package vanvtt.trainer.lms;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student {
	// Fields

	private final String center = "SOFTECH APTECH - DANANG, VIETNAM";
	public String code;
	public String name;
	public Date dateOfBirth;
	public double mark1;
	public double mark2;
	public double mark3;

	public List<Attendance> Attendances = new ArrayList<>();

	// This is constructor without paramerters
	public Student() {

	}

	// This is constructor within paramerters
	public Student(String code) {
		this.code = code;
	}

	public void enter() {
		System.out.println("-------------------------------------------------");
		System.out.println("ENTER DATA");
		System.out.println("-------------------------------------------------");

		Scanner in = new Scanner(System.in);
		System.out.print("Enter code: ");
		this.code = in.next();

		System.out.print("Enter Date Of Birth: ");
		this.dateOfBirth = new Date(in.next());

		System.out.print("Enter Mark1: ");
		this.mark1 = in.nextFloat();
	}

	public void print() {
		System.out.println("-------------------------------------------------");
		System.out.println("PRINT DETAILS");
		System.out.println("-------------------------------------------------");
		System.out.format("Center: %s\n", this.center);
		System.out.format("Code: %s\n", this.code);

		// DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,
		// Locale.ENGLISH);
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy");

		System.out.format("DateOfBirth: %s\n", sf.format(this.dateOfBirth));
		System.out.format("Mark1: %.2f\n", this.mark1);
		System.out.format("Mark2: %.2f\n", this.mark2);
		System.out.format("Mark3: %.2f\n", this.mark3);
		System.out.format("Average Mark: %.2f\n", this.getAverageMark());
		System.out.format("Level: %s\n", this.getLevel());

		System.out.println("\n\n");
	}

	public double getAverageMark() {
		double average = (this.mark1 + this.mark1 + this.mark3) / 3;
		return Math.round(average * 10.0) / 10.0;
	}

	public void checkIn(SubjectNameEnum subject) {
		Attendance attendance = new Attendance();
		attendance.subject = subject;
		attendance.attendanceDate = new Date();
		attendance.status = AttendanceStatusEnum.Late;

		this.Attendances.add(attendance);
	}

	public void checkIn(SubjectNameEnum subject, Date checkInDate) {
		Attendance attendance = new Attendance();
		attendance.subject = subject;
		attendance.attendanceDate = checkInDate;
		attendance.status = AttendanceStatusEnum.Present;

		this.Attendances.add(attendance);
	}

	public String getLevel() {
		double averageMark = this.getAverageMark();
		String level = "";

		if (averageMark >= 9) {
			level = "EXCELLENT";
		} else if (averageMark >= 8) {
			level = "GOOD";
		} else if (averageMark >= 6.5) {
			level = "WELL";
		} else if (averageMark >= 5) {
			level = "NORMAL";
		} else {
			level = "BAD";
		}

		return level;
	}
}
