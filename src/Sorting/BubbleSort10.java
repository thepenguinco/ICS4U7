package Sorting;

public class BubbleSort10 
{
	public static void shakeSort(double[] array) {
        boolean swapped = true;
        int start = -1;
        int end = array.length;
 
        while (swapped)
        {
            swapped = false;
            start = start + 1;
            for (int i = start; i < end-1; ++i)
            {
                if (array[i] > array[i + 1])
                {
                    double temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
    		for (int i = 0; i < array.length; i++)
    		{
    			System.out.print(array[i] + " ");
    		}
    		System.out.println();
            
            swapped = false;
            end = end - 1;
            for (int i = end-1; i >=start; i--)
            {
                if (array[i] > array[i+1])
                {
                    double temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
    		for (int i = 0; i < array.length; i++)
    		{
    			System.out.print(array[i] + " ");
    		}
    		System.out.println();
        }
    }

	public static void main(String[] args)
	{
		double[] numbers = {1.0,3.4,9,3,10.2,10.3,81.2,1.1,0.8};
		shakeSort(numbers);
	}
}
