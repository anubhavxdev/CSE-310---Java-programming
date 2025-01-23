import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = rand.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Please enter a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high.");
            } else {
                win = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
