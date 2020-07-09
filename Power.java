package Practise1;
import java.util.*;
import java.lang.Math.*;
public class Power {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double cal=0;
		double count =0;
		for(int i=1;i<=3;i++)
		{
			cal=Math.pow(n,i);
			count=count+cal;
		}
		System.out.println(count);
	}
}
