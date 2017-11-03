package FileIOException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StarTable 
{
	public static void main(String[] args) throws IOException
	{
		final String OUTPUT_FILE = "star.txt";
		Scanner scanner = new Scanner(System.in);
		PrintWriter outputFile = new PrintWriter(new FileWriter(OUTPUT_FILE));
		System.out.print("Enter the height of the star table: ");
		int height = scanner.nextInt();
		System.out.print("Enter the width of the star table: ");
		int width = scanner.nextInt();
		char[][] starTable = new char[height][width];
		// initialize the array with *
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				starTable[i][j] = '*';
			}
		}
		// redundant copy array to file
		for (int i = 0; i < height; i++)
		{
			for (int j = 0; j < width; j++)
			{
				outputFile.print(starTable[i][j]);
			}
			outputFile.println();
		}
		outputFile.close();
		System.out.println("Sucessfully generated the star table!");
	}
}
