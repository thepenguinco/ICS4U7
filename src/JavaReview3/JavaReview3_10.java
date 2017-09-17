package JavaReview3;

import java.util.*;

public class JavaReview3_10 
{
	public static int leastFactor(int n)
	{
		if (n <= 1)
		{
			return 0;
		}
		else {
			for (int i = 2; i <= Math.sqrt(n); i++)
			{
				if (n % i == 0)
				{
					return i;
				}
			}
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input;
		do
		{
			System.out.print("Enter a number you wish to prime factorize: ");
			input = scanner.nextInt();
			while (input > 1) {
				if (leastFactor(input) == 0) 
				{
					System.out.println(input);
					break;
				}
				System.out.println(leastFactor(input));
				input = input / leastFactor(input);
			}
			
		} while (input > 1);
	}
}
