package GuviTask7.GuviTask7;

import java.util.Scanner;

public class Question1 {
		
	public static void div(int a, int b) {
		int c = a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		try {
			div(a,b);
		}catch (ArithmeticException e) {
			System.out.println("Error: Division by zero isnot allowed");
		}
		sc.close();
		
		
		
	}

}
