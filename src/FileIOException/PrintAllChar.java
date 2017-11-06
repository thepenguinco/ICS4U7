package FileIOException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintAllChar
{
	public static void main(String[] args) throws IOException
	{
		final String INPUT_FILE = "allChar.txt";
		BufferedReader inputFile = new BufferedReader(new FileReader(INPUT_FILE));
		String line = inputFile.readLine();
		while (line != null)
		{
			for (int i = 0; i < line.length(); i++)
			{
				if (line.charAt(i) != ' ') System.out.println(line.charAt(i));
			}
			line = inputFile.readLine();
		}
		inputFile.close();
	}
}
