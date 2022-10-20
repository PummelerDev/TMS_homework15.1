package namesTask;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Opt {

	public static void main(String[] args) {

		ArrayList<String> namesList = new ArrayList<>();
		namesList.add(null);
		namesList.add("Yan");
		namesList.add("Alex");
		namesList.add("Margo");
		namesList.add("Dima");
		namesList.add("Aida");
		namesList.add(null);
		namesList.add("Anton");
		namesList.add("Vadim");
		namesList.add("Yan");
		namesList.add("Yan");

		Optional<ArrayList<String>> opt = Optional.ofNullable(namesList);
		Stream<ArrayList<String>> stream2 = opt.stream();
		stream2.map(x -> x.toString().toLowerCase()).sorted().limit(1).forEach(System.out::print);
	}
}
