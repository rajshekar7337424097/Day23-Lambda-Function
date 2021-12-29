package com.bl.lamda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberList {
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();

		for (int i = 0; i < 5; i ++) {
			intList.add((int)(Math.random() * 100));
		}

		Iterator<Integer> itrNumbers = intList.iterator();

		System.out.println("Method1 : iterate each element of the list with Itorater");
		while(itrNumbers.hasNext()) {
			System.out.println("Iterator Value :"+itrNumbers.next());
		}
		System.out.println("Method2 : Iterate each element of the list with Consumer");
		Consumer<Integer> intConsumer = n -> {
			System.out.println("for each number :" +n);
		};
		intList.forEach(intConsumer);

		System.out.println("Method3 : Iterate each element of list with MyConsumer");
		MyConsumer  consumer = new MyConsumer();
		intList.forEach(consumer);

		System.out.println("Method4 : Iterate each element of list with new Consumer");
		intList.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer n) {
				System.out.println("Math4 new Consumer : " + n);
			}
		});

		System.out.println("Method5 : Iterate each element of list with Lambda");
		intList.forEach( n -> {
			System.out.println("math5 lambda :"+ n);
		});
		
		Function<Integer, Double> toDoubleValue = Integer :: doubleValue;
		List<Double> doubleList = new ArrayList<>();
		intList.forEach(n ->{
			doubleList.add(toDoubleValue.apply(n));
		});
		System.out.println("Method6 double Values : "+doubleList);
	}
}
