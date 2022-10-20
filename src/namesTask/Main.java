package namesTask;

import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {

		NamesDataBase names = new NamesDataBase();

		Stream<String> stream = names.stream();
		System.out.println((long) stream.map(x -> x.toLowerCase()).filter("yan"::equals).count());

		Stream<String> stream1 = names.stream();
		stream1.map(x -> x.toLowerCase()).filter(x -> x.startsWith("a")).forEach(x -> System.out.print(x + " "));

		System.out.println();

		Stream<String> stream2 = names.stream();
		stream2.map(x -> x.toLowerCase()).sorted().limit(1).forEach(System.out::print);
	}
}
