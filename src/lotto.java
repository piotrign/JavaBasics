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

	public static void lotto() throws InputMismatchException {
		// Generating numbers to guess
		Integer[] arr = new Integer[50];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = i;
		}

		System.out.println(Arrays.toString(arr));
		Collections.shuffle(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));

		// User input
		Scanner input = new Scanner(System.in);
		int[] uGuess = new int[6];
		for (int i = 0; i < uGuess.length; i++) {
			System.out.println("Please enter number");
			uGuess[i] = input.nextInt();
		}
		Collections.shuffle(Arrays.asList(uGuess));
		System.out.println(Arrays.toString(uGuess));

		// Comparing user input with generated numbers
		for (int i = 0; i < uGuess.length; i++) {
			int num = uGuess[i];
			for (int j = 0; j < arr.length; i++) {
				if (num == arr[j]) {
					int numMatches = 0;
					numMatches++;
					break;
				}
			}
		}
	}
}
