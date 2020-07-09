package Practise1;

import java.util.*;
public class QuotientRemainder {
public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2=sc.nextInt();
		
		int quot=n1/n2;
		int rem=n1%n2;
		System.out.println(quot);
		System.out.println(rem);
	}
	
}
