public class Singly1
{
	 static Node  head;
	 //static Node tail;
	 class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
			next = null;
		}
	}
	public void addFirst(int data)
	{
		Node node = new Node(data);
		if(head==null){
			head=node;
		}
		else{
			node.next=head;
			head=node;
		}

	}
	public void addAt(int pos ,int d){
		Node node= new Node(d);
		Node p=head;
		if(head==null)
		{
			head=node;
		}
		for(int i=0;i<pos-1;i++)
		{
			p=p.next;
		}
		node.next=p.next;
		p.next=node;
	}
	public void addLast(int data)
	{
		Node node = new Node(data);
		if(head==null){
			head=node;
			
		}
		Node curr = head;
			while(curr.next!=null){
				curr=curr.next;
				
			}
			curr.next =node;
			
	}
	public void DeleteAt(int pos)
	{
		Node p=head;
		for(int i=0;i<pos-1;i++)
		{
			p=p.next;

		}
		p.next=p.next.next;
	}
	public void Display(Node head)
	{
		Node temp=head;
		if(temp==null){
			System.out.println("List is Empty ");
		}
		else{
			while(temp!=null)
			{
				System.out.print(temp.data+"-> ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	 Node reverse(Node node ){
		Node prev=null;
		Node curr=node;
		Node temp=null;
		while(curr!=null){
			temp=curr.next;
			curr.next =prev;
			prev=curr;
			curr=temp;


		}
		node = prev;

		return node ;

	}


	public static void main(String[] args) 
	{
		Singly1 sl = new Singly1();
	//	sl.Display();
		sl.addFirst(10);
		sl.addLast(20);
		sl.addLast(30);
		sl.addLast(40);
		sl.Display(head);
		 head = sl.reverse( head);
		sl.addLast(5);
		sl.Display(head);
		sl.addAt(2,25);
		sl.Display(head);
		sl.DeleteAt(2);
		sl.Display(head);

	}
}
