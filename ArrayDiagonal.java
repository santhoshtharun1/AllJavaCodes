package Practise1;

import java.util.*;
public class ArrayDiagonal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int arr[][] =new int[n][n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		int d1=0;
		int d2=0;
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			 d1=d1+arr[i][i];
			 d2=d2+arr[i][j-i];
		}
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(Math.abs(d1-d2));
	}
}
