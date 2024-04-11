package es.edu.cesur.programacion.practicas_examen;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Practicas {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.remove(new String("A"));

		//System.out.println(list);
		
		List<String> names = new LinkedList<>();
		names.add("Paul");
		names.add(0, "John");
		names.set(1, "George");
		//System.out.println(names);
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("apple", 50);
		linkedHashMap.put("banana", 30);
		linkedHashMap.put("orange", 60);
		linkedHashMap.put("apple", 60);
		
		for(String key: linkedHashMap.keySet()) {
			System.out.println(key);
		}
		
		System.out.println(linkedHashMap.get("apple"));

	}

	/*
	 * Cuando llamas remove(Object obj) en un ArrayList, Java utiliza el método
	 * equals() para encontrar un elemento en la lista que sea "igual" al objeto
	 * proporcionado según el método equals().
	 */

}
