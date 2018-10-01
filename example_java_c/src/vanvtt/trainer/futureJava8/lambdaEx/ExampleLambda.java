package vanvtt.trainer.futureJava8.lambdaEx;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ExampleLambda {
	public static void main(String args[]) {
		List<String> filteredList = new ArrayList<String>();
		filteredList.add("An");
		filteredList.add("vanvtt");
		filteredList.add("1An");
		filteredList.add("vanvtt");
		filteredList.add("An2");
		filteredList.add("vanvtt1");
		// oldFor(filteredList);
		// labdaForeach(filteredList);
		// consumerIn(filteredList);
		
		fullExample();
	}

	public static void oldFor(List<String> filteredList) {
		// External Iterator
		for (String stringToFilter : filteredList) {
			System.out.println(stringToFilter);
		}

	}

	public static void labdaForeach(List<String> filteredList) {

		// A Method Reference: sử dụng khi một method đã tồn tại trong class
		// filteredList.forEach(System.out::println);

		// cách 2: A Lambda Expression
		filteredList.forEach(item -> System.out.println(item));
	}

	public static void consumerIn(List<String> filteredList) {
		// The Consumer Interface
		filteredList.forEach(new Consumer<String>() {
			public void accept(String name) {
				System.out.println(name);
			}
		});
	}

	public static void fullExample() {
		List<String> items = new ArrayList<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		// lambda
		// Output : A,B,C,D,E
		items.forEach(item -> System.out.println(item));

		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		// Output : A,B,C,D,E
		System.out.println("\n__________method reference");
		items.forEach(System.out::println);

		// Stream and filter
		// Output : B
		System.out.println("\n_______Stream and filter");
		items.stream().filter(s -> s.contains("B")).forEach(System.out::println);

	}
}
