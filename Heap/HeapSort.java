package Heap;

import java.util.Scanner;
public class HeapSort {
	
	public static void Heapify(Integer arr[],int size,int pos)
	{
		int largest=pos;
		int rc=(pos*2)+2;
		int lc=(pos*2)+1;
		
		if(lc<size && arr[lc]>arr[largest])
		{
			largest=lc;
		}
		if(rc<size && arr[rc]>arr[largest])
		{
			largest=rc;
		}
		
		if(largest!=pos)
		{
			swap(largest,pos,arr);
			Heapify(arr,size,largest);
		}
	}
	
	public static void swap(Integer a,Integer b,Integer arr[])
	{
		Integer temp;
		temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	
	
	public static void HeapSort1(Integer arr[],int size)
	{
		for(int i=(size/2)-1;i>=0;i--)		//building max heap
		{
			Heapify(arr,size,i);
		}
		
		for(int i=size-1;i>=0;i--)			//fixing the largest element to last
		{
			swap(0,i,arr);
			Heapify(arr,i,0);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number of elements =  ");
		int size=sc.nextInt();
		Integer arr[]=new Integer[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		HeapSort1(arr,size);
		System.out.println("sorted array =  ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+ "  ");
		}
		
	}
	
	

}
