package vanvtt.trainer.chapter5.loops;

import java.util.Scanner;

public class ExampleContinue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int goal = 10;
		int n;
		while (sum < goal) {
			System.out.print("Enter a number: ");
			n = scanner.nextInt();
			if (n < 0)
				continue;
			sum += n; // not executed if n < 0
			System.out.println("sum = " + sum);
		}
	}
}
