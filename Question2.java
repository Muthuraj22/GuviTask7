package GuviTask7.GuviTask7;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		//ArrayIndexOutOfBoundsException
		
		int[] numbers = {1, 2, 3};
		
		
		for(int i=0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the position: ");
		int x = sc.nextInt();
		
		try {
			System.out.println(numbers[x]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array Index Out of Bound Exception");
		}
		
		
		// StringIndexOutOfBoundsException
		
		String example = "Apple";
		
		for(int j=0; j<example.length(); j++) {
			System.out.println(example.charAt(j));
		}
		
		System.out.println("Enter the index of string: ");
		int b= sc.nextInt();
		
		
		try {
		System.out.println(example.charAt(b));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Error: String Index Out Of Bounds Exception");
			
		}
		
		
		sc.close();
	}

}
