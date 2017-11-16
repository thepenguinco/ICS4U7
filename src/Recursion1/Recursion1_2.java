package Recursion1;

public class Recursion1_2 
{
	public class Node 
	{
		int data;
		Node next;
	}
	public int max (Node header) 
	{
		return Math.max(header.data, max(header.next));
	}
	public static void main(String[] args)
	{
		
	}

}
