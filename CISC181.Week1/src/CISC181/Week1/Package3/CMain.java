package CISC181.Week1.Package3;

/**
 * @category - Chapter 2 (Elementary Programming)
 * @author Dad
 *
 */

/*
 * Notes - Introduction to Scanner
 * 
 * Things to note:
 * 
 * This class uses the Scanner class and methods.  Scanner is an easy way to prompt user for input (strings, ints, doubles, etc).
 * I can't even imagine the programming behind prompting user for input, parsing out values, etc.  Thankfully Java has packaged this in the utility class.
 * 
 * Things to consider:
 * 
 * What does 'import' keyword do?  Comment out the line of code.  See what happens.  Will it compile?  Hover over the error, does the IDE give you suggestions
 * on how to fix?
 * 
 */

import java.util.Scanner;

public class CMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		
		System.out.println(a + " + " + b + " = " + AddNumbers(a,b));
		
		input.close();
	}
	
	private static int AddNumbers(int a, int b)
	{
		int c = a + b;
		
		return c;
	}

}
