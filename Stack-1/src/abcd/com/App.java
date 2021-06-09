package abcd.com;

public class App {
	public static void main (String[] args)
    {
       
        //MyQueue q = new MyQueue(5);
 
		Queue q = new Queue(5);

		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		System.out.println("The front element is " + q.peek());
		q.dequeue();
		System.out.println("The front element is " + q.peek());

		System.out.println("The queue size is " + q.size());

		q.dequeue();
		q.dequeue();

		if (q.isEmpty()) {
			System.out.println("The queue is empty");
		}
		else {
			System.out.println("The queue is not empty");
		}
	}

}
