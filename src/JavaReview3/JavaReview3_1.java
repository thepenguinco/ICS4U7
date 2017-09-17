package JavaReview3;

import java.util.*;

public class JavaReview3_1 
{
	public static double naturalPower(int base, int power) {
		return Math.pow(Math.E, power * Math.log(base));
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the base: ");
		int base = scanner.nextInt();
		System.out.print("Enter the power: ");
		int power = scanner.nextInt();
		System.out.println("Formula:" + naturalPower(base, power));
		System.out.println("Math.pow: " + Math.pow(base, power));
	}
}
