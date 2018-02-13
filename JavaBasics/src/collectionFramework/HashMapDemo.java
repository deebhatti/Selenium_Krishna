package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> td = new HashMap<>();
		
		td.put("Ram", 12345);
		td.put("Sham", 23456);
		td.put("Tim", 34567);
		td.put("John", 45678);
		
		for (Map.Entry m : td.entrySet()){
			System.out.println(m.getKey() + " - " + m.getValue());
		}
		
	}

}
