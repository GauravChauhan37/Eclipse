package stacks;

public class queue {
	private int[] data;
	private int front;
	private int size;

	public queue(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public void enqueue(int input) {
		if (this.size == this.data.length) {
			System.out.println("OverFlow");
			return;
		}
		int rear = (this.front + this.size) % this.data.length;
		this.data[rear] = input;
		this.size++;
	}

	public int dequeue() {
		if (size == 0) {
			System.out.println("UnderFlow");
			return -1;
		}
		int rem = this.data[this.front];
		this.front = (1 + this.front) % this.data.length;
		this.size--;
		return rem;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int front() {
		if (size == 0) {
			System.out.println("UnderFlow");
			return -1;
		}
		return this.data[this.front];
	}

	public void display() {
		for (int i = 0; i < this.size; i++) {
			System.out.print(this.data[(i + this.front) % this.data.length] + " ");
		}
	}

	public static void main(String[] args) {
		queue q = new queue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		q.enqueue(60);
		q.enqueue(70);
		q.display();
	}
}
