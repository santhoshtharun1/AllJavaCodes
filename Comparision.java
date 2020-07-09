package Practise1;
import java.util.*;
public class Comparision {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[] =new int[3];
		int b[] =new int[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<b.length;j++)
		{
			b[j]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>b[i])
			{
				count1++;
			}
			else if(a[i]<b[i])
			{
				count2++;
			}
		}
		System.out.println("count1: "+count1);
		System.out.println("count2: "+count2);
	
	}
}
