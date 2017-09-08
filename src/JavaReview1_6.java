import java.util.*;

public class JavaReview1_6
{
	public static void main(String[] args) 
	{
		// Again, some very terrible style conventions here
		int y, p, q, r, s, t, u, m, d;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a year to find out when Easter falls in this year: ");
		y = scanner.nextInt();
		p = y / 100;
		q = y - (19 * (y / 19));
		r = (p - 17) / 25;
		s = p - (p / 4) - ((p - r) / 3) + (19 * q) + 15;
		s = s - (30 * (s / 30));
		s = s - (s / 28) * (1 - ((s / 28) * (29 / (s + 1)) * ((21 - q) / 11)));
		t = y + (y / 4) + s + 2 - p + (p / 4);
		t = t - (7 * (t / 7));
		u = s - t;
		m = 3 + ((u + 40) / 44);
		d = u + 28 - (31 * (m / 4));
		System.out.println(m + " " + d);
	}
}
