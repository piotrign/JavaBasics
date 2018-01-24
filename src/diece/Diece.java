package diece;

import java.util.Random;

/*
 * Kod takiej kostki wygląda następująco:

xDy+z

gdzie:

y – rodzaj kostek, których należy użyć (np. D6, D10),
x – liczba rzutów kośćmi; jeśli rzucamy raz, ten parametr jest pomijalny,
z – liczba, którą należy dodać (lub odjąć) do wyniku rzutów (opcjonalnie).
Przykłady:

2D10+10: 2 rzuty D10, do wyniku dodaj 10,
D6: zwykły rzut kostką sześcienną,
2D3: rzut dwiema kostkami trójściennymi,
D12-1: rzut kością D12, od wyniku odejmij 1.
Napisz funkcję, która:

przyjmie w parametrze taki kod w postaci String,
rozpozna wszystkie dane wejściowe:
rodzaj kostki,
liczbę rzutów,
modyfikator,
wykona symulację rzutów i zwróci wynik.
 */
public class Diece {

	public static void main(String args[]) {
		//xDy+z
		//String dieceCode = "3D10 + 10";
System.out.println("Type diece code to roll off a diece: xDy+z (x-number of roll offs, y-diece type(D6,D8,D10 etc.), z-modificator");


		//System.out.println("Rolled out the following number:" + simpleDiece(1,6,1));
	}

	public static int simpleDiece(String dieceCode){
		Random rand = new Random();
		int diece = 0; 
		
		
		int x = dieceCode.charAt(1);
		int y = dieceCode.charAt(3);
		int z = dieceCode.charAt(5);
		
		if(y == 3 || y == 4 || y == 6 || y == 8 || y == 10 || y == 12 || y == 20 || y == 100){
			for(int i = 0; i <= 1 * x; i++ ){
				diece =	rand.nextInt(y) + z; 
			}
		}else{
			System.out.println("Select proper diece. Available dieces: D3, D4, D6, D8, D10, D12, D20, D100");
		}
		return diece;
	}
}