package Practise1;
import java.util.*;
public class SecondLargest 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[] =new int[n];
		int i;
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[a.length-2]);
	}
}
