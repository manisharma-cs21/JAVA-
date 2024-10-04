public class Singly
{
	Node head;
	Node tail;
	private static class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
	public void addFirst(int d)
	{
		Node newnode = new Node(d);
		if(head == null)
		{
			head = tail = newnode;
		}
		else
		{
			newnode.next = head;
			head = newnode;
		}
	}
	
	public void addAt(int d, int pos)
	{
		Node newnode = new Node(d);
		Node p = head;
		if(head == null)
		{
			head = tail = newnode;
		}
		else
		{
			for(int i =1; i<pos-1;i++)
			{
				p = p.next;
			}
			newnode.next = p.next;
			p.next = newnode;
		}
	}
	public void addLast(int d)
	{
		Node node = new Node(d);
		if(head == null)
		{
			head = tail = node;
		}
		else
		{
			tail.next = node;
			tail = node;
		}
	}
	public void deleteFirst()
	{
		head = head.next;
	}
	public void deleteAt(int pos)
	{
		Node p = head;
		for(int i =1;i<pos-1;i++)
		{
			p = p.next;
		}
		p.next = p.next.next;
	}
    //public void deleteat(int d,int pos)
   // {
        
   // }
	public void Display()
	{
		Node p = head;
		if(p== null)
		{
			System.out.println("Node is Empty!");
		}
		else
		{
			while(p != null)
			{
				System.out.print(p.data+"-> ");
				p=p.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Singly sl = new Singly();
	//	sl.Display();
		sl.addFirst(10);
		sl.addLast(20);
		sl.addLast(30);
		sl.addLast(40);
		sl.Display();
		//sl.addAt(25,3);
	//	sl.Display();
	//	sl.deleteFirst();
	//	sl.deleteAt();
		sl.Display();
		
	}
}
