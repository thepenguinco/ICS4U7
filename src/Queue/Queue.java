package Queue;

// The queue does not have any checks in place
public class Queue
{
	Node head, rear;
	int capacity;
	int size;

	public Queue(int capacity)
	{
		head = null;
		rear = null;
		size = 0;
		this.capacity = capacity;
	}

	public boolean isEmpty()
	{ 
		if (size == 0) return true;
		else return false;
	}
 
	public int dequeue()
	{
		int value = head.getData();
		head = head.getNext();
		size = size - 1;
		return value;
	}

	public boolean enqueue(Node node)
	{
		if (this.isEmpty())
		{
			this.head = node;
			this.rear = node;
			size = size + 1;
			return true;
		}
		else if (size <= capacity)
		{
			rear.setNext(node);
			rear = node;
			size = size + 1;
			return true;
		}
		else return false;
	}

	public int peek()
	{
		return head.getData();
	}

	public boolean isFull()
	{
		if (size == capacity) return true;
		else return false;
	}

	public void traverse()
	{
		// prints the Queue in order (top of queue to bottom)
		Node current = head;
		while (current != null)
		{
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
}
