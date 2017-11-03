package FileIOException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PrintLines
{
	public static void main(String[] args) throws IOException 
	{
		final String INPUT_FILE = "line.txt";
		try
		{
			BufferedReader inputFile = new BufferedReader(new FileReader(INPUT_FILE));
		    String lineOfText = inputFile.readLine();
		    while (lineOfText != null)
		    {
		    	System.out.println(lineOfText);
		    	lineOfText = inputFile.readLine();
		    } 
			inputFile.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println(INPUT_FILE + " not found.");
		}
	}
}
