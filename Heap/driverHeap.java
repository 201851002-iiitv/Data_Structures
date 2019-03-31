package Heap;

import java.util.Scanner;

public class driverHeap {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a;
	Integer q;
	Heap_imp<Integer> ob1=new Heap_imp<Integer>();
	do
	{
		System.out.println("1. insert");
		System.out.println("2. delete");
		System.out.println("3. sort");
		System.out.println("4. print");
		System.out.println("5. exit");
		System.out.println("enter your choice =  ");
		a=sc.nextInt();
		switch(a)
		{
			case 1: System.out.println("enter element =  ");
					q=sc.nextInt();
					ob1.insert(q);
					break;
			
			case 2: q=ob1.delete();
					if(q==null)
					{
						System.out.println("heap empty....");
					}
					else
					{
						System.out.println("element deleted = " + q);
					}
					break;
					
			case 3: ob1.HeapSort();	
					break;
					
			case 4: ob1.print();
					break;		
							
		}
	}while(a!=5);
	}
}
