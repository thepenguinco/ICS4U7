package Recursion1;

public class Recursion1_4 
{
	public static boolean prime(int n)
	{
		return prime(n, n - 1);
	}
	public static boolean prime(int n, int m)
	{
		if (m == 1) return true;
		else if (n % m == 0) return false;
		else return prime (n, m - 1);
	}
	public static void main(String[] args)
	{
		System.out.println(prime(129));
	}
}
