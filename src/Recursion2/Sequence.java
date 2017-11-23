package Recursion2;

public class Sequence 
{
	public static int sequence(int term)
	{
		if (term == 0) return -1;
		else if (term == 1) return 4;
		else if (term == 2) return 5;
		else return sequence(term - 1) * sequence(term - 2);
	}
	public static void main(String[] args) 
	{
		for (int i = 1; i < 8; i++) System.out.println(sequence(i));
	}
}
