package JavaReview2;

import java.util.*;
/*
 * (Letter.java) In the country of Rahmania, the cost of mailing a letter is 40
sinas for letters up to 30 g, 55 sinas for letters over 30 g and up to 50 g, 70
sinas for letters over 50 g and up to 100 g, and then an additional 25 sinas
for each additional 50 g or part thereof. Write a program that prompts the
users for a mass and then give the cost of mailing a letter having that mass.
 */
public class JavaReview2_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mass = scanner.nextInt();
		int cost = 0;
		if (mass <= 30) {
			System.out.println("40 sinas");
		}
		else if (mass <= 50) {
			System.out.println("55 sinas");
		}
		else if (mass <= 100) {
			System.out.println("70 sinas");
		}
		else {
			mass = mass - 100;
			cost = 70 + (int) (Math.ceil(mass / 50.0) * 25);
			System.out.println(cost + " sinas");
		}
		
	}
}
