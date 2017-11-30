package LinkedList;

import java.util.Scanner;

public class LLTester 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		LList llist = new LList();
		int option;
		while (true)
		{			
			System.out.println("Menu of Linked List");
			System.out.println("1. Get the size of the list");
			System.out.println("2. Find out if the list is empty");
			System.out.println("3. Insert an item to the list at the specified location");
			System.out.println("4. Delete an item from the list");
			System.out.println("5. Replace an item in the list");
			System.out.println("6. Look up an item in the list");
			System.out.println("7. Print the list");
			System.out.println("8. Print the list in reverse");
			System.out.println("9. Exit the program");
			System.out.println("Enter your menu option:");
			option = scanner.nextInt();
			int index;
			int data;
			switch (option)
			{
				case 1:
					System.out.println(llist.getSize());
					break;
				case 2:
					System.out.println(llist.isEmpty());
					break;
				case 3:
					index = scanner.nextInt();
					data = scanner.nextInt();
					llist.insert(index, data);
					break;
				case 4:
					index = scanner.nextInt();
					llist.delete(index);
					break;
				case 5:
					index = scanner.nextInt();
					data = scanner.nextInt();
					llist.replace(index, data);
					break;
				case 6:
					index = scanner.nextInt();
					System.out.println(llist.lookUp(index));
					break;
				case 7:
					llist.display();
					break;
				case 8:
					llist.displayReverse();
					break;
				case 9:
					System.exit(0);
				default:
					System.out.println("That's not a valid menu option!");
			}
		}
	}
}
