package JavaReview4;

import java.util.*;

public class JavaReview4_1
{
	/*
	 * Returns the number of occurrences of the value zero for a given array
	 */
	public static int getZeroCount(int[] array)
	{
		int zeroCount = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] == 0)
			{
				zeroCount++;
			}
		}
		return zeroCount;
	}
	
	/*
	 * Returns the product of all elements for a given array
	 */
	public static int getProduct(int[] array)
	{
		int product = 1;
		for (int i = 0; i < array.length; i++)
		{
			product = product * array[i];
		}
		return product;
	}
	
	/*
	 * Returns the sum of all positive elements for a given array
	 */
	public static int getPositiveSum(int[] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > 0)
			{
				sum = sum + array[i];
			}
		}
		return sum;
	}
	
	/*
	 * Returns the minimum value of all elements for a given array
	 */
	public static int getMinimum(int[] array)
	{
		int minimum = array[0];
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < minimum)
			{
				minimum = array[i];
			}
		}
		return minimum;
	}
	
	public static void main(String[] args) 
	{
		int[] sampleArray = {0, -3, 1, 3, 6, 12};
		System.out.println(getZeroCount(sampleArray));
		System.out.println(getProduct(sampleArray));
		System.out.println(getPositiveSum(sampleArray));
		System.out.println(getMinimum(sampleArray));	
	}
}