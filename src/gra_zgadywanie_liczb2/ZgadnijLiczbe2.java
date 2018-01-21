package gra_zgadywanie_liczb2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZgadnijLiczbe2{

	public static void main(String args[]){
		System.out.println("Pomyśl liczbę od 1 do 1000, a ja ją zgadnę w 10 próbach");
		aiGuess();
	}

	public static void aiGuess()throws InputMismatchException{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int min = 0;
		int max = 1000;

		int userFeedback = 0;
		boolean win = false;
		int aiGuess = (max-min)/2 + min;

//		System.out.println("Pomyśl liczbę od 1 do 1000, a ja ją zgadnę w 10 próbach");

		try{
			while (win == false){

				System.out.println("Zgaduję: " + aiGuess + " Czy to prawda? Wybierz jedną z odpowiedzi poniżej:");
				System.out.println("1.To za duzo!");
				System.out.println("2.To za malo!");
				System.out.println("3.Wygrałeś!");

				userFeedback = input.nextInt();			
				if(userFeedback == 3){
					win = true;
					System.out.println("Wygrałem - maszyny górą ;)");
				}else if(userFeedback == 1){
					max = (max-min)/2 + min;
				}else if(userFeedback == 2){
					min = (max-min)/2 + min;
				}				
			}
		}catch(InputMismatchException e){
			System.out.println("Musisz wybrać odpowiedź 1, 2 lub 3. Nie oszukuj! ;)");
		}	
	}
}
//	public static int getNbr(){
//		int userNbr = 0;
//		Scanner input = new Scanner(System.in);
//		userNbr = input.nextInt();
//
//		return userNbr;
//	}

