package Searching;

import java.util.Scanner;

public class Searching1 
{
	public static int sequentialSearch(int[] array, int target)
	{
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] array = new int[20];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int) (Math.random() * 100);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("Enter an integer to search for: ");
		int target = scanner.nextInt();
		System.out.println("The integer was found at index: " + sequentialSearch(array, target));			
	}
}
