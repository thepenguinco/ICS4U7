package JavaReview2;

import java.util.*;

/*
 * Power2.java
 */
public class JavaReview2_7 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int powerOfTwo = 1;
		int input = scanner.nextInt();
		// technically 1 is a power of 2 (when raised by an exponent of 0)
		while (powerOfTwo <= input) 
		{
			powerOfTwo = powerOfTwo * 2;
		}
		System.out.println("The smallest power of 2 greater than the number you provided is " + powerOfTwo + ".");
	}
}
