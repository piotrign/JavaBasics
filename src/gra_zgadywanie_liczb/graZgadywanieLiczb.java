package gra_zgadywanie_liczb;
import java.util.InputMismatchException;
/*
 * Warsztat: Gra w zgadywanie liczb.

Napisz prostą grę w zgadywanie liczb. Komputer musi wylosować liczbę w zakresie od 1 do 100. 
Następnie:

Zadać pytanie: "Zgadnij liczbę" i pobrać liczbę z klawiatury.
Sprawdzić, czy wprowadzony napis, to rzeczywiście liczba i w razie błędu wyświetlić komunikat 
"To nie jest liczba", po czym wrócić do pkt. 1
Jeśli liczba podana przez użytkownika jest mniejsza niż wylosowana, wyświetlić komunikat "Za mało!"
, po czym wrócić do pkt. 1.
Jeśli liczba podana przez użytkownika jest większa niż wylosowana, wyświetlić komunikat "Za dużo!",
 po czym wrócić do pkt. 1.
Jeśli liczba podana przez użytkownika jest równa wylosowanej, wyświetlić komunikat "Zgadłeś!", po 
czym zakończyć działanie programu.
Przykład:

Zgadnij liczbę: cześć
To nie jest liczba.
Zgadnij liczbę: 50
Za mało!
Zgadnij liczbę: 75
Za dużo!
Zgadnij liczbę: 63
Zgadłeś!
 */
import java.util.Random;
import java.util.Scanner;
//import javafx.application.Application;

public class graZgadywanieLiczb {



	public static void main(String args[]){
		guessingGame();
	}

	public static void guessingGame() throws InputMismatchException{
		Random rand = new Random();
		int pcNumber = rand.nextInt(101);
		Scanner input = new Scanner(System.in);
		int userNumber = 0;
		boolean win = false;

		System.out.println(
				"Welcome to Guess a number game! Please pick a number from 1 to 100 inclusive. "
						+ "\n" + "Have fun and good luck! :)");
		try{
			System.out.println(pcNumber);
			while (win == false){
				

				userNumber = input.nextInt();

				if(userNumber < 1 || userNumber > 100) 
					System.out.println("You must pick a number within 1 - 100 range (inclusive)");
				else 
					if (userNumber == pcNumber) {
						win = true;
						break;
					}
					else if (userNumber < pcNumber) {
						System.out.println("Your guess is too low!");
					}
					else if (userNumber > pcNumber) {
						System.out.println("Your guess is too high!");
					}
			}
		}catch(InputMismatchException e){
			System.out.println("You must pick a number within 1 - 100 range (inclusive)");
		}

		System.out.println("Congratulations you won! The number was: " + pcNumber);
		//			System.out.println("Do you want to play again? (Press 1-Yes or 2-No)");
		//			if(input.nextInt() == 2) break;
	}
}

