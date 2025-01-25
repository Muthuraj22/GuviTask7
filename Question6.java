package GuviTask7.GuviTask7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Question6 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> employee = new TreeMap<>();
		
		//Adding Employee
		employee.put(01, "Muthu");
		employee.put(03, "Kamesh");
		employee.put(04, "Subash");
		employee.put(02, "Sugi");
		
		//Extract the names into a list
		Collection<String> employeeNames = employee.values();
		
		//Convert collection to list and sort it alphabetically\
		List<String> nameList = new ArrayList<>(employeeNames);
		Collections.sort(nameList);
		
		//Print the names in alphabetical order
		System.out.println("Emplloyee names in alphabetical order: ");
		for (String name: nameList) {
			System.out.println(name);
		}
		
	}

}
