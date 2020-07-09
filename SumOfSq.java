package Practise1;
import java.util.*;
public class SumOfSq {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n1=0;
		for(int i=0;i<arr.length;i++)
		{
				n1=n1+arr[i]*arr[i];
		}
		System.out.println(n1);
	}

}
