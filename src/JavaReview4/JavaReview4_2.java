package JavaReview4;

import java.util.*;

public class JavaReview4_2
{
	/*
	 * Returns the number of elements of a given 2 dimensional array
	 */
	public static int getSize(int[][] array)
	{
		int size = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				size = size + 1;
			}
		}
		return size;
	}
	
	/*
	 * Returns the sum of all elements for a given 2 dimensional array
	 */
	public static int getSum(int[][] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				sum = sum + array[i][j];
			}
		}
		return sum;
	}
	
	/*
	 * Returns the number of elements that are multiples of 3 of a given 2 dimensional array
	 */
	public static int getMultiplesOf3(int[][] array)
	{
		int total = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				if (array[i][j] % 3 == 0)
				{
					total = total + 1;
				}
			}
		}
		return total;
	}
	
	/*
	 * Returns the range of a given array
	 */
	public static int getRange(int[][] array)
	{
		int minimum = array[0][0];
		int maximum = array[0][0];
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++) 
			{
				if (array[i][j] < minimum)
				{
					minimum = array[i][j];
				}
				if (array[i][j] > maximum)
				{
					maximum = array[i][j];
				}
			}
		}
		return maximum - minimum;
	}
	
	public static void main(String[] args) 
	{
	    int[][] sampleArray = new int[][] {
	        { 1, 2, 3 },{ 1, 2, 3, 4},
	    };
	    System.out.println(getSize(sampleArray));
	    System.out.println(getSum(sampleArray));
	    System.out.println(getMultiplesOf3(sampleArray));
	    System.out.println(getRange(sampleArray));
	}
}