package GuviTask7.GuviTask7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the file path: ");
			String filepath = sc.nextLine();
			
			File file = new File(filepath);
			Scanner fileScanner = new Scanner(file);
			
			System.out.println("File Content: ");
			while(fileScanner.hasNextLine()) {
				System.out.println(fileScanner.nextLine());
			}
			fileScanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File Not Found Exception");
		}
		sc.close();
		
		
		
		
		
	}

}
