package com.bl.lamda;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer n) {
		System.out.println("Method3 My Consumer elements :  "+n);
	}
}
