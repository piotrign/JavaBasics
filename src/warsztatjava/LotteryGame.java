package warsztatjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class LotteryGame {

	public static void main(String args[]) {
		lottoGame();
	}

	public static void lottoGame() {
		// Generating numbers 1-50
		List<Integer> allGeneratedNbrs = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			allGeneratedNbrs.add(i);
		}

		System.out.println(allGeneratedNbrs.toString());
		Collections.shuffle(allGeneratedNbrs);
		System.out.println(allGeneratedNbrs.toString());

		// Selecting numbers to guess
		List<Integer> selectedRandomNbrs = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			selectedRandomNbrs.add(allGeneratedNbrs.get(i));
		}
		System.out.println("Numbers to find: " + selectedRandomNbrs.toString());

		// User input
		Scanner input = new Scanner(System.in);
		List<Integer> userGuess = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			System.out.println("Please enter 6 numbers between 1-50. Your number #" + (i + 1));
			try {
				int singleUserGuess = input.nextInt();
				if (singleUserGuess > 0 && singleUserGuess < 50 && !(userGuess.contains(singleUserGuess))) {
					userGuess.add(singleUserGuess);
				} else {
					System.out.println(
							"Please enter numbers within 1-50 range and avoid duplicates. You have already provided "
									+ userGuess.toString());
					i--;
				}
			} catch (InputMismatchException e) {
				System.out.println("Input is not a number please try again.");
				i--;
				input.next();
			}
		}
		input.close();
		Collections.sort(userGuess);
		System.out.println(userGuess.toString());

		// Comparing user input with randomized 6 numbers
		int numMatches = 0;
		for (int i = 0; i < userGuess.size(); i++) {
			if (userGuess.contains(selectedRandomNbrs.get(i))) {
				numMatches++;
			}
		}

		// Prize thresholds
		String prize = "";
		switch (numMatches) {
		case 5:
			prize = "Congratulations you have won grand prize! 1 MLN belongs to you!";
			break;
		case 4:
			prize = "Congratulations you have guessed " + numMatches + "numbers.";
			break;
		case 3:
			prize = "Congratulations you have guessed " + numMatches + "numbers.";
			break;
		case 2:
			prize = "Congratulations you have guessed " + numMatches + "numbers.";
			break;
		case 1:
			prize = "Congratulations you have guessed " + numMatches + "numbers and won another lottery ticket.";
			break;
		case 0:
			prize = "No matching numbers - good luck next time";
			break;
		default:
			prize = "Wait what? Someone changed the code for sure...";
			break;
		}
		System.out.println(prize);
	}
}
