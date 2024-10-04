import java.util.Scanner;
public class cp2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number ");
        int n=s.nextInt();
       int  r=0;
        while(n-->0)
            r+=s.next().contains("+")?1:-1;
            System.out.println(r);


        

    
    }
    
}
