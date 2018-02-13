package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Paris");
		cities.add("London");
		cities.add("Vijayawada");
		cities.add("Ludhiana");
		cities.add("Tokyo");

		for (String t : cities) {
			System.out.println(t);
		}

		System.out.println("Index of Vijayawada = " + cities.indexOf("Vijayawada"));
		System.out.println("Element present at index 2 = " + cities.get(2));

		System.out.println("Total elements in the arraylist = " + cities.size());

		System.out.println("Is Lonond there in the list ? " + cities.contains("London"));

	}

}
