package June12;

public class stack {
	public int[] data;
	public int top;

	public stack(int cap) {
		this.data = new int[cap];
		this.top = -1;
	}

	public void push(int input) {
		if (this.top == this.data.length - 1) {
			System.out.println("OverFlow");
			return;
		}
		this.top++;
		this.data[top] = input;
	}

	public int pop() {
		if (this.top == -1) {
			System.out.println("UnderFlow");
			return -1;
		}
		int remove = this.data[this.top];
		this.data[top] = 0;
		this.top--;
		return remove;
	}

	public int top() {
		if (this.top == -1) {
			return -1;
		}
		return this.data[this.top];
	}

	public int size() {
		return this.top + 1;
	}

	public void display() {
		for (int i = this.top; i >= 0; i--) {
			System.out.print(this.data[i] + " ");
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return this.top == -1;
	}
}
