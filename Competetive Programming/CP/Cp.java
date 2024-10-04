import java.util.*;
public class Cp {
    public static void main(String[] args) {
        
    
    Scanner obj=new  Scanner(System.in);
    int t=obj.nextInt();
    while(t>1)
    {
        int n= obj.nextInt();
       // System.out.println("Enter the number of characters");
       char ch[]=obj.next().toCharArray();
       int q=0;
        
        for(int i=0;i<n;i++)
        {
            if(ch[i]=='Q')q++;
            else q=Math.max(0,q-1);

        }
        if(q==0)
        System.out.println("Yes");
        else System.out.println("No");

    }
}

    
}
