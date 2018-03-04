package warsztatjava;

import java.util.Scanner;

public class ZgadnijLiczbe2 {

	public static void main(String args[]) {
		System.out.println("Think about number 1 to 1000, and I will guess it in up to tenth try.");
		aiGuess();
	}

	public static void aiGuess() {
		Scanner input = new Scanner(System.in);
		int min = 0;
		int max = 1000;

		int userFeedback = 0;
		boolean win = false;
		int aiGuess = (max - min) / 2 + min;

		while (win == false) {
			aiGuess = (max - min) / 2 + min;
			System.out.println(
					"My guess is: " + aiGuess + " Is it true? Pick 1 of below numbers to answer this question: ");
			System.out.println("1.Too much!");
			System.out.println("2.Too little!");
			System.out.println("3.Answer is correct, you win!");

			userFeedback = input.nextInt();
			switch (userFeedback) {
			case 1:
				max = (max - min) / 2 + min;
				break;
			case 2:
				min = (max - min) / 2 + min;
				break;
			case 3:
				win = true;
				System.out.println("I won! Human - Machine: 0-1 :)");
				break;
			default:
				System.out.println("You need to pick answer 1, 2 or 3. Do not cheat! ;)");
			}
		}
	}
}