package queue;

import java.util.Scanner;

public class driver_LL {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
			int i=0,j;
			Queue_LL<Integer> ob1=new Queue_LL<Integer>();
		do
			{System.out.println();
			System.out.println("Queue_LL");
  			System.out.println("1. enqueue");
				System.out.println("2. dequeue");
				System.out.println("3. traverse");
				System.out.println("4. size of Queue");
				System.out.println("5. exit");
				System.out.println("Enter your choice =  ");
				i=s.nextInt();

switch(i)
{ case 1: Integer u;
			System.out.println();
			System.out.println("enter the element to be inserted =  ");
        u=s.nextInt();
        
        ob1.enqueue(u);
        System.out.println("element inserted successfully. ");
        System.out.println();
        break;

        
case 2:  Integer p;
p=ob1.dequeue();
if(p==null)
{
	System.out.println("underflow");
	
}
else
{
	System.out.println();
	System.out.println(p+"  element deleted successfully...");
	System.out.println();
}
break;
        
case 3: System.out.println();
			Integer r;
			ob1.traverse();
        //System.out.println("peek element =  "+r);
			System.out.println();
			
       
       break;
     
       

case 4: System.out.println(); 
   		System.out.println("size of the Queue = "+ob1.size());
   		System.out.println();
       break;
       

			
}


}while(i!=5);
	}


}
