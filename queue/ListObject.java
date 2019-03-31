package queue;

public class ListObject <D>{
	D val;
	ListObject<D> next;
	ListObject(D v)
	{
		val=v;
		next=null;
	}

}
