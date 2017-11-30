package LinkedList;

public class LList
{
	Node head;
	int size;

	public LList()
	{
		head = null;
		size = 0;
	}

	// simplify if I have time
	public void insert(int index, int data)
	{
		Node prev = head;
		Node newNode = new Node(data);

		if (index == 0)
		{
			if (!isEmpty())
				newNode.setNext(head);
			head = newNode;
		}
		else
		{
			Node current = head;
			for (int i = 0; i < index; i++)
			{
				prev = current;
				current = current.getNext();
			}
			if (prev == null) return;
			newNode.setNext(prev.getNext());
			prev.setNext(newNode);
		}
		size++;
	}

	public int getSize()
	{
		return size;
	}

	public boolean isEmpty()
	{
		if (size == 0) return true;
		else return false;
	}

	public int lookUp(int index)
	{
		Node requested = head;
		for (int i = 0 ; i < index ; i++)
		{
			requested = requested.getNext();
			if (requested == null) return -1;
		}
		return requested.getData();
	}

	// simplify if I have time
	public void delete (int index)
	{
		Node prev = null;

		if (index == 0)
		{
			head = head.getNext();
		}
		else
		{
			Node current = head;
			for (int i = 0; i < index; i++)
			{
				prev = current;
				current = current.getNext();
			}
			if (prev == null) return;
			prev.setNext(current.getNext());
		}
		size--;
	}

	public void replace(int index, int data)
	{
		Node current = head;
		for (int i = 0; i < index; i++)
		{
			current = current.getNext();
		}
		if (current != null)
		{
			current.setData(data);
		}
	}

	public void display()
	{
		for (int i = 0; i < getSize(); i++)
			System.out.println("Index: "  + i + " Value: " + lookUp(i));    
	}

	public void displayReverse()
	{
		for (int i = getSize() - 1; i >= 0; i--)
			System.out.println("Index: "  + i + " Value: " + lookUp(i));     
	}
}