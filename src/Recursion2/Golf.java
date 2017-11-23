package Recursion2;

import java.util.Scanner;

public class Golf {
	public static int golf()
	{
		
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter hole length: ");
		int holeLength = scanner.nextInt();
		System.out.println("Enter number of clubs: ");
		int clubs = scanner.nextInt();
		System.out.println("Enter the club lengths one per line: ");
		int[] clubLengths = new int[clubs];
		for (int i = 0; i < clubs; i++)
		{
			clubLengths[i] = scanner.nextInt();
		}
		System.out.println();
	}

}
