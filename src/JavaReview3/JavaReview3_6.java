package JavaReview3;

import java.util.*;

public class JavaReview3_6 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = scanner.nextLine();
		String reverse = new StringBuffer(input).reverse().toString();
		if (input.length() > 10) 
		{
			input = input.substring(0, 10);
		}
		for (int i = 1; i <= input.length(); i++)
		{
			for (int j = input.length() - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			System.out.print(input.substring(0, i));
			System.out.println(reverse.substring(reverse.length() - i + 1, reverse.length()));
		}
		for (int i = input.length() - 1; i > 0; i--)
		{
			for (int j = input.length() - i; j > 0; j--)
			{
				System.out.print(" ");
			}
			System.out.print(input.substring(0, i));
			System.out.println(reverse.substring(reverse.length() - i + 1, reverse.length()));
		}
	}
}