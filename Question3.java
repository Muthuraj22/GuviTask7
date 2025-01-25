package GuviTask7.GuviTask7;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if(age<18) {
			throw new InvalidAgeException("Age must be more than 18");
			
		} else {
			System.out.println("Valid Age");
		}
		} catch (InvalidAgeException e) {
			System.out.println("Error: Invalid Age Exception");
		}
		
		sc.close();
	}

}
