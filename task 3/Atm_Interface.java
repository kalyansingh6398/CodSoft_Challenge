package java_task.company;

import java.util.Scanner;

 class BankAccount {
private double balance;

BankAccount(double initialBalance) {
	balance = initialBalance;
 }
public double getBalance() {
	return balance;
}

public void deposit(double amount) {
	if(amount > 0) {
		balance += amount;
		System.out.println("Money Deposit: " +amount);
	}
	else {
		System.out.println("Invalid Amount For Deposit!");
	}
}
public void withdraw(double amount) {
	 if(amount > 0 && amount <= balance) {
		 balance -= amount;
		 System.out.println("Money Withdraw:" + amount);
	 }
	 else {
		 System.out.println("Insufficient funds or invalid amount for withdrawal!");
	    }
    }
}
class ATM{
	private BankAccount account;
	private Scanner scanner;
	
	public ATM(BankAccount account) {
		this.account = account;
		scanner = new Scanner(System.in);
	}
	public void showMenu() {
		//System.out.println("**** WELCOME TO ATM OF STATE BANK OF INDIA ***** ");
		System.out.println("ATM Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2.Deposit Cash");
		System.out.println("3.Withdraw Cash");
		System.out.println("4.Exit");
	}
	
	public void start() {
		int choice;
		do {
			showMenu();
			System.out.println("Enter your choice:");
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposit();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				System.out.println("Exiting ATM Thank You!");
				break;
				default:
					System.out.println("Invalid choice please select a valid option!");
			}
		}while(choice != 4);
	}
	private void checkBalance() {
		System.out.println("Your Current Balance:" + account.getBalance());
	}
	private void deposit() {
		System.out.println("Enter deposit amount :");
		double amount = scanner.nextInt();
		account.deposit(amount);
	}
	private void withdraw() {
		System.out.println("Enter withdrawal amount:");
		double amount = scanner.nextInt();
		account.withdraw(amount);
	}
}
public class Atm_Interface{
	public static void main(String args[]) {
		System.out.println("**** WELCOME TO ATM OF STATE BANK OF INDIA ***** ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your four digit pin:");
		int enterPin = sc.nextInt();
		BankAccount UserAccount = new BankAccount(1000);
	 ATM atm = new ATM(UserAccount);
	 atm.start();
	}
}











