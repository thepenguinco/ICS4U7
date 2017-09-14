package JavaReview2;

import java.util.*;

/*
 * CarRecall.java
 */
public class JavaReview2_4 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your car model: ");
		int modelNumber = scanner.nextInt();
		if (modelNumber == 119 || modelNumber == 179 || (modelNumber >= 189 && modelNumber <= 195) || modelNumber == 221 || modelNumber == 780) 
		{
			System.out.println("Your is defective.  It must be repaired.");
		}
		else 
		{
			System.out.println("Your car is not defective.");
		}
	}
}
