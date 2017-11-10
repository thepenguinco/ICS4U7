package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch7
{
	public static int binarySearch(int[] array, int target)
	{
		int head = 0;
		int tail = array.length - 1;
		int mid = (head + tail) / 2;
		while (tail >= head)
		{
			mid = (head + tail) / 2;
			if (target > array[mid]) head = mid + 1;
			else if (target < array[mid]) tail = mid - 1;
			else if (target == array[mid]) return mid;
		}
		return mid;
	}
	public static void main(String[] args)
	{
		int[] array = new int[20];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int) (Math.random() * 100);
		}
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("Enter an integer to search for: ");
		int target = scanner.nextInt();
		System.out.println("The integer was found closest to index: " + binarySearch(array, target));			
	}
}
