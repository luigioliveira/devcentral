package CAP4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassAverage2 {

	public static void main(String[] args) {
		// Determine a média de classe para o questionário

		// Inicialize as variáveis
		// Insira, some e conte as notas de questionário
		// Calcule e imprima a média da classe

		Scanner input = new Scanner(System.in);

		double total = 0;
		int gradeCounter = 0;
		double average;

		System.out.print("Insert grade: ");
		double grade = input.nextDouble();

		while (grade != -1) {
			total += grade;
			gradeCounter++;
			System.out.print("Insert grade or -1 to quit: ");
			grade = input.nextDouble();

		}

		if (gradeCounter != 0) {
			average = total / gradeCounter;
			System.out.printf("\nTotal of all %d grades is %.2f", gradeCounter, total);
			System.out.printf("\nAverage grade is: %.2f", average);
		} else {
			System.out.println("No grades were entered.");
		}

	}
}
