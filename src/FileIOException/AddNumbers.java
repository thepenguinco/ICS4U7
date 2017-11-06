package FileIOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AddNumbers
{
	public static void main(String[] args) throws IOException 
	{
		final String INPUT_FILE = "numbers.txt";
		try
		{
			int sum = 0;
			BufferedReader inputFile = new BufferedReader(new FileReader(INPUT_FILE));
		    String lineOfText = inputFile.readLine();
		    while (lineOfText != null)
		    {
			    sum = sum + Integer.parseInt(lineOfText);
		    	lineOfText = inputFile.readLine();
		    } 
			inputFile.close();
			System.out.println(sum);
		}
		catch (FileNotFoundException e)
		{
			System.out.println(INPUT_FILE + " not found.");
		}
	}
}
