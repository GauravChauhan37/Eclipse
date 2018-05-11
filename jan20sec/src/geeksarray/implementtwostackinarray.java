package geeksarray;

import java.util.Stack;

public class implementtwostackinarray {
	static int[] a = new int[7];
	static int top1 = -1;
	static int top2 = a.length;

	public static void push1(int n) {
		if (top1+1 < top2) {
			top1++;
			a[top1] = n;
		} else {
			System.out.println("overflow1");
		}
	}

	public static void push2(int n) {
		if (top2-1 > top1) {
			top2--;
			a[top2] = n;
		} else {
			System.out.println("overflow2");
		}
	}

	public static int pop1() {
		if (top1 == 0) {
			System.out.println("underflow");
			return -1;
		}
		int n = a[top1];
		top1--;
		return n;
	}

	public static int pop2() {
		if (top2 == a.length - 1) {
			System.out.println("underflow");
			return -1;
		}
		int n = a[top2];
		top2++;
		return n;
	}

	public static void main(String[] args) {
		push1(1);
		push2(2);
		push1(3);
		push2(4);
		push1(5);
		push2(6);
		push1(1);
		push2(3);
		System.out.println(pop1());
		System.out.println(pop2());
	}

}
