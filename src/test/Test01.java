package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test01 {
	public static void main(String[] args){
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
	}
}
