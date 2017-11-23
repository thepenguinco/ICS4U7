package TestingArea;

public class Testing {
	public static void selectionSort (int[] numbers)
	{
		int min, temp;
		for (int index = 0; index < numbers.length-1; index++)
		{
			min = index;
			for (int scan = index+1; scan < numbers.length; scan++)
			if (numbers[scan] < numbers[min])
				min = scan;
			// Swap the values
			temp = numbers[min];
			numbers[min] = numbers[index];
			numbers[index] = temp;
		}
	}
	public static void main(String[] args)
	{
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = (int) (Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		selectionSort(arr);
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
