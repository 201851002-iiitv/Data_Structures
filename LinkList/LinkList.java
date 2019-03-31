

class LinkList<D> implements List<D>
{
	ListObject head,tail;
	int size=0;
	D j;
	LinkList()
	{
		tail=head=null;
		size=0;
	}

	public void add(D v)
	{ListObject<D> ob=new ListObject<D>(v);
	 
	 if(tail==null)
           { head=tail=ob;
           }
	 else
	   {tail.next=ob;
	     tail=ob;
       }
	 size++;
	}

	public void traverse()
	{ListObject ob;
	 ob=head;
	 while(ob!=null)
	   {System.out.print(ob.val+"  ");
	    ob=ob.next;
	   }
	 System.out.println();
	 System.out.println();
	}
	
	public int size()
	{
		return size;
	}
	public int remove(D ob)
	{
		ListObject obj;
		int u=0;
		obj=head;
		while(obj.next!=null)
		{
			if(obj.next.val==ob)
			{
				obj.next=obj.next.next;
				u=1;
				break;
			}
			else
			{
				obj=obj.next;
			}
		}
		if(u==0)
		{
			return -1;
		}
		else 
		{
			return 1;
		}
		
	}

	/*public void add(D v,Integer pos)
	{try
           {if(pos<1 || pos>size)
		{BoundException b=new BoundExecption();
                 throw b;
                }
	    catch(BoundException e)
		{e.printerror();}
           }
	} */
	
	public void reverse()
	{
		ListObject curr=head,p=null,prev=null;
		while(curr!=null)
		{
			p=curr.next;
			curr.next=prev;
			prev=curr;
			curr=p;
		}
		head=prev;
	}
	
	public int indexof(D val)
	{
		ListObject obj;
		//j=0;
		int s=-1,y=-1;
		obj=head;
		while(obj.next!=null)
		{
			if(obj.val==val)
			{
				y= s+1;
				break;
				
			}
			else
			{
				s++;
				
				obj=obj.next;
			}
		}
		return y;
	}

}	
