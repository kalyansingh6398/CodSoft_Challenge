package java_task.company;

import java.util.Scanner;
import java.util.Random;


public class NumberGuessingGame {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    int lowerBound = 1; 
    int upperBound = 100; 
    int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    int numberOfTries = 0;
    
    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

    while (true) {
        System.out.print("Enter your guess: ");
        int userGuess = scanner.nextInt();
        numberOfTries++;

        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            break;
        } else if (userGuess < numberToGuess) {
           // System.out.println("Try a higher number.");
        } else {
           // System.out.println("Try a lower number.");
        }
    }

    scanner.close();
}
	
}


