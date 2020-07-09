package Practise1;
import java.util.*;
public class Leap {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean leap=false;
		if(n%4==0)
		{
		if(n%100==0)
		{
		if(n%400==0)
		leap =true;	
		else
		     leap=false;
		}
		else
		leap=true;
		}
		else
		leap=false;
		
		if(leap)
		{
			System.out.println("Leap");
		}
		else
		{
			System.out.println("not Leap");
		}
	}

}
