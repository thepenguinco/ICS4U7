package JavaReview2;

import java.util.*;

/*
 * FastFood.java
 */
public class JavaReview2_5 
{
	/*
	 * Menu Items
	 */
	static final int CHEESEBURGER = 461;
	static final int FISH_BURGER = 431;
	static final int VEGGIE_BURGER = 420;
	
	static final int SOFT_DRINK = 130;
	static final int ORANGE_JUICE = 160;
	static final int MILK = 118;
	
	static final int FRIES = 100;
	static final int BAKED_POTATO = 57;
	static final int CHEF_SALAD = 70;
	
	static final int APPLE_PIE = 167;
	static final int SUNDAE = 266;
	static final int FRUIT_CUP = 75;
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int burger, side, drink, dessert, calories = 0;

		System.out.println("Welcome to Chip’s Fast Food Emporium");
		System.out.print("Please enter a burger choice: ");
		burger = scanner.nextInt();
		System.out.print("Please enter a side order choice: ");
		side = scanner.nextInt();
		System.out.print("Please enter a drink choice: ");
		drink = scanner.nextInt();
		System.out.print("Please enter a dessert choice: ");
		dessert = scanner.nextInt();
		
		// Burger Calories
		if (burger == 1) 
		{
			calories = calories + CHEESEBURGER;
		}
		else if (burger == 2) 
		{
			calories = calories + FISH_BURGER;
		}
		else if (burger == 3) 
		{
			calories = calories + VEGGIE_BURGER;
		}
		
		// Side Calories
		if (side  == 1) 
		{
			calories = calories + FRIES;
		}
		else if (side == 2) 
		{
			calories = calories + BAKED_POTATO;
		}
		else if (side == 3) 
		{
			calories = calories + CHEF_SALAD;
		}
		
		// Drink Calories
		if (drink == 1) 
		{
			calories = calories + SOFT_DRINK;
		}
		else if (drink == 2) 
		{
			calories = calories + ORANGE_JUICE;
		}
		else if (drink == 3) 
		{
			calories = calories + MILK;
		}
		
		// Dessert Calories
		if (dessert == 1) 
		{
			calories = calories + APPLE_PIE;
		}
		else if (dessert == 2) 
		{
			calories = calories + SUNDAE;
		}
		else if (dessert == 3) 
		{
			calories = calories + FRUIT_CUP;
		}
		
		System.out.println("Your total calorie count is: " + calories + ".");
	}
}