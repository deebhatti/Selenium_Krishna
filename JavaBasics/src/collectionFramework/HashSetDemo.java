package collectionFramework;

import java.util.HashSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> cities = new HashSet<>();
		
		cities.add("Paris");
		cities.add("London");
		cities.add("Vijayawada");
		cities.add("Ludhiana");
		cities.add("Tokyo");
		cities.add("Paris");
		

		for (String t : cities) {
			System.out.println(t);
		}

		//System.out.println("Index of Vijayawada = " + cities.indexOf("Vijayawada"));
	//	System.out.println("Element present at index 2 = " + cities.get(2));

		System.out.println("Total elements in the hashset = " + cities.size());

		System.out.println("Is London there in the set ? " + cities.contains("London"));
	}

}
