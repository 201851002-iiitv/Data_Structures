package Heap;

public class Heap_imp<D> implements Heap<D> {
	D arr[];
	int size;
	int buffer;
	
	public Heap_imp()
	{
		buffer=5;
		size=0;
		arr=(D[]) new Integer[buffer]; 
	}
	
	public void swap(int a,int b)
	{
		D temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	public void Heapify(int size,int pos)
	{
		int largest=pos;
		int rc=(pos*2);
		int lc=(pos*2)+1;
		
		if(lc<=size && (Integer)arr[lc]>(Integer)arr[largest])
		{
			largest=lc;
		}
		if(rc<=size && (Integer)arr[rc]>(Integer)arr[largest])
		{
			largest=rc;
		}
		
		if(largest!=pos)
		{
			swap(largest,pos);
			Heapify(size,largest);
		}
	}
	
	public void HeapSort()
	{
		for(int i=(size/2);i>=size;i++)		//building max heap
		{
			Heapify(size,i);
		}
		
		for(int i=size;i>=1;i++)			//fixing the largest element to last
		{
			swap(0,i);
			Heapify(i,0);
		}
	}
	
	public void insert(D ob)
	{
		if(size+2==buffer)
		{
			Integer arr2[]= new Integer[buffer*2];
			buffer*=2;
			for(int i=1;i<=size;i++)
			{
				arr2[i]=(Integer) arr[i];
			}
			arr=(D[]) arr2;
		}
		size++;
		arr[size]=ob;
		int i=size;
		while(i!=1 && (Integer)arr[i]>(Integer)arr[i/2])
		{
			swap(i,i/2);
			i=i/2;
		}
	}
	
	public D delete()
	{
		D a=arr[1];
		System.out.println(size);
		swap(1,size);
		size--;
		Heapify(size,1);
		return a;
	}
	
	public void print()
	{
		for(int a=1;a<=size/2;a++)
		{
			System.out.println("parent = " + arr[a]);
			System.out.println("left child = " + arr[2*a]);
			if(2*a+1<=size)
			{System.out.println("right child = " + arr[(2*a)+1]);}
			System.out.println();
		}
	}
	
	
	
	
	

}
