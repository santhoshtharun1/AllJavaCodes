package Practise1;

public class TwoDArray1 {
	int[][] arr =null;
	
	public TwoDArray1(int row,int col)
	{
		arr=new int[row][col];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=0;
			}
		}
	}
	
	public void Traverse()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		}
	}
	public void insert(int row,int col,int value)
	{
		if(arr[row][col]==0)
		{
			arr[row][col]=value;
		}
		else
		{
			System.out.println("value already occupied");
		}
	}
	public void Access(int row,int col)
	{
		System.out.println(arr[row][col]);
	}
	public void search(int value)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==value)
				{
					System.out.println("Value found");
					System.out.println("value is searched : " +value+ " at location : "+i+" row and "+ j +" col ");
		
				}
			}
		}
	}
	public void deleteEntire()
	{
		try
		{
			arr=null;
		}
		catch(Exception e)
		{
			System.out.println("Null pointer");
		}
		
	}
	public void delete(int row,int col)
	{
		arr[row][col]=0;
	}
	
	public static void main(String[] args)
	{
		TwoDArray1 t=new TwoDArray1(2,2);
		System.out.println(" creating an array of 2*2");
		System.out.println("Visiting all cells");
		t.Traverse();
		t.insert(0, 0, 10);
		t.insert(0, 1, 20);
		t.insert(1, 0, 30);
		t.insert(1, 1, 40);
		System.out.println();
		t.Traverse();
		System.out.println();System.out.println();
		System.out.println("Accesing the value");
		t.Access(1, 0);
		System.out.println();
		t.search(30);
		System.out.println();
		System.out.println("Delet value ");
		t.delete(1, 0);
		t.Traverse();
	}
}
