package JavaReview1;
import java.util.*;
		
public class JavaReview1_3 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		// Bad naming conventions, but this is just practice
		System.out.print("Enter a string: ");
		String a = scanner.nextLine();
		System.out.print("Enter a character: ");
		char b = scanner.next().charAt(0);
		System.out.print("Enter an integer: ");
		int c = scanner.nextInt();
		System.out.print("Enter a double: ");
		double d = scanner.nextDouble();
		System.out.println("The string is " + a + ".");
		System.out.println("The character is "+ b + ".");
		System.out.println("The integer is " + c + ".");
		System.out.println("The double is " + d + ".");
	}
}
