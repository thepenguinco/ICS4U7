package JavaReview2;

import java.util.*;

/*
 * WellOrder.java
 */
public class JavaReview2_10 
{
	static final int LOWER_BOUND = 123;
	static final int UPPER_BOUND = 789;
	public static void main(String[] args) 
	{
		int totalWellOrderedNumbers = 0;
		for (int i = LOWER_BOUND; i <= UPPER_BOUND; i++) {
			if ((i / 100 < (i / 10) % 10) && ((i / 10) % 10 < i % 10)) 
			{
				System.out.println(i);
				totalWellOrderedNumbers = totalWellOrderedNumbers + 1;
			}
		}
		System.out.println("The total number is " + totalWellOrderedNumbers + ".");
	}
}
