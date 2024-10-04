import java.util.*;


class Node{
    int  data;
    Node left,right;
    Node(int data)
    {
        this.data=data;
        left=right=null;

    }

} 
class Traversal
{
    public void postorder(Node root)
    {   
        if(root==null)
        return;
        postorder(root.left);
        postorder(root.right);
        System.out.println(root);
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
public class Main3 {
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(10);
        root.right=new Node(50);
        root.left.right=new Node(15);
        root.right.left=new Node(40);
        Traversal t = new Traversal();
        t.levelOrder(root);
}
}
}