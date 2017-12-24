package BinaryTree;

public class BinaryTree
{
	private Node root;

	public BinaryTree ()
	{
		root = null;
	}

	public boolean insert (int data)
	{
		Node n = new Node (data, null, null);
		Node temp;

		if (root == null)
		{
			root = n;
		}
		
		else
		{
			temp = root;

			do
			{
				if (data == temp.getData() || data > temp.getData())
				{
					if (temp.getRight () == null)
					{
						temp.setRight(n);
						return true;
					}
					else
					{
						temp = temp.getRight();
					}
				}
				else
				{
					if (temp.getLeft () == null)
					{
						temp.setLeft (n);
						return true;
					}
					else
						temp = temp.getLeft ();
				}
			}
			while (true);

		}
		return true;
	}


	public Object search (int data)
	{
		Node temp;
		if (root == null)
			return null;
		else
		{
			temp = root;
			do
			{
				if (data.compareTo (temp.getData ()) == 0)
					return temp.getData ();
				else if (data.compareTo (temp.getData ()) > 0)
					temp = temp.getRight ();
				else
					temp = temp.getLeft ();


			}
			while (temp != null)

			return null;

		}


	}
}
