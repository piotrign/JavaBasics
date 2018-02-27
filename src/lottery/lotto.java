package lottery;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisz program, który:

zapyta o typowane liczby, przy okazji sprawdzi następujące warunki:
-czy wprowadzony ciąg znaków jest poprawną liczbą,
-czy użytkownik nie wpisał tej liczby już poprzednio,
-czy liczba należy do zakresu 1-49,
-po wprowadzeniu 6 liczb, posortuje je rosnąco i wyświetli na ekranie,
-wylosuje 6 liczb z zakresu i wyświetli je na ekranie,
-poinformuje gracza, czy trafił przynajmniej "trójkę".
-Aby wylosować 6 liczb z zakresu 1-49 bez powtórzeń możemy utworzyć tablicę z wartościami 1-49,
 wymieszać jej zawartość i pobrać pierwsze 6 elementów.

Poniższy kod powinien Ci pomóc:

Integer[] arr = new Integer[49];
for (int i = 0; i < arr.length; i++) {
	arr[i] = i;
}
System.out.println(Arrays.toString(arr));
Collections.shuffle(Arrays.asList(arr));
System.out.println(Arrays.toString(arr));
Możesz również losować liczby z określonego zakresu (sprawdź w snippetach jak to wykonać) 
- jeżeli wybierzesz takie rozwiązanie, pamiętaj o sprawdzaniu czy dana wartość nie została 
wcześniej wylosowana.
 */
public class lotto {

	public static void main(String args[]) {
		lotto();
	}

	public static void lotto() {
		// Generating numbers to guess
		Integer[] allGeneratedNbrs = new Integer[50];
		for (int i = 0; i < allGeneratedNbrs.length; i++) {
			allGeneratedNbrs[i] = i;
		}
		System.out.println("All generated nmbrs " + Arrays.toString(allGeneratedNbrs));
		Collections.shuffle(Arrays.asList(allGeneratedNbrs));
		System.out.println("All generated nmbrs in random order: " + Arrays.toString(allGeneratedNbrs));

		// Selecting numbers to guess
		Integer[] selectedRandomNbrs = new Integer[6];
		for (int i = 0; i < 6; i++) {
			selectedRandomNbrs[i] = allGeneratedNbrs[i];
		}
		System.out.println("Numbers to find: " + Arrays.toString(selectedRandomNbrs));

		// User input
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int[] userGuess = new int[6];
		
		for (int i = 0; i < 6; i++) {
			try {
				System.out.println("Please enter number");
				userGuess[i] = input.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Please enter a number value.");
			}

		}
		// Collections.shuffle(Arrays.asList(userGuess));
		System.out.println(Arrays.toString(userGuess));

		// Comparing user input with generated numbers
		int numMatches = 0;
		for (int i = 0; i < userGuess.length; i++) {
			int num = userGuess[i];
			for (int j = 0; j < selectedRandomNbrs.length; i++) {
				if (num == selectedRandomNbrs[j]) {
					numMatches++;
					break;
				}
			}
		}
		// Victory thresholds
		switch (numMatches) {
		case 1:
			numMatches = 3;
			System.out.println("Congratulations, you have won 3!");
			break;
		case 2:
			numMatches = 4;
			System.out.println("Congratulations, you have won 4!");
			break;
		case 3:
			numMatches = 5;
			System.out.println("Congratulations, you have won 5!");
			break;
		case 4:
			numMatches = 6;
			System.out.println("Congratulations, you have won full prize!!!");
			break;
		}
	}
}
