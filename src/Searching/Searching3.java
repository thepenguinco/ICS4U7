package Searching;

import java.util.Scanner;

public class Searching3 
{
	public static int[] array;
	
	public static void sequentialSearch(int[] array, int target)
	{
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] == target)
			{
				 int temp = array[i];
				 array[i] = array[i + 1];
				 array[i + 1] = temp;
				 return;
			}
		}
		System.out.println("Not found, or unable to perform the swap.");
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int length = scanner.nextInt();
		array = new int[length];
		for (int i = 0; i < length; i++)
		{
			System.out.print("Enter a random integer: ");
			array[i] = scanner.nextInt();
		}
		System.out.println();
		while (true)
		{
			System.out.print("Enter an integer to search for: ");
			int target = scanner.nextInt();
			if (target == 0) break;
			sequentialSearch(array, target);
			for (int i = 0; i < array.length; i++)
			{
				System.out.print(array[i] + " ");
			}
		}
	}
}
