package vanvtt.trainer.nhapMon;

import java.util.Scanner;

public class RunProgram {
	// https://www.javatpoint.com/Scanner-class

	/**
	 * Note:
	 * 
	 * with the input.nextInt() method - it only reads the int value. So when
	 * you continue reading with input.nextLine() you receive the "\n" Enter
	 * key. So to skip this you have to add the input.nextLine()
	 */
	public static void main(String[] args) {
		// example1();

		// example2();

		// example3();

		// block scope
		int num;
		{
			num = 3;
			System.out.println("num *2 = " + num * 2);
		}

		// nested block
		int num1 = 3;
		{
			int num2 = 3;
			System.out.println("num1 * num2 = " + num1 * num2);
		}

	}

	public static void example1() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence:\t");
		String sentence = scanner.nextLine();

		System.out.print("Enter an index:\t");
		int index = scanner.nextInt();

		System.out.println("\nYour sentence:\t" + sentence);
		System.out.println("Your index:\t" + index);
	}

	public static void example2() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu Options\n");
			System.out.println("(1) - do this");
			System.out.println("(2) - quit");

			System.out.print("Please enter your selection:\t");
			int selection = scanner.nextInt();

			if (selection == 1) {
				System.out.print("Enter a sentence:\t");
				String sentence = scanner.nextLine();

				System.out.print("Enter an index:\t");
				int index = scanner.nextInt();

				System.out.println("\nYour sentence:\t" + sentence);
				System.out.println("Your index:\t" + index);
			} else if (selection == 2) {
				break;
			}
		}
	}

	public static void example3() {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("==========\nMenu Options");
			System.out.println("(1) - do this");
			System.out.println("(2) - quit");

			System.out.print("\n\nPlease enter your selection:\t");
			int selection = scanner.nextInt();// reads just the number, not the
												// end of line or anything after
												// the number

			scanner.nextLine(); // This line you have to add (It consumes the \n
								// character)

			if (selection == 1) {
				System.out.print("Enter a sentence:\t");
				// This reads the remainder of the line with the number on it
				// (with nothing after the number I suspect)
				// Try placing a scanner.nextLine(); after each nextInt() if you
				// intend to ignore the rest of the line.
				String sentence = scanner.nextLine();

				System.out.print("Enter an index:\t");
				int index = scanner.nextInt();

				System.out.println("\n\t**Your sentence:\t" + sentence);
				System.out.println("Your index:\t" + index);
			} else if (selection == 2) {
				break;
			}
		}
	}

}
