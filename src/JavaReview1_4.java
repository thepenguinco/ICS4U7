import java.util.*;

public class JavaReview1_4 
{
	public static void main(String[] args) 
	{
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter an integer strictly less than 1000: ");
	int number = scanner.nextInt();
	System.out.println("The hundreds digit is " + number / 100 + ".");
	System.out.println("The tens digit is " + (number / 10) % 10 + ".");
	System.out.println("The ones digit is " + number % 10 + ".");
	}
}
