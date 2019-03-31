package queue;

import java.util.Scanner;

public class driver_AL {
	public static void main(String args[])
	{
			Scanner s=new Scanner(System.in);
			int i=0,j;
			Queue_AL<Integer> ob1=new Queue_AL<Integer>();
			do
			{	System.out.println();
  				System.out.println("1. enqueue");
				System.out.println("2. dequeue");
				System.out.println("3. size");
				//System.out.println("4. size of stack");
				System.out.println("4. traverse");
				System.out.println("5. exit");
				System.out.println("Enter your choice =  ");
				i=s.nextInt();

				switch(i)
				{ case 1: 	Integer u;
							System.out.println();
							System.out.println("enter the element to be inserted =  ");
							u=s.nextInt();
        
							ob1.enqueue(u);
							System.out.println("element inserted successfully. ");
							System.out.println();
							break;
     
       
				case 2:  	Integer p;
							p=ob1.dequeue();
							if(p==null)
							{
								System.out.println("underflow...");
							}
							else
							{
							System.out.println();
							System.out.println(p+"  element deleted successfully...");
							System.out.println();
							}
			
							break;
				case 3:		 System.out.println(); 
							System.out.println("size of the queue = "+ob1.size());
							System.out.println();
							break;
       
				case 4:    ob1.traverse();
							break;

			
				}


			}while(i!=5);
	}


}
