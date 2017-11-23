package Recursion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Golf {
	public static int golf(ArrayList<Integer> clubLengths, int holeLength)
	{
		// can use DP
		if (holeLength == 0) return 0;
		int shots = Integer.MAX_VALUE;
		for (int i = 0; i < clubLengths.size(); i++)
		{
			if (clubLengths.get(i) <= holeLength)
			{
				int testShot = golf(clubLengths, holeLength - clubLengths.get(i));
				if (testShot != Integer.MAX_VALUE && testShot + 1 < shots) shots = testShot + 1;
			}
		}
		return shots;
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter hole length: ");
		int holeLength = scanner.nextInt();
		System.out.print("Enter number of clubs: ");
		int clubs = scanner.nextInt();
		System.out.println("Enter the club lengths one per line: ");
		ArrayList<Integer> clubLengths = new ArrayList<Integer>();
		for (int i = 0; i < clubs; i++)
		{
			clubLengths.add(scanner.nextInt());
		}
		System.out.print("The least number of shots is: ");
		System.out.println(golf(clubLengths, holeLength));
	}
}
