import java.util.*;

public class JavaReview1_9 
{
	static final int GRADE_COUNT = 5;
	public static void main(String[] args) 
	{
		int answer = 0;
		// Non IBIO Input
		Scanner scanner = new Scanner(System.in);
		// Retrieve the various grades
		for (int i = 0; i < GRADE_COUNT ; i++) 
		{
			answer = answer + scanner.nextInt();
		}
		// Find the average and display for the user
		System.out.println(answer / (double) GRADE_COUNT);
	}
}
