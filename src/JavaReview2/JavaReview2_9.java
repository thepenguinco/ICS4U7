package JavaReview2;

import java.util.*;

/*
 * Asterisks.java
 */
public class JavaReview2_9 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers, seperated by spaces: ");
		String input = scanner.nextLine();
		String[] stringArray = input.split(" ");
		for (int i = 0; i < stringArray.length; i++) 
		{
			int number = Integer.parseInt(stringArray[i]);
			System.out.print(number);
			for (int j = 0; j < number; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

