package Practise1;
import java.util.*;
public class VMWare_Com1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			sc.nextLine();
		}
		int dis= Verify(a);
		System.out.println(dis);
	}
	static int Verify(int[] a)
	{
		int first=0,last=a.length-1, pivot=1;
		for(int i=0;i<a.length;i++)
		{
		int sum1=0;int sum2=0;
		while(first<pivot)
		{
			sum1=sum1+a[first];
			first++;
		}
		while(pivot<last)
		{
			sum2=sum2+a[last];
			last--;
		}
		if(sum1==sum2)
		{
			return pivot;
		}
		pivot++;
		first=0;
		last=a.length-1;
		}
		return -1;
	}
		
}
