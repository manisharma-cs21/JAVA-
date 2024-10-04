public class Singly1
{
	Node head;
	Node tail;
	 class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
	public void addFirst(int data)
	{
		Node node = new Node(data);
		if(head == null)
		{
			head = tail = node;
		}
		else
		{
			node.next = head;
			head = node;
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
		Singly1 sl = new Singly1();
	//	sl.Display();
		sl.addFirst(10);
		sl.addLast(20);
		sl.addLast(30);
		sl.addLast(40);
		sl.Display();
		
		
	}
}
