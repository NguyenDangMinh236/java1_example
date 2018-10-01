package vanvtt.trainer.nestedClass.example;

import vanvtt.trainer.inheritance.supperAbstracClass.ANhanVien;
/*
 * sử dụng loại Inner Class này khi bạn muốn ghi đè phương thức của lớp hoặc Interface
 */
public class AnonymousInnerExample {
	public static void main(String args[]) {

		// phan code khai bao va khoi tao mot lop Inner Class
		ANhanVien nhanVien = new ANhanVien("vanvtt", "001"){
			public String boPhan(){
				return "dev";
			}
			
		};// phan ket thuc

		nhanVien.boPhan();
		nhanVien.xuatThongTin();
	}
}
