import java.util.Scanner;
public class BankAccount {
    private static Scanner in ;
    private static float balance = 400000;
    private static int anotherTransaction;

    public static void main(String args[]) {
        in = new Scanner(System.in);
        transaction();
    }

    private static void transaction() {
		int choice;
        System.out.println("Please select an option");
		System.out.println("1. Deposit");
        System.out.println("2. Balance");
        System.out.println("3. Withdraw");
        choice = in.nextInt();

        switch (choice) {
			case 1:
                float deposit;
                System.out.println("Enter deposit money: ");
                deposit = in .nextFloat();
                balance = deposit + balance;
                System.out.println("You have deposited " + deposit + " After Deposited you have balance " + balance + "\n");
                anotherTransaction();
                break;
			
			case 2:
                System.out.println("Your balance is " + balance + "\n");
                anotherTransaction();
                break;

            case 3:
				float amount;
                System.out.println("Enter withdrawing money: ");
                amount = in .nextFloat();
                if (amount > balance || amount == 10000) {
                    System.out.println("Insufficient money\n");
                    anotherTransaction(); 
                } 
				else {
                    balance = balance - amount;
                    System.out.println("You have withdraw " + amount + "After Withdraw you have balance" + balance + "\n");
                    anotherTransaction();
					}
                break;
				
            default:
                System.out.println("Invalid option\n");
                anotherTransaction();
                break;
        }
    }
	
    private static void anotherTransaction() {
        System.out.println("Do you want anything?\n\n Press 1 if you want anything process\n 2 To exit");
        anotherTransaction = in .nextInt();
        if (anotherTransaction == 1) {
            transaction(); 
        } 
		else if (anotherTransaction == 2) {
            System.out.println("Thanks for Coming.");
        } 
		else {
            System.out.println("Invalid\n");
            anotherTransaction();
        }
    }
}