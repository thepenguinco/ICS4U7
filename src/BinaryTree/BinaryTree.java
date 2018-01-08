package BinaryTree;

public class BinaryTree
{
	private Node root;

	public BinaryTree()
	{
		root = null;
	}

	public boolean insert(int data)
	{
		Node node = new Node(data);
		Node current;

		if (root == null)
		{
			root = node;
		}
		else
		{
			current = root;
			do
			{
				if (data == current.getData() || data > current.getData())
				{
					if (current.getRight() == null)
					{
						current.setRight(node);
						return true;
					}
					else
						current = current.getRight();
				}
				else
				{
					if (current.getLeft() == null)
					{
						current.setLeft(node);
						return true;
					}
					else
					{
						current = current.getLeft();
					}
				}
			} while (true);
		}
		return true;
	}

	public boolean search(int data)
	{
		Node current;
		if (root == null)
			return false;
		else
		{
			current = root;
			do
			{
				if (data == current.getData())
					return true;
				else if (data > current.getData())
					current = current.getRight ();
				else
				{
					current = current.getLeft ();
				}
			} while (current != null);
			return false;
		}
	}

    public boolean remove(int data)
    {
        if (root == null || search(data) == false) return false;
        else
        {
            root = remove(root, data);
            return true;
        }
    }
 
    private Node remove(Node root, int data)
    {
        Node previous;
        Node current; 
        Node left;
        Node right;
        Node n;
        if (root.getData() == data)
        {
            left = root.getLeft();
            right = root.getRight();
            if (left == null && right == null) return null;
            else if (left == null)
            {
                previous = right;
                return previous;
            } 
            else if (right == null)
            {
                previous = left;
                return previous;
            } 
            else
            {
                current = right;
                previous = right;
                while (previous.getLeft() != null)
                    previous = previous.getLeft();
                previous.setLeft(left);
                return current;
            }
        }
        if (data < root.getData())
        {
            n = remove(root.getLeft(), data);
            root.setLeft(n);
        } 
        else
        {
            n = remove(root.getRight(), data);
            root.setRight(n);
        }
        return root;
    }

	public Node getRoot()
	{
		return root;
	}

	public boolean isEmpty()
	{
		if (root == null) return true;
		else return false;
	}

	public int getSize(Node root)
	{
		if (root == null) return 0;
		else
		{
			int size = 1;
			size = size + getSize(root.getLeft());
			size = size + getSize(root.getRight());
			return size;
		}
	}

	public void preOrder(Node root) 
	{
		if(root != null) 
		{
			System.out.print(root.getData() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public void inOrder(Node root) 
	{
		if(root != null) 
		{
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}
	}

	public void postOrder(Node root) 
	{
		if(root != null) 
		{
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
		}
	}
}
