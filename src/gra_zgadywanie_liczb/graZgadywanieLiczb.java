package gra_zgadywanie_liczb;

import java.util.Random;
import java.util.Scanner;

public class graZgadywanieLiczb {

	public static void main(String args[]){
		guessGame();
	}

	public static void guessGame(){
		Random rand = new Random();
		int pcNumber = rand.nextInt(100);
		Scanner input = new Scanner(System.in);
		int userNo = 0; //poprawić nazewnictwo zmiennych np userNumber lub pcNo

		while(true){
			System.out.println("Guess a number (1 to 100 inclusive) :)");
			userNo = input.nextInt();
			while (userNo >=1 || userNo <= 100){
				if (!input.hasNextInt()) System.out.println("It's not a number :(");
				else if (userNo == pcNumber) {
					System.out.println("Congratulations you won! The number was: " + pcNumber);
					// leave the first loop
					break;
				}
				else if (userNo < pcNumber) System.out.println("Your guess is too low!");
				else if (userNo > pcNumber) System.out.println("Your guess is too high!");
			}
			System.out.println("Do you want to play again? (1-Yes, 2-No)");
			if(input.nextInt() == 2) break;
		}
	}
}