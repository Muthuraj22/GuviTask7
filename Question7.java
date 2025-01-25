package GuviTask7.GuviTask7;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

	public static void main(String[] args) {
		
		List<String> stringList = new ArrayList<>();
		stringList.add("Apple");
		stringList.add("Banana");
		stringList.add("Mango");
		stringList.add("Orange");
		
		//Convert List to Array
		String[] stringArray = stringList.toArray(new String[0]);
		
		//Print Array Elements
		System.out.println("Array Elements: ");
		for(String element: stringArray) {
			System.out.println(element);
		}
	}

}
