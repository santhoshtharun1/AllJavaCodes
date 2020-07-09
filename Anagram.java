package Practise1;

import java.util.*;

public class Anagram {
	public static void Anagram(String s1,String s2)
	{
		String str1=s1.replaceAll("//s"," ");
		String str2=s2.replaceAll("//s"," ");
		boolean cond=true;
		if(str1.length()!=str2.length())
			cond=false;
		else
		{
			char[]  Array1=str1.toLowerCase().toCharArray();
			char[] Array2 =str2.toLowerCase().toCharArray();
			Arrays.sort(Array1);
			Arrays.sort(Array2);
			cond=Arrays.equals(Array1, Array2);
		}
		if(cond)
		{
			System.out.println(s1 + " and " +  s2 +" are anagrams");
			
		}
		else
		{
			System.out.println("not anagram");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		
		String s1=sc.nextLine();
		System.out.println("Enter string2");
		String s2=sc.nextLine();
		Anagram(s1,s2);
	}

}
