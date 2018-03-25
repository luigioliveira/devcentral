import java.util.Scanner;

public class Welcome3 {

	public static void main(String[] args) {
		int weight; //peso
		double height; //altura
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Write your weight:");
		weight = input.nextInt();
		System.out.print("Write your height:");
		height = input.nextDouble();
		
		double imc = weight / (height * 2);
		System.out.printf("Your IMC is: %f", imc);
		
		
		System.out.printf("\n\n%s\n%s\n%s\n%s\n%s\n","BMI VALUES","Underweight: less than 18.5","Normal: between 18.5 and 24.9","Overweight: between 25 and 29.9","Obese: 30 or greater");
		

	}

}
