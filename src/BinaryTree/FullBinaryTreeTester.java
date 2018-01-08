package BinaryTree;

import java.util.*;

public class FullBinaryTreeTester
{
    static Scanner sc = new Scanner(System.in);         

    final static int INSERT = 1;
    final static int DELETE = 2;
    final static int SIZE = 3;
    final static int EMPTY = 4;
    final static int LOOKUP = 6;
    final static int PRINT_PRE_ORDER=7;
    final static int PRINT_IN_ORDER = 8;
    final static int PRINT_POST_ORDER= 9;
    final static int EXIT = 0;

    static boolean quit = false;
    static BinaryTree data = new BinaryTree();

    public static void main (String[] args)
    {

        while (!quit)
        {
            displayMenu ();
            executeOptions ();
            System.out.print ("\nEnter any key to continue: ");
            sc.nextLine ();
            System.out.println();
        }

    } // main method
   
    public static void displaydata()
    {
        // for (int i = 1 ; i <= data.size () ; i++)
        // {
        //     System.out.println ("item " + i + ": " + data.lookUp (i));
        // }

    }

    public static void displayMenu()
    {

        System.out.println ("List Menu\n");
        System.out.println (INSERT + " : Add an item to the tree");
        System.out.println (DELETE + " : Delete an item from the tree");
        System.out.println (SIZE + " : Get the size of the tree");
        System.out.println (EMPTY + " : Find out if the list is empty");
        System.out.println (LOOKUP + " : Look up an item in the tree");
        System.out.println (PRINT_PRE_ORDER + " : Print the tree in the pre-order");
        System.out.println (PRINT_IN_ORDER + " : Print the tree in the in-order");
        System.out.println (PRINT_POST_ORDER + " : Print the tree in the post-order");
        System.out.println (EXIT + " : Exit the program");

    }

    public static void executeOptions()
    {
        int option;
        int index;
        int item;

        System.out.print ("Enter your menu option: ");
        option = sc.nextInt ();
        System.out.println ("\n");

        switch (option)
        {
	        case INSERT:
	            System.out.print ("Enter the item to be inserted: ");
	            item = sc.nextInt();
	            data.insert(item);
	        	System.out.println("Inserted item");
	        	break;
            case DELETE:
	            System.out.print ("Enter the item to be deleted: ");
	            item = sc.nextInt();
            	System.out.println("Deletion: " + data.remove(item));
            	break;
            case SIZE:
            	System.out.println(data.getSize(data.getRoot()));
            	break;
            case EMPTY:
            	System.out.println(data.isEmpty());
            	break;
            case LOOKUP:
	            System.out.print ("Enter the item to be found: ");
	            item = sc.nextInt();
	            System.out.println(data.search(item));
	            break;
            case PRINT_PRE_ORDER:
            	data.preOrder(data.getRoot());
            	break;
            case PRINT_IN_ORDER:
            	data.inOrder(data.getRoot());
            	break;
            case PRINT_POST_ORDER:
            	data.postOrder(data.getRoot());
            	break;
            case EXIT:
            	System.exit(0);
            default:
            	System.out.println ("Testing... that's not a valid option");
        }
    }
}