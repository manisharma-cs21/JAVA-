import java.util.Scanner;
public class Cp3 {
    public static void main(String[] args) {
        char[] a=(new Scanner(System.in)).next().toCharArray();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>'4'){
                a[i]=(char)('9'-a[i]+'0');
            }
        }
        System.out.println(a);
        
    }
    
}
