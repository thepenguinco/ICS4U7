package FileIOException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ClassTest
{
	public static void main(String[] args) throws IOException
	{
		final int CLASS_SIZE = 10;
		final int TESTS_GIVEN = 5;
		final String OUTPUT_FILE = "result.txt";
		
		int[][] studentMarks = new int[CLASS_SIZE][TESTS_GIVEN];
		double highestAverage = 0;
		int highestAverageIndex = 0;
		Scanner scanner = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter(new FileWriter(OUTPUT_FILE));

		for (int i = 0; i < CLASS_SIZE; i++)
		{
			for (int j = 0; j < TESTS_GIVEN; j++)
			{
				System.out.print("Please enter the grade for test " + j + " of student " + i + ": ");
				studentMarks[i][j] = scanner.nextInt();
			}
		}

		for (int i = 0; i < CLASS_SIZE; i++)
		{
			double average = 0;
			for (int j = 0; j < TESTS_GIVEN; j++)
			{
				average = average + studentMarks[i][j];
			}
			average = average / ((double) TESTS_GIVEN);
			if (average > highestAverage)
			{
				highestAverageIndex = i;
				highestAverage = average;
			}
			outputFile.print("Student " + i + " average: ");
			outputFile.print(average);
			outputFile.println();
		}
		
		outputFile.println("Student " + highestAverageIndex + " has the highest average in this class.");
		
		for (int i = 0; i < TESTS_GIVEN; i++)
		{
			double average = 0;
			for (int j = 0; j < CLASS_SIZE; j++)
			{
				average = average + studentMarks[j][i];
			}
			average = average / ((double) CLASS_SIZE);
			outputFile.print("Class average on test " + i + " is: ");
			outputFile.print(average);
			outputFile.println();
		}
		
		scanner.close();
		outputFile.close();
	}
}
