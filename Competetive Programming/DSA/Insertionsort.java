import java.util.Arrays;

public class Insertionsort {
    public static void Isort(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current)  // j=
            {
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=current;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,9,1,3};
        Isort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
