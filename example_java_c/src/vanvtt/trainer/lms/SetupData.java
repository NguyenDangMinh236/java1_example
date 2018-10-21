package vanvtt.trainer.lms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SetupData {
	public static List<Student> getDefaultData() {
		Student s1 = new Student();
		s1.code = "X001";
		s1.name = "Ngo Thanh Tung";
		s1.dateOfBirth = new Date("1993/09/12");
		s1.mark1 = 10;
		s1.mark2 = 8;
		s1.mark3 = 9;
		s1.checkIn(SubjectNameEnum.Java);
		s1.checkIn(SubjectNameEnum.CSharp, new Date("2012/09/12"));
		s1.checkIn(SubjectNameEnum.Xml, new Date("2013/09/10"));

		// ================
		Student s2 = new Student();
		s2.code = "X002";
		s2.name = "Nguyen Van Khanh";
		s2.dateOfBirth = new Date("1990/21/12");

		s2.mark1 = 9;
		s2.mark2 = 8;
		s2.mark3 = 10;

		s2.checkIn(SubjectNameEnum.Html, AttendanceStatusEnum.Allowed.toString());
		s2.checkIn(SubjectNameEnum.Java);
		s2.checkIn(SubjectNameEnum.CSharp, new Date("2013/09/10"));
		s2.checkIn(SubjectNameEnum.Xml, new Date("2013/09/12"));

		// ====================
		Student s3 = new Student();
		s3.code = "X003";
		s3.name = "Tran Van Binh";
		s3.dateOfBirth = new Date("1990/21/12");
		s3.mark1 = 6;
		s3.mark2 = 7;
		s3.mark3 = 6;

		s3.checkIn(SubjectNameEnum.Java);
		s3.checkIn(SubjectNameEnum.CSharp, new Date("2014/09/09"));
		s3.checkIn(SubjectNameEnum.Xml, new Date("2014/09/12"));

		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		return list;
	}
}
