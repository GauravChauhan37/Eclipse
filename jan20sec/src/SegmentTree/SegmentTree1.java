package SegmentTree;

public class SegmentTree1 {
	private class Node {
		int data;
		Node left;
		Node right;
		int ssi;
		int sei;
	}

	private static Node root;
	private int size;
	IRangeOperator operator;

	public SegmentTree1(int[] arr, IRangeOperator operator) {
		this.operator = operator;
		this.root = this.construct(arr, 0, arr.length - 1);
	}

	private Node construct(int[] arr, int ssi, int sei) {
		if (ssi == sei) {
			Node node = new Node();
			this.size++;

			node.ssi = ssi;
			node.sei = sei;
			node.data = arr[ssi];
			return node;
		}

		Node node = new Node();
		this.size++;

		node.ssi = ssi;
		node.sei = sei;

		int mid = (ssi + sei) / 2;
		node.left = construct(arr, ssi, mid);
		node.right = construct(arr, mid + 1, sei);
		node.data = operator.operation(node.left.data, node.right.data);
		return node;
	}

	public void display() {
		display(root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}

		String str = "";

		str = node.left == null ? "." : node.left.data + "";
		str += " <- " + node.data + "[" + node.ssi + " - " + node.sei + "] -> ";
		str += node.right == null ? "." : node.right.data + "";

		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public int query(Node node, int qsi, int qei) {
		// if within
		if (node.ssi >= qsi && node.sei <= qei) {
			return node.data;
		} else if (node.sei < qsi || node.ssi > qei) { // if lie outside the range
			return operator.identity();
		} else {
			int sum1 = query(node.left, qsi, qei);
			int sum2 = query(node.right, qsi, qei);
			return operator.operation(sum1, sum2);
		}
	}

	public void update(Node node, int data, int idx) {
		if (idx == node.ssi && idx == node.sei) {
			node.data = data;
			return;
		}
		if (idx >= node.ssi && idx <= node.sei) {
			update(node.left, data, idx);
			update(node.right, data, idx);
			node.data = operator.operation(node.left.data, node.right.data);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 2, 0, -1, 3, 8, -4, -2, 3 };
		IRangeOperator operator = new minOperator();
		SegmentTree1 s = new SegmentTree1(arr, operator);
		System.out.println(s.query(root, 2, 5));
		s.update(root, -100, 3);
		System.out.println(s.query(root, 2, 5));
		System.out.println(s.query(root, 7, 8));
	}
}
