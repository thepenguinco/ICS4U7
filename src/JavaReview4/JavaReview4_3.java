package JavaReview4;

import java.util.*;

/*
 * Lascap's Triangle 
 */
public class JavaReview4_3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		int[][] lascap = new int[rows+2][rows+2];

		for (int i = 1; i <= rows; i++) 
		{
			lascap[i][1] = i;
			for (int j = 2; j < i; j++)
			{
				lascap[i][j] = lascap[i-1][j-1] + lascap[i-1][j];
			}
			lascap[i][i] = i;
		}
		
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(lascap[i][j] + " ");
			}
			System.out.println();
		}
	}
}
