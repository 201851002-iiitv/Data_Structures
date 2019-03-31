package Lab;

import java.util.Scanner;



public class OrderedList<D> implements List<D> {
	Integer buffer;
	Integer size;
	int pos;
	D arr[];
	
	@SuppressWarnings("unchecked")
	OrderedList()
	{
		buffer=5;
		size=0;
		pos=0;
		arr=(D[]) new Integer[buffer];
	}
	@SuppressWarnings("unchecked")
	public void add(D a)
	{
		if(size==buffer)
		{
			Integer arr2[]=new Integer [buffer*2];
			buffer*=2;
			for(int i=0;i<size;i++)
			{
				arr2[i]=(Integer) arr[i];
			}
			arr=(D[]) arr2;
		}
		
		if(size==0)
		{
			arr[0]=(D) a;
			size++;
		}
		else
		{
			Integer u=0;
			while( u<size && (Integer)arr[u]<(Integer)a)
			{
				u++;
			}
			for(Integer j=size;j>=u+1;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[u]=(D) a;
			size++;
		}
		
		
	}
	public int indexof(D val)
	{
		pos=-1;
		for(int i=0;i<size;i++)
		{
			if(arr[i]==val)
			{
				pos=i;
				break;
			}
		}
		return pos;
	}
	
	
	public Integer search(D obj)
	{
		Integer low,high,mid;
		low=0;
		high=size-1;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(obj==arr[mid])
			{
				return mid;
			}
			else if((Integer)obj>(Integer)arr[mid])
			{
				low=mid+1;
			}
			else if((Integer)obj<(Integer)arr[mid])
			{
				high=mid-1;
			}
		}
		return -1;
	}

	public void traverse()
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public boolean isempty()
	{
		if(size==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public int size()
	{
		return size;
	}
	
	
	public int remove(D i)
	{
		try
		{
			if(size<0)
			{
				BoundException ob=new BoundException();
				throw ob;
			}
		}
			
		catch(BoundException x)
		{
			x.printError();
			return null;
		}	



		pos=-1;
		for(Integer j=0;j<size;j++)
		{
			if(i.equals(arr[j]))
				pos=j;
		}		
		if(pos==-1)
		{
			return pos;
		}
		for(Integer j=pos;j<size;j++)
		{
			arr[j]=arr[j+1];
		}
		size--;
		return 0;
	}

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		   int i=0,j;
		   OrderedList<Integer> ob1=new OrderedList<Integer>();
		  do
		  {System.out.println();
			  System.out.println("1. add new element");
		   System.out.println("2. traverse");
		   System.out.println("3. remove");
		   System.out.println("4. size of array");
		   System.out.println("5. index of element");
		   System.out.println("6. search element");
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
			        System.out.println("displaying elements -");
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
		           
		   
		   			
		   case 5: int k=0;
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
		   			
		   case 6:	System.out.println();
	   				System.out.println("enter the element to be searched =  ");
	   				u=s.nextInt();
	   				j=ob1.search(u);	
	   				if(j==-1)
	   				{
	   					System.out.println("element not found...");
	   				}
	   				else
	   				{
	   					System.out.println("element found at position =  "+j);
	   					System.out.println();
	   				}
	   				break;
		   			
		  }

		   
		  }while(i!=7);	
	}

}
