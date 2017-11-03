package FileIOException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Exceptions
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		while (true)
		{
			int numerator = 1;
			int denominator = 1;
			boolean goodData = false;
			while (!goodData)
			{
				try
				{
					System.out.print("Enter the numerator: ");
					String input = console.readLine();
					if (input.charAt(0) == 'q' || input.charAt(0) == 'Q') System.exit(0);
					numerator = Integer.parseInt(input);
					goodData = true;
				}
				catch (NumberFormatException e)
				{
					System.out.println("You entered bad data.");
					System.out.println("Please try again.");
					System.out.println();
				}
			}
			goodData = false;
			while (!goodData)
			{
				try
				{
					System.out.print("Enter the denominator: ");
					String input = console.readLine();
					denominator = Integer.parseInt(input);
					System.out.println(numerator + " / " + denominator + " is " + numerator / denominator);
					goodData = true;
				}
				catch (InputMismatchException e)
				{
					System.out.println("You entered bad data.");
					System.out.println("Please try again.");
				}
				catch (ArithmeticException e)
				{
					System.out.println("You can't divide " + numerator + " by 0");
					goodData = true;
				}
				finally
				{
					System.out.println();
				}
			}
		}
	}
}
