package BinaryTree;

public class Node
{
	private int data;
	private Node right, left;

	public Node()
	{
		this (0, null, null);
	}

	public Node(int data, Node left, Node right)
	{
		this.data = data;
		this.right = right;
		this.left = left;
	}

	public Node(int data)
	{
		this.data = data;
		this.right = null;
		this.left = null;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public void setRight(Node right)
	{
		this.right = right;
	}

	public void setLeft(Node left)
	{
		this.left = left;
	}

	public int getData()
	{
		return data;
	}

	public Node getRight()
	{
		return right;
	}

	public Node getLeft()
	{
		return left;
	}
}