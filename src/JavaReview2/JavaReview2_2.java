package JavaReview2;

import java.util.*;

/*
 * PackageCheck.java
 */
public class JavaReview2_2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the weight of the package in kg: ");
		double weight = scanner.nextDouble();
		System.out.print("Enter the length of the package in cm: ");
		double length = scanner.nextDouble();
		System.out.print("Enter the width of the package in cm: ");
		double width = scanner.nextDouble();
		System.out.print("Enter the height of the package in cm: ");
		double height = scanner.nextDouble();
		double volume = height * weight* length;
		if (weight > 27 && volume > 100000) 
		{ 
			System.out.println("Too heavy and too large!"); 
		}
		else if (weight > 27) 
		{ 
			System.out.println("Too heavy!"); 
		}
		else if (volume > 100000) 
		{ 
			System.out.println("Too large!"); 
		}
		else 
		{ 
			System.out.println("Perfect!"); 
		}
	}
}
