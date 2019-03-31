package queue;

public class Queue_LL <D> implements Queue<D>{
	ListObject head,tail;
	int size=0;
	D j;
	Queue_LL()
	{
		tail=head=null;
		size=0;
	}
	
	public void enqueue(D v)
	{
		ListObject<D> ob=new ListObject<D>(v);
 
		 if(tail==null)
	       { head=tail=ob;
	       }
		 else
   		{	tail.next=ob;
     		tail=ob;
   		}
 		size++;
	}
	
	public D dequeue()
	{
		ListObject a;
		D w;
		if(size==0)
		{
			return null;
		}
		w=(D) head.val;
		head=head.next;
		size--;
		return w;
		
	}
	
	public void traverse()
	{
		ListObject a;
		a=head;
		while(a!=null)
		{
			System.out.print(a.val + "  ");
			a=a.next;
		}
	}
	
	public Integer size()
	{ return size;
	}


}
