import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		ArrayList<Integer> intsList = IntDataBase.init(40);
		System.out.println(intsList.toString());

//		creating the stream without duplicates
		Stream<Integer> stream = intsList.stream();
		stream.distinct().forEach(x -> {
			System.out.print(x + " ");
		});

		System.out.println("\n-");

//		filtration
		Stream<Integer> stream1 = intsList.stream();
		stream1.distinct().filter(x -> {
			if (x >= 7 & x <= 17 & x % 2 == 0) {
				return true;
			} else {
				return false;
			}
		}).forEach(x -> System.out.print(x + " "));

		System.out.println("\n--");

//		multiplying elements by 2
		Stream<Integer> stream2 = intsList.stream();
		stream2.distinct().filter(x -> x > 7 & x < 17 & x % 2 == 0).map(x -> {
			return x * 2;
		}).forEach(x -> System.out.print(x + " "));

		System.out.println("\n---");

//		sorted
		Stream<Integer> stream3 = intsList.stream();
		stream3.distinct().filter(x -> x > 7 & x < 17 & x % 2 == 0).map(x -> x * 2).sorted((x, y) -> {
			if (x > y) {
				return 1;
			} else {
				return -1;
			}
		}).forEach(x -> System.out.print(x + " "));

		System.out.println("\n----");

//		getting the quantity of elements
		Stream<Integer> stream4 = intsList.stream();
		int qntt = (int) stream4.distinct().filter(x -> x > 7 & x < 17 & x % 2 == 0).map(x -> x * 2)
				.sorted((x, y) -> x.compareTo(y)).count();
		System.out.print(qntt);

		System.out.println("\n-----");
//		getting the amount of elements
//		and getting the average value
		Stream<Integer> stream5 = intsList.stream();
		OptionalInt sum = stream5.distinct().filter(x -> x > 7 & x < 17 & x % 2 == 0).map(x -> x * 2).mapToInt(x -> x)
				.sorted().reduce((x, y) -> ((x + y)));
		System.out.println(sum);
		System.out.println((double) sum.getAsInt() / qntt);

		Stream<Integer> stream6 = intsList.stream();
		OptionalDouble avr = stream6.distinct().filter(x -> x > 7 & x < 17 & x % 2 == 0).map(x -> x * 2)
				.sorted((x, y) -> x.compareTo(y)).mapToInt(x -> x).average();
		System.out.println(avr);
	}
}
