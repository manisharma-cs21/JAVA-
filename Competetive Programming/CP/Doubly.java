public class Doubly
{
    static Node head;
    Node tail;
     class Node {
        int d;
        Node prev;
        Node next;
       public  Node(int d){
        this.d = d;
        prev= next = null;
       }
       
    }
    public void addFirst(int d )
       {
        Node node = new Node(d);
        if(head==null)
        {
            head=tail=node;
            node.prev=null;
            node.next=null;
        }
        head.prev=node;
        node.next=head;
        node=head;
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
				System.out.print(temp.d+"-> ");
				temp=temp.next;
			}
			System.out.println();
		}
    }


    public static void main(String[] args)
    {
        Doubly dl = new Doubly();
        dl.addFirst(50);
        dl.addFirst(40);
        dl.Display(head);
    }
    
}
