package FileIOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReverseLines 
{
	public static void main(String[] args) throws IOException
	{
		final String INPUT_FILE = "reverse.txt";
		BufferedReader inputFile = new BufferedReader(new FileReader(INPUT_FILE));
		int numberOfLines = Integer.parseInt(inputFile.readLine());
		for (int i = 0; i < numberOfLines; i++)
		{
			String line = inputFile.readLine();
			// alternative, use a char array or use charAt
			line = new StringBuilder(line).reverse().toString();
			System.out.println(line);
		}
		inputFile.close();
	}
}
