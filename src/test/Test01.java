package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		// Generating numbers to guess
//		Integer[] allGeneratedNbrs = new Integer[50];
		List<Integer> allGeneratedNbrs = new ArrayList<>();
		for (int i = 1; i < 50; i++) {
			allGeneratedNbrs.add(i);
		}
		System.out.println(allGeneratedNbrs.toString());
		Collections.shuffle(allGeneratedNbrs);
		System.out.println(allGeneratedNbrs);
	}

	
	
	public static List<Integer> test121(){
		Random rand = new Random();
//		int size = 10;
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> numbersSorted = new ArrayList<Integer>();
		
		for(int i = 0; i < 11; i++){
			int counter = rand.nextInt(100) + 1;
			numbers.add(counter);
			numbersSorted.add(counter);
		}
		
		System.out.println(numbers);
		Collections.sort(numbersSorted);
		System.out.println(numbersSorted);
		
		return numbersSorted;
	}
}
