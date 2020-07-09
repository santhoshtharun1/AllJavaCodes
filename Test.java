package Practise1;
import java.util.*;
public class Test {

	
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the character");
    	Character ch=sc.next().charAt(0);
    	boolean isOvwel=false;
    	switch(ch)
    	{
    	case 'a':
    	case 'e':
    	case 'i':
    	case 'o':
    	case 'u':
    	case 'A':
    	case 'E':
    	case 'I':
    	case 'O':
    	case 'U':
    	isOvwel=true;	
    	}
    	if(isOvwel==true)
    	{
    		System.out.println("Ovwel "+ ch);
    	}
    	else 
    	{
    		if(ch>='a' &&  ch<='z' || ch>='A' && ch<='Z')
    		{
    		System.out.println(ch+" is a consonant");
    		}
    		else
    		{
    			System.out.println("not an alphabet");
    		}
    	}
    }
}