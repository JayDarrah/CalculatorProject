/*
 * Chapter 2: Calculator Homework
 * Author: Jason Darrah
 * Date: 04-22-2019
 * Purpose: Perform arithmetic expressions on two int variables. Repeat for double variables
 * 			print output to screen.
 */
public class CalculatorApp {

	public static void main(String[] args) {
		int x = 7, y = 5;
		int xysum=x+y, xydiff=x-y, xyprod=x*y, xyquot=x/y; 
		double a = 13.19, b = 6.11;
		double absum=a+b, abdiff=a-b, abprod=a*b, abquot=a/b;
		
		System.out.println("Chapter 2 Calculator v.1.0 By Jason Darrah\n");
		System.out.println("Integer values x="+x+", y="+y);
		System.out.println("x+y = "+xysum);
		System.out.println("x-y = "+xydiff);
		System.out.println("x*y = "+xyprod);
		System.out.println("x/y = "+xyquot);
		
		System.out.println("\nDouble values a="+a+", b="+b);
		System.out.println("a+b = "+absum);
		System.out.println("a-b = "+abdiff);
		System.out.println("a*b = "+abprod);
		System.out.println("a/b = "+abquot);
		
		System.out.println("\nThank you for using Chapter 2 Calculator! Goodbye!");
		
	}

}
