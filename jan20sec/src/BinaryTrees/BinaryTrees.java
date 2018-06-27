package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTrees {
	// 50 true 25 true 12 false false true 37 false false true 75 true 62 false
	// false true 57 false false
	// 50 true 25 false true 37 false false true 75 false true 57 false false
	class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;
	private int size;

	public int size() {
		return this.size;
	}

	// public BinaryTrees(int[] preOrder, int[] inOrder) {
	// this.root = construct(preOrder, inOrder, 0, preOrder.length-1, 0,
	// inOrder.length-1);
	// }
	public BinaryTrees(int[] inOrder, int[] postOrder) {
		this.root = construct(inOrder, postOrder, 0, inOrder.length - 1, 0, postOrder.length - 1);
	}

	private Node construct(int[] inOrder, int[] postOrder, int isi, int iei, int psi, int pei) {
		if (psi > pei || isi > iei) {
			return null;
		}
		Node child = new Node();
		child.data = postOrder[pei];
		this.size++;
		int sidx = -1;
		for (int i = psi; i <= pei; i++) {
			if (child.data == postOrder[i]) {
				sidx = i;
				break;
			}
		}
		int rhs = pei - sidx;
		child.right = construct(inOrder, postOrder, pei - rhs, pei - 1, sidx + 1, iei);
		child.left = construct(inOrder, postOrder, psi, pei - rhs - 1, isi, sidx - 1);

		return child;
	}

	// private Node construct(int[] preOrder, int[] inOrder, int psi, int pei,
	// int isi, int iei) {
	// if (psi > pei || isi > iei) {
	// return null;
	// }
	// Node child = new Node();
	// child.data = preOrder[psi];
	// this.size++;
	// int i;
	// for (i = isi; i <= iei; i++) {
	// if (inOrder[i] == child.data) {
	// break;
	// }
	// }
	// child.left = construct(preOrder, inOrder, psi + 1, psi + i - isi, isi, i
	// - 1);
	// child.right = construct(preOrder, inOrder, psi + i - isi + 1, pei, i + 1,
	// iei);
	//
	// return child;
	// }

	public boolean isEmpty() {
		return this.size == 0;
	}

	public BinaryTrees() {
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(sc, null, false);
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

	public Node takeInput(Scanner sc, Node parent, boolean ilc) {
		if (parent == null) {
			System.out.println("Enter the data for Parent");
		} else {
			if (ilc == true) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}
		Node child = new Node();
		child.data = sc.nextInt();
		this.size++;

		System.out.println("Do this " + child.data + " have a left child");
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			child.left = takeInput(sc, child, true);
		}
		System.out.println("Do this " + child.data + " have a right child");
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			child.right = takeInput(sc, child, false);
		}
		return child;
	}

	public void size2() {
		System.out.println(size2(root));
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int count = 1;
		count += size2(node.left);
		count += size2(node.right);
		return count;
	}

	public void find(int data) {
		System.out.println(find(root, data));
	}

	private boolean find(Node node, int data) {
		if (node == null) {
			return false;
		}
		boolean ans = false;
		if (node.data == data) {
			return true;
		} else {
			ans = find(node.left, data);
			if (ans == true) { // important to return here cz we donot want to
								// explore more paths after we find our data
				return true;
			}
			ans = find(node.right, data);
			if (ans == true) {
				return true;
			}
		}
		return ans;
	}

	public void max() {
		System.out.println(max(root));
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int max = Integer.MIN_VALUE;
		if (max < node.data) {
			max = node.data;
		}

		int max2 = max(node.left);
		if (max2 > max) {
			max = max2;
		}
		int max3 = max(node.right);
		if (max3 > max) {
			max = max3;
		}
		return max;
	}

	public void height() {
		System.out.println(height(this.root, 0));
	}

	private int height(Node node, int depth) {
		if (node == null) {
			return -1; // if calculations are based on edges
			// return = 0; // if calculations are based on nodes
		}
		int h = 0;
		int h1 = height(node.left, depth);
		if (h1 > h) {
			h = h1;
		}
		int h2 = height(node.right, depth);
		if (h2 > h) {
			h = h2;
		}
		return h + 1;
	}

	public void removeLeaves() {
		removesLeaves(this.root);
	}

	private boolean removesLeaves(Node node) {
		if (node.left == null && node.right == null) {
			return true;
		}
		boolean remove = removesLeaves(node.left);
		boolean remove2 = removesLeaves(node.right);
		if (remove == true && remove2 == true) {
			node.left = null;
			node.right = null;
		}
		return false;
	}

	public void printSingleChild() {
		printSingleChild(this.root);
	}

	private boolean printSingleChild(Node node) {
		if (node == null) {
			return true;
		}
		boolean left = printSingleChild(node.left);
		boolean right = printSingleChild(node.right);
		if (left == true && right == false) {
			System.out.println(node.right.data);

		} else if (left == false && right == true) {
			System.out.println(node.left.data);
		}
		return false;
	}

	public void path(int data) {
		ArrayList<Integer> al = path(this.root, data);
		System.out.println(al);
	}

	private ArrayList<Integer> path(Node node, int data) {
		if (node == null) {
			ArrayList<Integer> b = new ArrayList<>();
			return b;
		}
		ArrayList<Integer> al = new ArrayList<Integer>();
		if (node.data == data) {
			al.add(node.data);
			return al;
		}
		ArrayList<Integer> al1 = path(node.left, data);
		ArrayList<Integer> al2 = path(node.right, data);
		if (al1.size() != 0) {
			al1.add(node.data);
			return al1;
		}
		if (al2.size() != 0) {
			al2.add(node.data);
			return al2;
		}
		return al;
	}

	public void sumLiesBtwHighAndLow(int low, int high) {
		sumLiesBtwHighAndLow(low, high, this.root, 0, " ");
	}

	private void sumLiesBtwHighAndLow(int low, int high, Node node, int ssf, String psf) {
		if (node.left == null && node.right == null) {
			psf += node.data;
			ssf += node.data;
			if (ssf > low && ssf < high) {
				System.out.println(psf);
			}
			return;
		}
		sumLiesBtwHighAndLow(low, high, node.left, ssf + node.data, psf + node.data);
		sumLiesBtwHighAndLow(low, high, node.right, ssf + node.data, psf + node.data);
	}

	public void printKFarAwayFromData(int data, int k) {
		ArrayList<Node> al = pathFromDataToRoot(this.root, data, k);
		for (int i = 0; i <= k; i++) {
			if (i == 0) {
				printKDown(this.root, k - i);
			} else if (i < k) {
				Node prev = al.get(i - 1);
				Node curr = al.get(i);
				if (prev == curr.left) {
					printKDown(curr.right, k - i - 1);
				} else {
					printKDown(curr.left, k - i - 1);
				}
			} else {
				System.out.println(al.get(k));
			}
		}
	}

	private void printKDown(Node node, int k) {
		if (node == null || k < 0) {
			return;
		}
		if (k == 0) {
			System.out.println(node.data);
			return;
		}
		printKDown(node.left, k - 1);
		printKDown(node.right, k - 1);
	}

	private ArrayList<Node> pathFromDataToRoot(Node node, int data, int k) {
		if (node == null || k < 0) {
			return new ArrayList<>();
		}

		if (k == 0) {
			System.out.println(node.data);
			return new ArrayList<Node>();
		}
		ArrayList<Node> al = new ArrayList<Node>();
		if (node.data == data) {
			al.add(node);
			return al;
		} else {
			ArrayList<Node> al1 = pathFromDataToRoot(node.left, data, k);
			ArrayList<Node> al2 = pathFromDataToRoot(node.right, data, k);
			if (al1.size() != 0) {
				al1.add(node);
				return al1;
			}
			if (al2.size() != 0) {
				al2.add(node);
				return al2;
			}
		}
		return al;
	}

	public void preOrder() {
		preOrder(this.root);
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		preOrder(node.left);
		preOrder(node.right);
	}

	public void postOrder() {
		postOrder(this.root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void inOrder() {
		inOrder(this.root);
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
	}

	public void levelOrder() {
		levelOrder(this.root);
	}

	private void levelOrder(Node node) {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(node);
		while (queue.size() != 0) {
			// dequeue
			Node removed = queue.removeFirst();

			// print
			System.out.print(removed.data + " ");

			// enqueue
			if (removed.left != null) {
				queue.addLast(removed.left);
			}
			if (removed.right != null) {
				queue.addLast(removed.right);
			}
		}
	}

	private static class DiaPair {
		int ht;
		int dt;
	}

	public void diameter() {
		DiaPair h = diameter(this.root);
		System.out.println(h.dt);
	}

	private DiaPair diameter(Node node) {
		if (node == null) {
			DiaPair mp = new DiaPair();
			mp.ht = -1; // cz here calculation of height is based on edges
			mp.dt = 0;
			return mp;
		}
		DiaPair left = diameter(node.left);
		DiaPair right = diameter(node.right);
		DiaPair mp = new DiaPair();
		mp.ht = Math.max(left.ht, right.ht) + 1;
		mp.dt = Math.max(left.ht + right.ht + 2, Math.max(left.dt, right.dt));
		// left.ht + right.ht + 2 --> distance btw left and right node
		// left.dt --> max dist in left subtree
		// right.dt --> max dist btw right subtree
		return mp;
	}

	static class Pair {
		int ht;
		boolean flag;
	}

	public void isBalanced() {
		Pair n = isBalanced(this.root);
		System.out.println(n.flag);
	}

	private Pair isBalanced(Node node) {
		if (node == null) {
			Pair mp = new Pair();
			mp.ht = 0;
			mp.flag = true;
			return mp;
		}
		Pair left = isBalanced(node.left);
		Pair right = isBalanced(node.right);
		Pair mp = new Pair();
		mp.ht = Math.max(left.ht, right.ht) + 1;
		if ((Math.abs(left.ht - right.ht) <= 1) && left.flag == true && right.flag == true) {
			mp.flag = true;
		} else {
			mp.flag = false;
		}
		return mp;
	}

	static class bstPair {
		boolean flag;
		int maX;
		int miN;
	}

	public void bst() {
		bstPair h = bst(this.root);
		System.out.println(h.flag);
	}

	private bstPair bst(Node node) {
		if (node == null) {
			bstPair mp = new bstPair();
			mp.maX = Integer.MIN_VALUE;
			mp.flag = true;
			mp.miN = Integer.MAX_VALUE;
			return mp;
		}
		bstPair left = bst(node.left);
		bstPair right = bst(node.right);
		bstPair mp = new bstPair();
		mp.maX = Math.max(left.maX, Math.max(right.maX, node.data));
		mp.miN = Math.min(node.data, Math.min(left.miN, right.miN));

		if (node.data > left.maX && node.data < right.miN && left.flag == true && right.flag == true) {
			mp.flag = true;
		} else {
			mp.flag = false;
		}
		return mp;
	}

	static class lPair {
		boolean flag;
		int maX;
		int miN;
		int size;
		Node node;
	}

	public void largestbst() {
		lPair ans = largestbst(this.root);
		System.out.println(ans.node.data);
		System.out.println(ans.size);
	}

	private lPair largestbst(Node node) {
		if (node == null) {
			lPair mp = new lPair();
			mp.maX = Integer.MIN_VALUE;
			mp.flag = true;
			mp.miN = Integer.MAX_VALUE;
			mp.size = 0;
			mp.node = null;
			return mp;
		}
		lPair left = largestbst(node.left);
		lPair right = largestbst(node.right);
		lPair mp = new lPair();
		mp.maX = Math.max(left.maX, Math.max(right.maX, node.data));
		mp.miN = Math.min(node.data, Math.min(left.miN, right.miN));

		if (node.data > left.maX && node.data < right.miN && left.flag == true && right.flag == true) {
			mp.flag = true;
			mp.node = node;
			mp.size = left.size + right.size + 1;
		} else {
			mp.flag = false;
			if (left.size > right.size) {
				mp.size = left.size;
				mp.node = left.node;
			} else {
				mp.size = right.size;
				mp.node = right.node;
			}
		}
		return mp;
	}

	static class IPair {
		Node node;
		boolean isleftPushed;
		boolean isrightPushed;
		boolean isPrinted;

		IPair(Node node, boolean isleftPushed, boolean isrightPushed, boolean isPrinted) {
			this.node = node;
			this.isleftPushed = isleftPushed;
			this.isrightPushed = isrightPushed;
			this.isPrinted = isPrinted;
		}
	}

	public void preOrderItr() {
		preOrderItr(this.root);
	}

	private void preOrderItr(Node node) {
		LinkedList<IPair> stack = new LinkedList<IPair>();
		IPair i = new IPair(node, false, false, false);
		stack.addFirst(i);
		while (stack.size() != 0) {
			IPair top = stack.peek();
			if (top.isPrinted == false) {
				top.isPrinted = true;
				System.out.print(top.node.data + " ");
			} else if (top.isleftPushed == false) {
				top.isleftPushed = true;
				if (top.node.left != null) {
					IPair left = new IPair(top.node.left, false, false, false);
					stack.addFirst(left);
				}
			} else if (top.isrightPushed == false) {
				top.isrightPushed = true;
				if (top.node.right != null) {
					IPair right = new IPair(top.node.right, false, false, false);
					stack.addFirst(right);
				}
			} else {
				stack.removeFirst();
			}
		}
	}

	public void inOrderItr() {
		inOrderItr(this.root);
	}

	private void inOrderItr(Node node) {
		LinkedList<IPair> stack = new LinkedList<IPair>();
		IPair i = new IPair(node, false, false, false);
		stack.addFirst(i);
		while (stack.size() != 0) {
			IPair top = stack.peek();
			if (top.isleftPushed == false) {
				top.isleftPushed = true;
				if (top.node.left != null) {
					IPair left = new IPair(top.node.left, false, false, false);
					stack.addFirst(left);
				}
			} else if (top.isPrinted == false) {
				top.isPrinted = true;
				System.out.print(top.node.data + " ");
			} else if (top.isrightPushed == false) {
				top.isrightPushed = true;
				if (top.node.right != null) {
					IPair right = new IPair(top.node.right, false, false, false);
					stack.addFirst(right);
				}
			} else {
				stack.removeFirst();
			}
		}
	}

	public void postOrderItr() {
		postOrderItr(this.root);
	}

	private void postOrderItr(Node node) {
		LinkedList<IPair> stack = new LinkedList<IPair>();
		IPair i = new IPair(node, false, false, false);
		stack.addFirst(i);
		while (stack.size() != 0) {
			IPair top = stack.peek();
			if (top.isleftPushed == false) {
				top.isleftPushed = true;
				if (top.node.left != null) {
					IPair left = new IPair(top.node.left, false, false, false);
					stack.addFirst(left);
				}
			} else if (top.isrightPushed == false) {
				top.isrightPushed = true;
				if (top.node.right != null) {
					IPair right = new IPair(top.node.right, false, false, false);
					stack.addFirst(right);
				}
			} else if (top.isPrinted == false) {
				top.isPrinted = true;
				System.out.print(top.node.data + " ");
			} else {
				stack.removeFirst();
			}
		}
	}
}