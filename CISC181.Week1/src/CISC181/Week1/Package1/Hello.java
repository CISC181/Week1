package CISC181.Week1.Package1;


/*
 * Notes - Not much to this one...  Simple 'main' method, prints a message to the console.  
 * 
 * Things to note:
 * Note the { } curly braces.  It's a standard delimiter in Java.  One set of curly braces shows the scope of the class, another set of curly braces
 *      shows the scope of a given method.
 * Java is case-sensitive.  'System' is the not the same as 'system'.
 * Statements are terminated by a semicolon (;)  
 * 
 * Things to consider:
 * What is a package?
 * What does 'public' modifier mean?
 * What does 'static' keyword do?
 */
public class Hello {

	public static void main(String[] args) {

		System.out.println("Hello World");

		double amount = 12618.98;
		
		
		
		double interestRate = 0.0013;
		double interest = amount * interestRate;
		System.out.println("Interest is " + interest);
		System.out.printf("%3.1f", 4.56);
	}

}
