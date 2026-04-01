package Brocode_learning;
import java.util.Scanner;

public class BankingSystem {
	static double balance = 100.67;

	public static void main(String[] args) throws InterruptedException {
		Scanner s = new Scanner(System.in);
		boolean isRunning = true;
		int choice;
		
		while(isRunning) {
		
		System.out.println("***********");
		System.out.println("Banking System");
		System.out.println("1 - Show Balance");
		System.out.println("2 - Withdraw");
		System.out.println("3 - Deposit");
		System.out.println("4 - Exit");
		System.out.println("************");
		System.out.print("What is your choice: ");
		choice = s.nextInt();
		
		switch(choice){
			case 1 -> balance();
			case 2 -> withdraw(s);
			case 3 -> deposit(s);
			case 4 -> { System.out.println("Thanks you for using my banking system"); 
			isRunning = false;
			}
			default -> {System.out.println("***********"); 
			System.out.println("Unavailable Choice");
			Thread.sleep(1500);}
			
			}
		}

	}
	static void balance() throws InterruptedException {
		System.out.println("Checking Balance");
		Thread.sleep(3000);
		System.out.printf("you balance is %.2f\n", balance);
		Thread.sleep(3000);

	}
	
	static void withdraw(Scanner s) throws InterruptedException {
		boolean isOn = true;
		while(isOn){
		System.out.println("***************");
		System.out.print("Insert amount to withdraw: ");
		double WithdrawAmmount = s.nextDouble();
		if(WithdrawAmmount <= balance) {
		System.out.println("****************");
		System.out.println("Please wait");
		System.out.println("****************");
		Thread.sleep(3000);
		System.out.println("Withdraw succesfull");
		System.out.println("****************");
		Thread.sleep(1500);
		balance = balance - WithdrawAmmount;
		System.out.printf("Your balance is now %.2f\n", balance );
		isOn = false;
		}
		else{
			System.out.println("Insufficient balance");
			}
		}
		Thread.sleep(2000);

	}
	
	static void deposit(Scanner s) throws InterruptedException {
		System.out.println("***************");
		System.out.print("Insert amount to deposit: ");
		double WithdrawAmmount = s.nextDouble();
		System.out.println("****************");
		System.out.println("Please wait");
		System.out.println("****************");
		Thread.sleep(3000);
		System.out.println("Deposit succesfull");
		System.out.println("****************");
		Thread.sleep(1500);
		balance = balance + WithdrawAmmount;
		System.out.printf("Your balance is now %.2f\n", balance);
		Thread.sleep(2000);

		}
	

}
