import java.util.*;
public class MergeSort
{
	public static void ms(int[] ar)
	{
		int l = ar.length;
		if(l<2) { return; }
		int mid = l/2;
		int[] left = new int[mid];
		int[] right = new int[l-mid];
		for(int i = 0; i<mid; i++)
		{
			left[i] = ar[i];
		}
		for(int i = mid;i<l; i++)
		{
			right[i-mid] = ar[i];
		}
		ms(left);
		ms(right);
		merge(ar, left, right);
	}
	public static void merge(int[] ar, int[] left, int[] right)
	{
		int l = left.length;
		int r = right.length;
		int i =0;
		int j= 0;
		int pos =0;
		while(i<l && j<r)
		{
			if(left[i] <right[j])
			{
				ar[pos] = left[i];
				i++;
				pos++;
			}
			else if(left[i] >right[j])
			{
				ar[pos] = right[j];
				j++;
				pos++;
			}
			else
			{
				ar[pos] = left[i];
				i++;
				pos++;
				ar[pos] = right[j];
				j++;
				pos++;
			}
		}
		while(i<l)
		{
			ar[pos] = left[i];
			i++;
			pos++;
		}
		while(j<r)
		{
			ar[pos] = right[j];
			j++;
			pos++;
			
		}
	}
	public static void main(String[] args)
	{
		int[] arr = {3,6,3,8,5,3,9,4};
		ms(arr);
		System.out.println(Arrays.toString(arr));
		
		//System.out.println("\n\n\n\t\tBy - JKS");
	}
}
