package vanvtt.trainer.chapter4;

import java.util.Scanner;

public class ExampleIfStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// if statement
		System.out.println("Hay nhap vao 1 so: ");
		int num_input = scanner.nextInt();
		if (num_input % 2 == 0) {
			System.out.println("num_input = " + num_input + " - la so chan");
		}
		
		
		// if - else statement
		System.out.println("\n======if - else statement example ");
		if (num_input % 2 == 0) {
			System.out.println("num_input = " + num_input + " - la so chan");
		} else {
			System.out.println("num_input = " + num_input + " - la so le");
		}
		
		System.out.println("\n=======if - else if - else");
		if_else_statement(num_input);
		
		nested_if_statement();
		
	}
	
	public static void if_else_statement(int number) {
		if(number == 2) {
			System.out.println("num = " + number + " - thu 2");
		} else if(number == 3) {
			System.out.println("num = " + number + " - thu 3");
		}else if(number == 4) {
			System.out.println("num = " + number + " - thu 4");
		}else if(number == 5) {
			System.out.println("num = " + number + " - thu 5");
		}else if(number == 6) {
			System.out.println("num = " + number + " - thu 6");
		}else if(number == 7) {
			System.out.println("num = " + number + " - thu 7");
		}else if(number == 8) {
			System.out.println("num = " + number + " - chu nhat");
		}else {
			System.out.println("num = " + number + " - invalid");
		}		
	}
	
	// Nested if statement
	public static void nested_if_statement() {
		System.out.println("Nghe nghiep:");
		System.out.println("1 - Nhan Vien");
		System.out.println("2 - Sinh Vien");
		System.out.println("Hay nhap so ban chon");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num == 1 || num == 2) {
			System.out.println("Hello");
			if(num == 1) {
				System.out.println("Nhan vien");
			} else {
				System.out.println("Sinh Vien");
			}
		} else {
			System.out.println("Nhap sai oy nhe");
		}
	}

}
