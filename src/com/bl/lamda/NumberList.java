package com.bl.lamda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class NumberList {
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		 
		for (int i = 0; i < 5; i ++) {
			number.add((int)(Math.random() * 100));
		}
		
		Iterator<Integer> itrNumbers = number.iterator();
		
		while(itrNumbers.hasNext()) {
			System.out.println("Iterator Value :"+itrNumbers.next());
		}
		
		Consumer<Integer> intConsumer = n -> {
			System.out.println("for each number :" +n);
		};
		
		number.forEach(intConsumer);
		
	}

}
