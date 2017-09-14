package JavaReview2;

import java.util.*;

/*
 * Dice.java
 */
public class JavaReview2_8 
{
	static final int SUM = 10;
	public static void main(String[] args) 
	{
		int numberOfWays = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value for m: ");
		int m = scanner.nextInt();
		System.out.print("Enter a value for n: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= m; i++) 
		{
			for (int j = 1; j <= n; j++) 
			{
				if (i + j == SUM) 
				{
					numberOfWays = numberOfWays + 1;
				}
			}
		}
		System.out.println("There are " + numberOfWays + " ways to get the sum " + SUM + ".");
	}
}
