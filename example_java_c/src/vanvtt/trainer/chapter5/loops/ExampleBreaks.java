package vanvtt.trainer.chapter5.loops;

public class ExampleBreaks {

	public static void main(String[] args) {
		// int i = 1;
		// int max = 10;
		//
		// // example while loop
		// while (i < max) {
		// System.out.println("i = " + i);
		// i++;
		// if(i ==5) {
		// break;
		// }
		// }

		// first: for (int i = 0; i < 10; i++) {
		// System.out.println("i = " + i);
		// second: for (int j = 0; j < 5; j++) {
		// System.out.println("j = " + j);
		// break second;
		// }
		// }
		//
		// third: for (int a = 0; a < 10; a++) {
		// System.out.println("a = " + a);
		// }
		
		example_break_lable();

	}

	public static void example_break_lable() {
		int[][] arr = { { 1, 2 }, { 3, 4 }, { 9, 10 }, { 11, 12 } };
		boolean found = false;
		int row = 0;
		int col = 0;
		// find index of first int greater than 10
		searchint:

		for (row = 0; row < arr.length; row++) {
			for (col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > 10) {
					found = true;
					// using break label to terminate outer statements
					break searchint;
				}
			}
		}
		if (found)
			System.out.println("First int greater than 10 is found at index: [" + row + "," + col + "]");
	}

}
