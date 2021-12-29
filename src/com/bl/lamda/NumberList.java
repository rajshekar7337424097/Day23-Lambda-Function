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
		
		System.out.println("Method1 : iterate each element of the list with Itorater");
		while(itrNumbers.hasNext()) {
			System.out.println("Iterator Value :"+itrNumbers.next());
		}
		System.out.println("Method2 : Iterate each element of the list with Consumer");
		Consumer<Integer> intConsumer = n -> {
			System.out.println("for each number :" +n);
		};
		number.forEach(intConsumer);
		
		System.out.println("Method3 : Iterate each element of list with MyConsumer");
		MyConsumer  consumer = new MyConsumer();
		number.forEach(consumer);
		}
}
