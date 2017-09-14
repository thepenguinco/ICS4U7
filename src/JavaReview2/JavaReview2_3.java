package JavaReview2;

import java.util.*;

/*
 * Letter.java
 */
public class JavaReview2_3 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int mass = scanner.nextInt();
		int cost = 0;
		if (mass <= 30) 
		{
			System.out.println("40 sinas");
		}
		else if (mass <= 50) 
		{
			System.out.println("55 sinas");
		}
		else if (mass <= 100) 
		{
			System.out.println("70 sinas");
		}
		else 
		{
			mass = mass - 100;
			cost = 70 + (int) (Math.ceil(mass / 50.0) * 25);
			System.out.println(cost + " sinas");
		}
	}
}
