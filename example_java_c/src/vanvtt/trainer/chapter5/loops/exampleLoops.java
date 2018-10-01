package vanvtt.trainer.chapter5.loops;

public class exampleLoops {

	public static void main(String[] args) {
		int i = 1;
		int max = 10;

		// example while loop
		while (i < max) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("\n");

		// do - while loop
		i = 1;
		do {
			System.out.println("i = " + i);
			i++;
		} while (i < max);
		
		System.out.println("\n");

		// for
		for (i = 0; i < max; i++) {
			System.out.println("i = " + i);
		}

	}

}
