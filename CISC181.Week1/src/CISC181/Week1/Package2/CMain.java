package CISC181.Week1.Package2;

/**
 * @category - Chapter 5 (Methods)
 * @author Dad
 *
 */

/*
 * Notes - Introduction to methods.  
 * 
 * Things to note:
 * 
 * This class has three methods (besides main).  Two methods called AddNumbers and one method called AddNumber1.
 * 
 * Note the method signatures for the two 'AddNumbers' methods.  The method signature is the first part of the method code, minus the mutator.
 * 
 * Method signature : static void AddNumbers()
 * Method signature : static void AddNumbers(int a, int b)
 * 
 * The difference between the two methods...  is the parameters being passed.  This is a KEY OO CONCEPT called Overloading.  You can have two methods with the same
 * method name as long as they have a different parameter list.  The first method doesn't have any parameters, the second has two parameters.
 * 
 * Things to consider:
 * Look at AddNumbers().  What is the scope for variables a, b, c?
 * Look at AddNumbers1(int a, int b).  What is the scope for variables a, b?
 * What does 'void' mean?
 */

public class CMain {

	public static void main(String[] args) {

		AddNumbers();
	
		AddNumbers(1,2);
		
		int c = AddNumbers1(1,2);
		System.out.println("1 + 2 = " + c);
	}
	
	
	public static void AddNumbers()
	{
		int a;
		int b;
		int c;		
		
		a = 1;
		b = 2;
		c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
	}
	
	public static void AddNumbers(int a, int b)
	{
		int c;
		
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
	}

	
	public static int AddNumbers1(int a, int b)
	{
		int c;
		
		c = a + b;
		return c;
	}	
	
}
