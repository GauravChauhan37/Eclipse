package BinarySearchTrees;

public class Bst {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	Node root;
	int size;

	public Bst(int[] sa) {
		this.root = construct(sa, 0, sa.length - 1);
	}

	public void display() {
		display(this.root);
	}

	private void display(Node node) {
		if (node == null) {
			return;
		}
		String s = node.left == null ? ". " : " " + node.left.data;
		s += "-->" + node.data + "<--";
		s += node.right == null ? ". " : " " + node.right.data;
		System.out.println(s);
		display(node.left);
		display(node.right);
	}

	private Node construct(int[] sa, int lo, int hi) {
		if (lo > hi) {
			return null;
		}
		int mid = (lo + hi) / 2;
		Node child = new Node();
		child.data = sa[mid];
		this.size++;
		child.left = construct(sa, lo, mid - 1);
		child.right = construct(sa, mid + 1, hi);
		return child;
	}

	public void max() {
		System.out.println(max(this.root));
	}

	private int max(Node node) {
		if (node.right == null) {
			return node.data;
		}
		int max = max(node.right);
		return max;
	}

	public void min() {
		System.out.println(min(this.root));
	}

	private int min(Node node) {
		if (node.left == null) {
			return node.data;
		}
		int min = min(node.left);
		return min;
	}

	public void find(int data) {
		System.out.println(find(this.root, data));
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		boolean ans;
		if (data == node.data) {
			return true;
		} else if (data < node.data) {
			ans = find(node.left, data);
			if (ans == true) {
				return true;
			}
		} else {
			ans = find(node.right, data);
			if (ans == true) {
				return true;
			}
		}
		return ans;
	}

	public void printInRange(int lo, int hi) {
		printInRange(lo, hi, this.root);
	}

	private void printInRange(int lo, int hi, Node node) {
		if (node == null) {
			return;
		}
		if (node.data >= lo && node.data <= hi) {
			printInRange(lo, hi, node.left);
			System.out.print(node.data + " ");
			printInRange(lo, hi, node.right);
		} else if (node.data < lo) {
			printInRange(lo, hi, node.right);
		} else if (node.data > hi) {
			printInRange(lo, hi, node.left);
		}
	}

	static class HeapMover {
		int sum;
	}

	public void replaceWithSumOfLargerNodes() {
		HeapMover mover = new HeapMover();
		mover.sum = 0;
		replaceWithSumOfLargerNodes(this.root, mover);
	}

	private void replaceWithSumOfLargerNodes(Node node, HeapMover mover) {
		if (node == null) {
			return;
		}
		replaceWithSumOfLargerNodes(node.right, mover);
		int temp = node.data;
		node.data = mover.sum;
		mover.sum += temp;
		replaceWithSumOfLargerNodes(node.left, mover);
	}

	public void addNode(int data) {
		addNode(this.root, data);
	}

	private void addNode(Node node, int data) {
		if (data < node.data && node.left != null) {
			addNode(node.left, data);
		} else if (data > node.data && node.right != null) {
			addNode(node.right, data);
		} else {
			if (node.data > data) {
				Node n = new Node();
				n.data = data;
				node.left = n;
			} else { // fyi---> if data is equal , it will be added here
				Node n = new Node();
				n.data = data;
				node.right = n;
			}
			this.size++;
		}
	}

	public void removeNode(int data) {
		this.root = removeNode(this.root, data);
	}

	private Node removeNode(Node node, int data) {
		if (data < node.data) {
			node.left = removeNode(node.left, data);
			return node;
		} else if (data > node.data) {
			node.right = removeNode(node.right, data);
			return node;
		} else {
			if (node.left == null && node.right == null) {// zero child
				return null;
			} else if (node.left != null && node.right != null) { // two child
				int min = min(node.right);
				Node n = new Node();
				n.data = min;
				n.left = node.left;
				n.right = node.right;
				removeNode(min);
				return n;
			} else { // one child
				if (node.left != null) {
					return node.left;
				} else {
					return node.right;
				}
			}
		}
	}
}
