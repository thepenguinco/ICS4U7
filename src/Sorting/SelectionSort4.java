package Sorting;

import java.util.Scanner;

public class SelectionSort4 
{
	// impossible with non functional selection sort
	public static void selectionSort (int[] numbers, int k)
	{
		for (int i = 0; i < numbers.length - 1; i++)
		{
			for (int j = i + 1; j < numbers.length; j++)
			{
				if (numbers[i] > numbers[j])
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
			for (int j = 0; j < numbers.length; j++)
			{
				System.out.print(numbers[j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int[] numbers = {9,7,3,4,7,4,8,2,4,1,6,12,14,15,123};
		selectionSort(numbers, 10);
	}
}
