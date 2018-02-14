package CISC181.Week1.Package6;

/*
 * Notes - Introduction to 'If' selection
 * 
 * Things to note:
 * 
 * Example has two methods, SimpleIf and SimpleIfElse.  Notice that the expression being evaluated with the 'if' statement is surrounded by parenthesis?
 * Look at == comparison.  A single = sign means assignment, two equal signs means compare.  
 * 
 * The second method has an 'if/else' statement nested inside an if statement!  It can get ugly... but it's syntax is OK.
 * 
 * Things to consider:
 * 
 * Does the second 'if' statement in SimpleIf need curly braces {} around the statement after the 'if'?  Why or why not?  When do you NEED curly braces?
 * 
 */

import java.util.Scanner;

public class CMain {

	public static void main(String[] args) {

		
		SimpleIf();

		SimpleIfElse();

		Boolean b = true;
		SimpleBoolIf(b);
		b = false;
		SimpleBoolIf(b);

	}

	private static void SimpleIf() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 10: ");
		int iNumber = input.nextInt();

		if (iNumber > 5)
			System.out.println("Number Greater Than 5");
		

		if (iNumber == 5) {
			System.out.println("Number is 5");
		}

		if (iNumber < 5)
			System.out.println("Number Less Than 5");

	}

	private static void SimpleIfElse() {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 10: ");
		int iNumber = input.nextInt();

		if (iNumber > 5) {
			if (iNumber > 8) {
				System.out.println("Number Greater Than 8");
			} else {
				System.out.println("Number Between 5 and 8");
			}
			;

		} else if (iNumber == 5) {
			System.out.println("Number is 5");
		} else if (iNumber < 5) {
			System.out.println("Number Less Than 5");
		}



	}

	private static void SimpleBoolIf(Boolean b) {
		
		if (b)
			System.out.println("Item is true");
		else if (!b)
			System.out.println("Item is false");
	}

}
