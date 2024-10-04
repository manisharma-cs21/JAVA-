import java.util.Scanner;
public class Cp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        //sc.nextLine();
        for(int i=0;i<t;i++)
        {
            String s=sc.nextLine();
            if(isSortable(s)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        //Scanner.close();

    }
    public static boolean isSortable(String s) {
        if (s.charAt(0))
        
    }



    
}
