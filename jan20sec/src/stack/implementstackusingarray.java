package stack;

import java.util.EmptyStackException;

public class implementstackusingarray {

	int[] stack;
	int top;

	public void ArrayStack(int capacity) {
		stack = new int[capacity];
	}

	public void push(int emp) {
		// if overflow
		if (top == stack.length) {
			int[] newArray = new int[stack.length * 2];
			System.arraycopy(stack, 0, newArray, 0, stack.length);
			stack = newArray;
		}
		stack[top++] = emp;
	}

	public int pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		} else {
			int emp = stack[--top];
			stack[top] = 0; // empty the curr pos
			return emp;
		}
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top - 1];
	}

	public int size() {
		return top;
	}

	public void display() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}

	// driver
	public static void main(String[] args) {
		implementstackusingarray st = new implementstackusingarray();
		st.ArrayStack(100);
		st.push(100);
		System.out.println(st.peek());
		st.push(70);
		System.out.println(st.peek());
		st.pop();
		st.push(101);
		st.push(102);
		st.push(103);
		st.push(104);
		st.display();
		System.out.println(st.size());
	}
}
