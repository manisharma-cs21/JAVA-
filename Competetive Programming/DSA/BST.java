class BST
{
static class Node {
    Node left ,right;
    int data;
    Node(int data)
    {
    this.data=data;
    left=right=null;
    }
}
public static Node insert(Node root,int val)
{
    if(root==null)
    {
        root =new Node(val);
        return root;
    }
    if(root.data>val)
    {
        root.left=insert(root.left,val);

    }
    else{
        root.right=insert(root.right,val);
    }
    return root;

}
    public static  void inorder(Node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static  void postorder(Node root)
    {
        if(root==null)
        return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static boolean search(Node root,int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data>key)
        {
            return  search(root.left,key);

        }
        else if(root.data==key)
        {
            return true;
        }
        else{
            return search(root.right,key);
        }
    }
    public static Node Delete(Node root ,int val)
    {
        if(root.data>val)
        {
            root.left=Delete(root.left,val);
        }
        else if(root.data<val)
        {
            root.right=Delete(root.right,val);
        }
        else // root.data==val
        {
            //case 1 if root's left and right child doesn't exist
            if(root.left==null &&root.right==null)
            {
                return null;
            }
            // Case 2: if right child is exist
            if(root.left==null)
            {
                return root.right;
            }
            //case 2: if left child is exist:
           else  if(root.right==null)
            {
                return root.left;
            }
            // Case 3: Both Child are exists
            Node Is=inorderSuccesor(root.right);
            root.data=Is.data;
            root.right=Delete(root.right,Is.data);

           
        }
        return root;
    

    }
    public static Node inorderSuccesor(Node root)
     {
        while(root.left!=null)
        {
            root=root.left;
           // return root;
        }
        return root;


    }
    public static void main(String[] args) {
      int   values[]= {3, 9, 6, 7, 4, 5, 2, 11, 1};
      Node root=null;
      for (int i=0;i<values.length;i++)
      {
        root=insert(root,values[i]);

      }
        inorder(root);
        System.out.println();
        postorder(root);
       Delete(root,6);
       // inorder(root);
    }
     

}