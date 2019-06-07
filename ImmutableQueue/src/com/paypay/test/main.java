package com.paypay.test;

import java.util.Arrays;

import com.paypay.test.immutable.ImmutableQueue;

public class main {

	public static void main(String[] args) {
		
		ImmutableQueue<String> iq = new ImmutableQueue<>(Arrays.asList("A","B"));
		System.out.println("Updated new queue => " + iq.deQueue().enQueue("C"));
		System.out.println("Original queue => " + iq);
		iq.deQueue();
		
		ImmutableQueue<String> iq2 = new ImmutableQueue<>();
		System.out.println("Updated new queue => " + iq2.enQueue("1"));
		System.out.println("Original queue => " + iq2);
		iq.deQueue();
}

}
