package June12;

public class clientQueue {

	public static void main(String[] args) {
		dynamicQueue q = new dynamicQueue(5);
		q.enqueue(10);
		q.display();
		q.enqueue(20);
		q.display();
		q.enqueue(30);
		q.display();
		q.enqueue(40);
		q.display();
		q.enqueue(50);
		q.display();
		q.dequeue();
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(60);
		q.display();
		q.enqueue(70);
		q.display();
		q.enqueue(80);
		q.display();
	}
}
