package GuviTask7.GuviTask7;

import java.util.ArrayList;
import java.util.ListIterator;

public class Question5 {

	public static void main(String[] args) {
		
		ArrayList<String> City = new ArrayList<>();
		
		City.add("Port Blair");
		City.add("Chennai");
		City.add("Mumbai");
		City.add("Kolkata");
		
		int size = City.size();
		
		for(int i=0; i<size; i++) {
			System.out.print(City.get(i));
			System.out.print(", ");
		}
		System.out.println();
		City.clear();
		System.out.println("After removing elements: ");
		
		ListIterator<String> itr = City.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
