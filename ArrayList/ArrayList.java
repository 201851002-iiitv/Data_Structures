package feb21;

import java.util.Scanner;



public class ArrayList<D> implements List<D>{
	Integer buffer;
    Integer size;
    D arr[];
    public void add(D k)
    { 
      arr[size]=k;
      size++;
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
    }
    
    public int indexof(D val)
	{
		int pos=-1;
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
    
    
    public int size()
	{
		return size;
	}
	
	
	public int remove(D i)
	{
		int pos=-1;
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


    public void add(D ob,Integer pos)
    {
    	for(Integer q=size-1;q>=pos;q--)
      { arr[q+1]=arr[q];
      }
      arr[pos]=ob;
      size++;
      if(size==buffer)
      { Object arr2[]=new Object[buffer*2];
        buffer*=2;
        for(Integer q=0;q<size;q++)
        { arr2[q]=arr[q];
        }
        arr=(D[]) arr2;
      }

    }

    public void traverse()
    { for(Integer i=0;i<size;i++)
       { System.out.println(arr[i]);
       }
    }

    ArrayList()
    { buffer=5;
      size=0;
      arr=(D[]) new Integer[buffer];
    }
    public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		   int i=0,j;
		   ArrayList<Integer> ob1=new ArrayList<Integer>();
		  do
		  {System.out.println();
			  System.out.println("1. add new element");
		   System.out.println("2. traverse");
		   System.out.println("3. remove");
		   System.out.println("4. size of array");
		   System.out.println("5. index of element");
		   System.out.println("6. exit");
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
		   			
		   
		  }

		   
		  }while(i!=6);	
	}



}
