package queue;

public interface Queue<D> {
	
		public void enqueue(D ob);
		public D dequeue();
		public Integer size();
		public void traverse();


}
