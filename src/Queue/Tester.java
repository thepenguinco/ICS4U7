package Queue;

import java.util.Scanner;

// This framework is not efficient
public class Tester 
{
	final static int QUEUE_CAPACITY = 10;
	final static int INSERT = 1;
	final static int REMOVE = 2;
	final static int FULL = 3;
	final static int EMPTY = 4;
	final static int TRAVERSE = 5;
	final static int EXIT = 0;

	static Scanner sc = new Scanner(System.in);
	static boolean quit = false;
	static Queue queue = new Queue(QUEUE_CAPACITY);

	public static void displayMenu ()
	{
		System.out.println ("Queue Menu");
		System.out.println (INSERT + " : Add an item to the queue");
		System.out.println (REMOVE + " : Delete an item from the queue");
		System.out.println (FULL + " : Find out if the queue is full");
		System.out.println (EMPTY + " : Find out if the queue is empty");
		System.out.println (TRAVERSE + " : Print out the elements of the Queue");
		System.out.println (EXIT + " : Exit the program");
	}

	public static void executeOptions ()
	{
		int option;
		int data;

		System.out.print ("Enter your menu option: ");
		option = sc.nextInt();
		System.out.println("\n");

		switch (option)
		{
		case INSERT:
			System.out.print ("Enter the item value to be inserted: ");
			data = sc.nextInt();
			if (queue.enqueue(new Node(data)))
				System.out.println ("added successfully");
			else
				System.out.println ("could not be added; queue is full");
			break;
		case REMOVE:
			if (queue.isEmpty()) 
				System.out.println ("The queue was empty");
			else 
			{
				data = queue.dequeue();
				System.out.println ("The item removed from the list = " + data);
			}	
			break;
		case FULL:
			if (queue.isFull())
				System.out.println ("Queue is full");
			else
				System.out.println ("Queue is not full");
			break;
		case EMPTY:
			if (queue.isEmpty())
				System.out.println ("The queue is empty");
			else
				System.out.println ("The queue is not empty");
			break;
		case TRAVERSE:
			if(queue.isEmpty())
				System.out.println("There are no elements in the Queue");
			else
				queue.traverse();
			break;
		case EXIT:
			System.out.println ("Good-bye");
			quit = true;
			break;
		default:
			System.out.println ("Loser... that's not a valid option");
		}
	}

	public static void main (String [] args)
	{
		while (!quit)
		{
			displayMenu();
			executeOptions();
			System.out.print ("\nEnter any key to continue: ");
			sc.nextLine ();
		}
	}
}