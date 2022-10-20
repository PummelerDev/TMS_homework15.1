import java.util.ArrayList;
import java.util.Random;

public class IntDataBase {
	static ArrayList<Integer> intsList = new ArrayList<>();

	public static ArrayList<Integer> init(int quantity) {
		for (int i = 0; i < quantity; i++) {
			intsList.add(new Random().nextInt(20));
		}
		return intsList;
	}

	public ArrayList<Integer> getData() {
		return IntDataBase.intsList;
	}

}
