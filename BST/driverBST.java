package BST;

import java.util.Scanner;

public class driverBST {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b;
	Integer q;
	BST_node p; 
	BST ob1=new BST();
	do
	{
		System.out.println("1. insert");
		System.out.println("2. delete");
		//System.out.println("3. sort");
		System.out.println("3. print");
		System.out.println("4. height of an element.");
		System.out.println("5. exit");
		
		System.out.println("enter your choice =  ");
		a=sc.nextInt();
		switch(a)
		{
			case 1: System.out.println("enter element =  ");
					q=sc.nextInt();
					ob1.insert(q);
					break;
			
			case 2: System.out.println("enter element to be deleted =  ");
					q=sc.nextInt();
					b=ob1.delete(q);
					if(b==-1)
					{
						System.out.println("heap empty....");
					}
					else
					{
						System.out.println("element deleted = " + q);
					}
					break;
					
			//case 3: ob1.HeapSort();	
		//			break;
					
			case 3: System.out.println("root = "+ob1.root.val);
					ob1.post(ob1.root);
					break;	
					
			case 4: System.out.println("enter the element =  ");		
					q=sc.nextInt();
					p=ob1.search(q);
					System.out.println(p.val);
					b=ob1.height(p);
					System.out.println("height of "+q+" is = "+b);
					break;
		}
	}while(a!=5);
	}

	

}
