package Sorting;

public class InsertionSort5 
{
	public static void insertionSort(int[] arr) 
	{
		int i, j, newValue;
		for (i = 1; i < arr.length; i++) 
		{
			newValue = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > newValue) 
			{
				arr[j] = arr[j - 1];
				j-- ;
			}
			arr[j] = newValue;
			for (int k = 0; k < arr.length; k++)
			{
				System.out.print(arr[k] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int[] numbers = {6,2,8,3,1,7,4};
		insertionSort(numbers);
	}
}
