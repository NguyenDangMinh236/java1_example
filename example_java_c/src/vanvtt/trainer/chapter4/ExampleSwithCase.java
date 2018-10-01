package vanvtt.trainer.chapter4;

import java.util.Scanner;

public class ExampleSwithCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap mot so: ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Addition");
			break;
		case 2:
			System.out.println("Subtraction");
			break;
		case 3:
			System.out.println("Multiplication");
			break;
		case 4:
			System.out.println("Division");
			break;
		default:
			System.out.println("Invalid Choice");
		}
		
		nested_switch_case();

	}

	public static void nested_switch_case() {

		// String declaration
		String day = "Monday";
		String hour = "am";

		// Outer switch statement
		switch (day) {
		case "Sunday":
			System.out.println("Sunday is a Holiday...");

			// Inner switch statement
			switch (hour) {
			case "am":
				System.out.println("Good Morning");
				break;
			case "pm":
				System.out.println("Good Evening");
				break;
			} // End of inner switch-case statement
			break; // Terminates the outer case statement

		case "Monday":
			System.out.println("Monday is a Working Day...");
			switch (hour) {
			case "am":
				System.out.println("Good Morning");
				break;
			case "pm":
				System.out.println("Good Evening");
				break;
			} // End of inner switch-case statement
			break;

		default:

			System.out.println("Invalid Day");
		} // End of the outer switch-case statement
	}

}
