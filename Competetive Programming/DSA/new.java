public void Postorder(Node root)
{
    
        if(root==null)
        return;
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data);

}