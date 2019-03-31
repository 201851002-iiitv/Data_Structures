


import java.util.Scanner;
class driver
{ public static void main(String args[])
  {
   Scanner s=new Scanner(System.in);
   int i=0,j;
   LinkList<Integer> ob1=new LinkList<Integer>();
  do
  {System.out.println();
	  System.out.println("1. add new node");
   System.out.println("2. traverse");
   System.out.println("3. remove");
   System.out.println("4. size of list");
   System.out.println("5. reverse the list");
   System.out.println("6. index of element");
   System.out.println("7. exit");
   System.out.println("Enter your choice =  ");
    i=s.nextInt();
    
  switch(i)
  { case 1: Integer u;
  			System.out.println();
  			System.out.println("enter the element to be inserted =  ");
            u=s.nextInt();
            
            ob1.add(u);
            System.out.println("element inserted successfully. ");
            System.out.println();
            break;

   case 2: System.out.println();
	        System.out.println("displaying list -");
   			System.out.println();
   			
           ob1.traverse();
           break;
         
           
   case 3:  System.out.println();
	   		System.out.println("enter the element to be deleted =  ");
   			u=s.nextInt();
   			j=ob1.remove(u);
   			if(j==-1)
   			{
   				System.out.println("element not found...");
   			}
   			else
   			{
   				System.out.println();
   				System.out.println("element deleted successfully...");
   				System.out.println();
   			}
   			break;
   case 4: System.out.println(); 
	   		System.out.println("size of the list = "+ob1.size);
	   		System.out.println();
           break;
           
   case 5: System.out.println();
   			ob1.reverse();
   			System.out.println("displaying reversed list = ");
   			System.out.println();
   			ob1.traverse();
   			System.out.println();
   			break;
   			
   case 6: int k=0;
	   		System.out.println();
   			System.out.println("enter the element to be found =  ");
   			u=s.nextInt();
   			k=ob1.indexof(u);
   			System.out.println(k);
   			if(k==-1)
   			{
   				System.out.println("element not found..");
   			}
   			else
   			{
   				System.out.println();
   				System.out.println("element found at index =  "+k);
   				System.out.println();
   			}
   			
   			
  }

   
  }while(i!=7);
}
}

