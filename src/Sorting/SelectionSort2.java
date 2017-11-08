package Sorting;

import java.util.Scanner;

public class SelectionSort2 
{
	public static void main(String[] args)
	{
		String[] randomString = new String[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < randomString.length; i++)
		{
			System.out.print("Enter a string: ");
			randomString[i] = scanner.nextLine();
		}
		for (int i = 0; i < randomString.length - 1; i++)
		{
			for (int j = i + 1; j < randomString.length; j++)
			{
				// > 0 means Word 1 is greater than Word 2
				if (randomString[i].compareTo(randomString[j]) > 0)
				{
					String temp = randomString[i];
					randomString[i] = randomString[j];
					randomString[j] = temp;
				}
			}
			for (int j = 0; j < randomString.length; j++)
			{
				System.out.print(randomString[j] + " ");
			}
			System.out.println();
		}
	}
}
