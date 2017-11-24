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
   
   private Node traverse (int i)
   {
      Node n = head;
   
      if (i < 0)
         return null;
   
      for (int j = 0 ; j < i ; j++)
      {
         if (n == null)
            return null;
         n = n.getNext ();
      }
      return n;
   }

   public void insert (int index, int data)
   {
      Node prev;
      Node newNode = new Node(data);
   
      if (index == 0)
      {
         if (!isEmpty())
            newNode.setNext(head);
         head = newNode;
      }
      else
      {
         prev = traverse(index - 1);
         if (prev == null) return;
         newNode.setNext (prev.getNext());
         prev.setNext (newNode);
      }
      size++;
   }

   public int size ()
   {
      return size;
   }

   public boolean isEmpty ()
   {
	   if (size == 0) return true;
	   else return false;
   }

   // TODO
   public Node lookUp(int index)
   {
      Node requested = head;
      for (int i = 0 ; i < index ; i++)
      {
    	  requested = requested.getNext();
    	  if (requested == null) return null;
      }
      return requested.getData();
   }

   public boolean delete (int i)
   {
     
     if(i < 0) return false;  
    
     else return true;
   }

   public boolean replace (int index, int data)
   {
     Node toReplace = head;
     if(toReplace != null)
     {
         toReplace.setData(data);
         return true;
     }
     return false;
   }

   public void displayReverse ()
   {
      int s = size();
      for(int i = size() - 1; i >=0; i--)
         System.out.println("Index: "  + i + " Value: " + lookUp(i));     
   }
}