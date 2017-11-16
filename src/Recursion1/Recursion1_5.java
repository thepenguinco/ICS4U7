package Recursion1;

public class Recursion1_5 
{
	public static int gcd(int n, int m)
	{
		if (n == 0) return m;
		return gcd(m % n, n);
	}
	public static void main(String[] args)
	{
		System.out.println(gcd(12, 8));
	}
}
