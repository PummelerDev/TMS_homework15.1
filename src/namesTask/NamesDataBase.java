package namesTask;

import java.util.ArrayList;
import java.util.stream.Stream;

public class  NamesDataBase {

	ArrayList<String> namesList = new ArrayList<>();

	public NamesDataBase() {
		init();
	}

	private void init() {
		namesList.add("Yan");
		namesList.add("Alex");
		namesList.add("Margo");
		namesList.add("Dima");
		namesList.add("Aida");
		namesList.add("Anton");
		namesList.add("Vadim");
		namesList.add("Yan");
		namesList.add("Yan");
	}

	public Stream<String> stream() {
		return namesList.stream();
	}
}
