package Sorting;

public class SelectionSort1 
{
	public static void main(String[] args)
	{
		String[] name = {"Renee", "Brien", "Vincent", "Doris", "Scarlett"};
		for (int i = 0; i < name.length - 1; i++)
		{
			for (int j = i + 1; j < name.length; j++)
			{
				// > 0 means Word 1 is greater than Word 2
				if (name[i].compareTo(name[j]) > 0)
				{
					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}
			for (int j = 0; j < name.length; j++)
			{
				System.out.print(name[j] + " ");
			}
			System.out.println();
		}
	}
}
