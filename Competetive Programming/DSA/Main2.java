import java.util.*;
class Node{
   Node left,right;
   int data;
   Node(int data)
   {
      this.data=data;
      left=right=null;
   }
}
class Traversal
{
   //int sumofleft,sumofright;
   public void inorder(Node root )
   {
      if(root ==null)
      return;
      inorder(root.left);
      System.out.println(root.data);
      inorder(root.right);
      
   }
   public   int  countNodes(Node root )
   {
      if(root ==null)
      return 0;
        int leftc=countNodes(root.left);
      int  rightc=countNodes(root.right);
      return leftc+rightc ;
   }
}
public class Main2{
   public static void main(String[] args) {
      Node root=new Node(25);
      root.left =new Node(10);
      root.right=new Node(30);
      root.left.right=new Node(40);
      root.right.left=new Node(50);
     Traversal t=new Traversal();
     t.inorder(root); 
     System.out.println(t.countNodes(root));
     //System.out.println(temp);
   }

public void levelOrder(Node root)
{

    if(root ==null)
    return;
    Queue<Node> q= new LinkedList<>();
    q.add(root);
    q.add(null);
    while(!q.isEmpty())
    {
        Node curr= q.remove();
        if(curr==null){
        System.out.println();
        if(q.isEmpty())
        break;
        else{
            q.add(null);
        }
        }
        else{
            System.out.print(curr.data+" ");
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);

        }
    }
}
}