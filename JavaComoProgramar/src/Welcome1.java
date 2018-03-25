import java.util.Scanner;

public class Welcome1 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1;
		int num2; 
		int sum;
		
		System.out.print("Enter first integer: ");
		num1 = leia.nextInt();
		
		System.out.print("Enter second integer: ");
		num2 = leia.nextInt();
		
		sum = num1 + num2;
		
		System.out.printf("O SUM de %s + %s = %d", num1, num2, sum);
		
		if (num1 == num2) System.out.printf("%d == %d", num1, num2);
		
		
		//**	aa	
	}
}
