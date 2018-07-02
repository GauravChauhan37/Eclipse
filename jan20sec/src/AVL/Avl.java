package AVL;

public class Avl {
	private class Node {
		int data;
		Node left;
		Node right;
		int ht;
		int bf;
	}

	Node root;
	int size;

	public Avl(int[] sa) {
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
		s += "-->" + "[ " + node.data + " " + node.ht + " " + node.bf + " ]" + "<--";
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
		child.ht = height(child);
		child.bf = getBalancedFactor(child);
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

	public void addNode(int data) {
		this.root = addNode(this.root, data);
	}

	private Node addNode(Node node, int data) {
		if (node == null) {
			Node nn = new Node();
			nn.data = data;
			return nn;
		}
		if (node.data > data) {
			node.left = addNode(node.left, data);
		} else if (node.data < data) {
			node.right = addNode(node.right, data);
		}
		node.ht = height(node);
		node.bf = getBalancedFactor(node);

		if (node.bf > 1) {
			if (node.left.bf > 0) {
				// ll
				node = rightRotate(node);
			} else {
				// lr
				node.left = leftRotate(node.left);
				node = rightRotate(node);
			}
		} else if (node.bf < -1) {
			if (node.right.bf < 0) {
				// rr
				node = leftRotate(node);
			} else {
				// rl
				node.right = rightRotate(node.right);
				node = leftRotate(node);
			}
		}
		return node;
	}

	private Node leftRotate(Node node) {
		Node z = node;
		Node y = node.right;
		Node child = y.left;
		y.left = z;
		z.right = child;
		z.ht = height(z);
		z.bf = getBalancedFactor(z);
		y.ht = height(y);
		y.bf = getBalancedFactor(y);
		return y;
	}

	private Node rightRotate(Node node) {
		Node z = node;
		Node y = node.left;
		Node child = y.right;
		y.right = z;
		z.left = child;
		z.ht = height(z);
		z.bf = getBalancedFactor(z);
		y.ht = height(y);
		y.bf = getBalancedFactor(y);
		return y;
	}

	public void removeNode(int data) {
		this.root = removeNode(this.root, data);
	}

	private Node removeNode(Node node, int data) {
		if (data < node.data) {
			node.left = removeNode(node.left, data);
		} else if (data > node.data) {
			node.right = removeNode(node.right, data);
		} else {
			if (node.left == null && node.right == null) {// zero child
				return null;
			} else if (node.left != null && node.right != null) { // two child
				int rmin = min(node.right);
				node.data = rmin;
				node.right = removeNode(node.right, rmin);
			} else { // one child
				if (node.left != null) {
					node = node.left;
				} else {
					node = node.right;
				}
			}
		}
		node.ht = height(node);
		node.bf = getBalancedFactor(node);

		if (node.bf > 1) {
			if (node.left.bf > 0) {
				// ll
				node = rightRotate(node);
			} else {
				// lr
				node.left = leftRotate(node.left);
				node = rightRotate(node);
			}
		} else if (node.bf < -1) {
			if (node.right.bf < 0) {
				// rr
				node = leftRotate(node);
			} else {
				// rl
				node.right = rightRotate(node.right);
				node = leftRotate(node);
			}
		}
		return node;
	}

	public int height(Node node) {
		if (node == null) {
			return -1;
		}

		int lh = -1;
		int rh = -1;

		if (node.left != null) {
			lh = node.left.ht;
		}

		if (node.right != null) {
			rh = node.right.ht;
		}
		return Math.max(lh, rh) + 1;
	}

	public int getBalancedFactor(Node node) {
		return height(node.left) - height(node.right);
	}
}
