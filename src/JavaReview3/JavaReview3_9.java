package JavaReview3;

import java.util.*;

public class JavaReview3_9 
{
	public static double norm(double x, double y, double z) 
	{
		return Math.pow(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) , 0.5);
	}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of a: ");
		double a = scanner.nextDouble();

		System.out.print("Enter the value of b: ");
		double b = scanner.nextDouble();

		System.out.print("Enter the value of c: ");
		double c = scanner.nextDouble();
		
		double p = 1 / norm(a, b, c);
		double q = norm(a * a, b * b, c * c);
		double r = 1 / norm(2 * a, 3 * b, 5 * c);
		double s = norm(Math.pow(3, 0.5) * a, 0, 0) * norm(0, Math.pow(12, 0.5) * b, 0) * norm(0, 0, Math.pow(27, 0.5) * c);
		
		System.out.println("p: " + p);
		System.out.println("q: " + q);
		System.out.println("r: " + r);
		System.out.println("s: " + s);
	}
}
