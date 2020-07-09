package Practise1;

import java.util.*;
public class Binary 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Integer B1=Integer.parseInt(sc.nextLine(),2)+Integer.parseInt(sc.nextLine(),2);		
		String s=Integer.toString(B1,2);
		System.out.println(s);
	}
}

