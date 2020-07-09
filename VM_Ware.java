package Practise1;
import java.util.*;

public class VM_Ware {
	public static void  main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String DOB=sc.nextLine();
		String gender=sc.nextLine();
		String dis= EmployeeGenerateID(name,DOB,gender);
		System.out.println(dis);
	}
	static String EmployeeGenerateID(String name,String DOB,String gender)
	{
		String dis="";
		char ind_1,ind_2,ind_3,ind_4,ind_5;
		ind_1=name.charAt(0);
		ind_2=DOB.charAt(0);
		ind_3=DOB.charAt(1);
		ind_4=0;
		ind_5=0;
		if(gender.charAt(0)=='M')
		{
			ind_4=DOB.charAt(3);
			ind_5=DOB.charAt(4);
		}
		else if(gender.charAt(0)=='F')
		{
			String temp=DOB.substring(3,5);
			int a=Integer.parseInt(temp);
			a+=50;
			temp=Integer.toString(a);
			
			ind_4=temp.charAt(0);
			ind_5=temp.charAt(1);
		}
		dis=dis+ind_1+ind_2+ind_3+ind_4+ind_5;
		return dis;
		
	}
	
}

