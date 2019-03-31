package queue;

public class Queue_AL<D> implements Queue <D>{
	D arr[];
	//Integer size;
	Integer buffer;
	Integer size;
	
	Queue_AL()
	{
		//size=0;
		buffer=5;
		arr=(D[])new Integer[buffer];
		size=0; 
	}
	
	
	public void enqueue(D ob)
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
		
		arr[size]=ob;
		size++;
		
  		
  		
	}
	
	public D dequeue()
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

		D q;
		q=arr[0];
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		
		return q;
	}
	
	public Integer size()
	{
		return size;
	}
	
	public void traverse()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	


}
