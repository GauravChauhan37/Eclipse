package SegmentTree;

public class SegmentTree {
	private class Node {
		int data;
		Node left;
		Node right;
		int ssi;
		int sei;
	}

	private Node root;
	private int size;
	IRangeOperator rop;

	public SegmentTree(int[] arr, IRangeOperator rop) {
		this.rop = rop;
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
		node.data = rop.operation(node.left.data, node.right.data);

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

	public void update(int idx, int nv) {
		update(root, idx, nv);
	}

	private void update(Node node, int idx, int nv) {
		if (idx >= node.ssi && idx <= node.sei) {
			if (node.ssi == node.sei) {
				node.data = nv;
			} else {
				update(node.left, idx, nv);
				update(node.right, idx, nv);
				node.data = rop.operation(node.left.data, node.right.data);
			}
		}
	}

	public int query(int qsi, int qei) {
		return query(root, qsi, qei);
	}

	private int query(Node node, int qsi, int qei) {
		// within
		if (node.ssi >= qsi && node.sei <= qei) {
			return node.data;
		} else if (node.ssi > qei || node.sei < qsi) {
			return rop.identity();
		} else {
			int leftC = query(node.left, qsi, qei);
			int rightC = query(node.right, qsi, qei);
			return rop.operation(leftC, rightC);
		}
	}

}
