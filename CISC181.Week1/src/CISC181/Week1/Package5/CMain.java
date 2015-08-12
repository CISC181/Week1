package CISC181.Week1.Package5;

/**
 * @category - Chapter 11 (Inheritance and Polymorphism)
 * @author Dad
 *
 */

/*
 * Notes - Introduction to casting
 * 
 * Things to note:
 * 
 * Example has three methods (besides main), each showing different methods used for casting.
 * 
 * Things to consider:
 * 
 * What is explicit casting?  What is implicit casting?  When can you use one or the other?
 * 
 */

public class CMain {

	public static void main(String[] args) {

		CastExample1();
		CastExample2();
		CastExample3();
		
		// Test Comment

	}

	public static void CastExample1() {
		double d = 9.5;
		int i = (int) d;
		// i = 9

		System.out.println("Value of i: " + i);
	}

	public static void CastExample2() {
		Double D = 9.5;
		int i = Integer.valueOf(D.intValue());
		// i = 9

		System.out.println("Value of i: " + i);

	}

	public static void CastExample3() {
		double d = 9.5;
		Long L = Math.round(d);
		int i = Integer.valueOf(L.intValue());
		// i = 10

		System.out.println("Value of i: " + i);
	}

}
