package workshop.java.basics;

import java.util.Random;

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