package Recursion2;

import java.util.Scanner;

public class BitPatterns 
{
	public static void bitPattern(int n, int k, String s)
	{
		if (n == 0 && k == 0) System.out.println(s);
		else if (n == 0) return;
		else if (k == 0) bitPattern(n - 1, k, s + "0");
		else
		{
			bitPattern(n - 1, k - 1, s + "1");
			bitPattern(n - 1, k, s + "0");
		}
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int patterns = scanner.nextInt();
		for (int i = 0; i < patterns; i++)
		{
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			System.out.println("The bit patterns are");
			bitPattern(n, k, "");
			System.out.println();
		}
	}
}
