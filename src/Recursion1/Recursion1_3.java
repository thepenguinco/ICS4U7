package Recursion1;

public class Recursion1_3 
{
	public static int square(int n)
	{
		if (n == 1) return 1;
		else return square(n-1) + (2 * n) - 1;
	}
	public static void main(String[] args)
	{
		System.out.println(square(12));
	}
}
