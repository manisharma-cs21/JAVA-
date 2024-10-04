
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
class TreeTraversal
{
    public void Inorder(Node root)
    {
        if(root==null)
        return ;
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
        
    }
    public void Postorder(Node root)
    {
        
            if(root==null)
            return;
            Postorder(root.left);
            Postorder(root.right);
            System.out.println(root.data);
    
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
        public   int countNodes(Node root)
        {
            if(root==null)
            return 0;
            int Leftc =countNodes(root.left);
            int rightc=countNodes(root.right);
            return Leftc +rightc+1;
        }
        public int  sumofNodes(Node root)
        {
            if(root==null)
            {
                return 0;
            }
            int sumofleft=sumofNodes(root.left);
            int sumofright=sumofNodes(root.right);
            return sumofleft+sumofright+root.data ;
        }
    public   static int height(Node root)
    {
        if(root==null)
        return 0;
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return (Math.max(leftheight,rightheight)+1);
    }
public void   search(Node root,int data)
{
    if(root==null || root.data==data)
    {
        System.out.println(root);
     
    }
    if(root.data<data)
    {
        System.out.println(root.right.data);
    }
    if(root.data>data)
    {
    System.out.println(root.left.data);
    }
    

}
public   int Diameter(Node root)
{
    if(root==null)
    {
        return 0;
    }
    int diam1=Diameter(root.left);
    int diam2=Diameter(root.right);
    int diam3=height(root.left) + height(root.right) + 1;
    return Math.max(diam3,Math.max(diam1,diam2));


}
   /*  public void preorder(Node root)
    {
        if(root==null)
        return ;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    void LevelOrder(Node root)
    {
        int h=heihgt(root);

    }
    static int height(Node root)
    {
        if(root ==null)
        return 0;
        else{
            int lheight=height(root.left);
            int rheight=height(root.right);
            return(Math.max(lheight,rheight)+1);
        }
    }

}*/


class Treeinfo
{
    int ht;
    int diam;
    Treeinfo(int ht,int diam)
    {
        this.ht=ht;
        this.diam=diam;

    }
}

    public  Treeinfo Diameter2(Node root)
    {
    if(root==null)
    {
        return  new Treeinfo(0,0) ;

    }
    Treeinfo left=Diameter2(root.left);
    Treeinfo right =Diameter2(root.right);
      int diam1=left.diam;
      int diam2=right.diam;
      int diam3=left.ht+right.ht+1;
      int mydiam=Math.max(Math.max(diam1,diam2),diam3);
      int myheight=Math.max(left.ht,right.ht)+1;
      Treeinfo myinfo=new Treeinfo(myheight,mydiam);
      return myinfo;
}
}

class Main{
 /**
 * @param args
 */
public static void main(String[] args) {
    Node root=new Node(20);
    root.left=new Node(10);
    root.right=new Node(50);
    root.left.right=new Node(15);
    root.right.left=new Node(40);
    TreeTraversal t = new TreeTraversal();
    //t.Inorder(root);
    //System.out.println("in LevelOrder");
  // t.preorder(root);
  //t.levelOrder(root);
  //System.out.println(t.height(root));
   //t.search(root,15);
   t.levelOrder(root);
   t.Postorder(root);
  
  // System.out.println(t.Diameter2(root).diam);


    
}
}