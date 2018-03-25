package CAP4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double total = 0;
		int gradeCounter = 1;
		
		while (gradeCounter <= 10) {
			System.out.print("Insert grade: ");
			try {
			double grade = input.nextDouble();
			total += grade;
			} catch (InputMismatchException e) {
				System.out.println("Invalid input.");
				System.exit(0);
			}
			
			gradeCounter++;			
		}
		
		System.out.printf("\nTotal of all %d grades is %.2f", gradeCounter, total);
		System.out.printf("\nAverage grade is: %.2f",(total / 10));
	}

}
