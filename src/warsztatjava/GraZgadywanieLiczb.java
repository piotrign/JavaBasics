package warsztatjava;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GraZgadywanieLiczb {

	public static void main(String args[]) {
		guessingGame();
	}

	public static void guessingGame() throws InputMismatchException {
		Random rand = new Random();
		int pcNumber = rand.nextInt(101);
		Scanner input = new Scanner(System.in);
		int userNumber = 0;
		boolean win = false;

		System.out.println("Welcome to Guess a number game! Please pick a number from 1 to 100 inclusive. " + "\n"
				+ "Have fun and good luck! :)");
		try {
			// System.out.println(pcNumber);
			while (win == false) {

				userNumber = input.nextInt();

				if (userNumber < 1 || userNumber > 100)
					System.out.println("You must pick a number within 1 - 100 range (inclusive)");
				else if (userNumber == pcNumber) {
					win = true;
					System.out.println("Congratulations you won! The number was: " + pcNumber);
					break;
				} else if (userNumber < pcNumber) {
					System.out.println("Your guess is too low!");
				} else if (userNumber > pcNumber) {
					System.out.println("Your guess is too high!");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("This is not a valid number. You must pick a number within 1 - 100 range (inclusive)");
		}
		// System.out.println("Do you want to play again? (Press 1-Yes or
		// 2-No)");
		// if(input.nextInt() == 2) break;

	}
}