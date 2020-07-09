package Practise1;

class OneDimensionalArray {
	int[] arr=null;
	//creation of constructor to pass a value
	public OneDimensionalArray(int size)
	{
		arr=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=0;
		}
	}
	//Traversing
	public void traverseArray()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
	//Insertion
	public void Inserting(int location,int ValueToBeInserted)
	{
		try
		{
			if(arr[location]==0)
			{
				System.out.print(arr[location]=ValueToBeInserted);
				System.out.print(" ");
			}
			else
			{
				System.out.println("Value already Insert");
			}
		}
		catch(Exception e)
		{
			System.out.println("Max Size is Exhausted");
		}
	}
	//searching
	public void searching(int valueToBeSearch)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==valueToBeSearch)
			{
				System.out.print("The value which we are searching: "+valueToBeSearch+" location : "+i);
			}
		}
	}
	//Accessing
	public void Accessing(int cellNumber)
	{
		System.out.println(arr[cellNumber]);
	}
	
	//Deletion
	public void deleteArray(int deletevalue)
	{
		arr[deletevalue]=0;
	}
	
	
	public static void main(String[] args)
	{
		OneDimensionalArray o=new OneDimensionalArray(10);
		System.out.println("creating a size of 10 cells");
		System.out.println();System.out.println();
		System.out.println("Accessing all cells with initial value");
		o.traverseArray();
		System.out.println();System.out.println();
		System.out.println("Inserting of values");
		System.out.println("Values Inserted:");
		o.Inserting(0,10);
		o.Inserting(1,20);
		o.Inserting(2,30);
		o.Inserting(3,40);
		o.Inserting(4,150);
		o.Inserting(5,160);
		o.Inserting(6,170);
		o.Inserting(7,80);
		o.Inserting(8,100);
		o.Inserting(1,10);
		
		System.out.println();System.out.println();
		System.out.println("Searching Operation");
		o.searching(150);
		
		System.out.println();System.out.println();
		System.out.println("Accessing elements in the array is");
		o.Accessing(4);
		System.out.println();System.out.println();
		System.out.println("Deleting the before array");
		o.traverseArray();
		System.out.println(" ");System.out.println(" ");
		System.out.print(" ");
		System.out.println("After deleting an array");
		o.deleteArray(4);
		o.traverseArray();
	}
}


