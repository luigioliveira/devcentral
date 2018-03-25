import java.util.Scanner;

public class AccountTest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Account myAccount = new Account("Luigi", 50.10);
		Account myAccount2 = new Account("Leonardo", -250.35);
		
		String theName;
		double depositAmount;
		
		// Account1
		System.out.print("Please write the Account name 1: " );
		theName = input.nextLine();
		myAccount.setName(theName);
		
		System.out.print("Enter with initial deposit for Account1: ");
		depositAmount = input.nextDouble();
		myAccount.deposit(depositAmount);
		
		// Account2
		System.out.print("Please write the Account name 2: ");
		theName = input.nextLine();
		theName = input.nextLine();
		myAccount2.setName(theName);
		
		System.out.print("Enter with initial deposit for Account2: ");
		depositAmount = input.nextDouble();
		myAccount2.deposit(depositAmount);
		
		// Results
		System.out.printf("\nAccount: %s\nBalance in object myAccount: R$%.2f\n", myAccount.getName(), myAccount.getBalance());
		System.out.printf("Account: %s\nBalance in object myAccount2: R$%.2f\n", myAccount2.getName(), myAccount2.getBalance());
	}
	
}
