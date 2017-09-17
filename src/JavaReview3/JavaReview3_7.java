package JavaReview3;

import java.util.*;

public class JavaReview3_7 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		String substring = scanner.nextLine();
		sentence = sentence.replaceAll(substring, "");
		System.out.println(sentence);
	}
}
