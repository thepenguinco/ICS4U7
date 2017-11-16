package Recursion1;

public class Recursion1_1 
{
	public static int power_n(int x, int n)
	{
		if (n == 0) return 1;
		else return x * power_n(x, n - 1);
	}
	public static void main(String[] args)
	{
		System.out.println(power_n(2,9));
	}
}
