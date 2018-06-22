package trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

// 10 3 20 3 50 0 60 0  70 0 30 2 80 0 90 0 40 1 100 0
public class genericTree {
	private class Node {
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	private Node root;
	private int size;

	public int size() {
		return this.size;
	}

	public genericTree() {
		Scanner sc = new Scanner(System.in);
		this.root = takeInput(null, 0, sc);
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		display1(root);
	}

	private void display1(Node node) {
		String s;
		s = node.data + "-->";
		for (Node c : node.children) {
			s += c.data + "   ";
		}
		s += ".";
		System.out.println(s);
		for (Node c : node.children) {
			display1(c);
		}
	}

	public void size2() {
		System.out.println(size2(root));
	}

	private int size2(Node node) {
		int size = 0;
		for (Node n : node.children) {
			int nsize = size2(n);
			size += nsize;
		}
		size += 1;
		return size;
	}

	private Node takeInput(Node parent, int ithChild, Scanner sc) {
		if (parent == null) {
			System.out.println("Enter the data for root");
		} else {
			System.out.println("Enter the data for" + ithChild);
		}
		Node child = new Node();
		child.data = sc.nextInt();
		size++;
		System.out.println("Enter the number of children for child");
		int noOfChild = sc.nextInt();
		for (int i = 0; i < noOfChild; i++) {
			Node c = takeInput(child, i, sc);
			child.children.add(c);
		}
		return child;
	}

	public void max() {
		System.out.println(max(root));
	}

	private int max(Node node) {
		int max = Integer.MIN_VALUE;
		for (Node c : node.children) {
			int max2 = max(c);
			max = Math.max(max, max2);
		}
		max = Math.max(max, node.data);
		return max;
	}

	public void find(int key) {
		System.out.println(find(root, key));
	}

	private boolean find(Node node, int key) {
		if (node.data == key) {
			return true;
		}
		Boolean ans = false;
		for (Node c : node.children) {
			ans = find(c, key);
			if (ans == true) {
				return true;
			}
		}
		return ans;
	}

	public void height() {
		System.out.println(height(root));
	}

	private int height(Node node) {
		int h = 0;
		for (Node n : node.children) {
			int h1 = height(n);
			if (h1 > h) {
				h = h1;
			}
		}
		return h + 1;
	}

	public void mirror() {
		mirror(root);
	}

	public void mirror(Node node) {
		for (Node n : node.children) {
			mirror(n);
		}
		Collections.reverse(node.children);
	}

	public void removeLeaves() {
		removeLeaves(root);
	}

	private void removeLeaves(Node node) {
		for (int i = 0; i < node.children.size(); i++) {
			Node child = node.children.get(i);
			if (child.children.size() == 0) {
				node.children.remove(child);
				i--;
			} else {
				removeLeaves(node.children.get(i));
			}
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node node) {
		System.out.println(node.data);
		for (Node child : node.children) {
			preOrder(child);
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node node) {
		for (Node child : node.children) {
			postOrder(child);
		}
		System.out.println(node.data);
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		while (!(queue.isEmpty())) {
			Node rn = queue.removeFirst();
			System.out.print(rn.data + " ");
			for (Node child : rn.children) {
				queue.addLast(child);
			}
		}
	}

	public void levelOrderLineWise() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		Node q = new Node();
		q.data = -1;
		queue.addLast(q);
		while (!(queue.isEmpty())) {
			Node rn = queue.removeFirst();
			if (rn.data == -1 && queue.size() != 0) {
				System.out.println();
				queue.addLast(q);
			} else {
				if (rn.data != -1) {
					System.out.print(rn.data + " ");
					for (int i = 0; i < rn.children.size(); i++) {
						queue.addLast(rn.children.get(i));
					}
				}
			}
		}
	}

	public void zigZag() { // can also be done by a queue and a stack
		Stack<Node> st1 = new Stack();
		Stack<Node> st2 = new Stack();
		st1.add(root);
		boolean flag = false;
		while (st1.size() != 0 || st2.size() != 0) {
			if (flag == false) {
				while (st1.size() != 0) {
					Node rn = st1.pop();
					System.out.print(rn.data);
					for (Node child : rn.children) {
						st2.push(child);
					}
				}
				flag = true;
				System.out.println();
			} else {
				while (st2.size() != 0) {
					Node rn = st2.pop();
					System.out.print(rn.data);
					for (int i = rn.children.size() - 1; i >= 0; i--) {
						st1.push(rn.children.get(i));
					}
				}
				flag = false;
				System.out.println();
			}
		}
	}

	public void linearise() {
		linearise(root);
	}

	private void linearise(Node node) {
		for (Node child : node.children) {
			linearise(child);
		}
		for (int i = node.children.size() - 1; i >= 1; i--) {
			Node im1Node = node.children.get(i - 1);
			Node iNode = node.children.get(i);
			Node tail = getTail(im1Node);
			node.children.remove(i);
			tail.children.add(iNode);
		}
	}

	private Node getTail(Node im1Node) {
		Node temp = im1Node;
		while (temp.children.size() != 0) {
			temp = temp.children.get(0);
		}
		return temp;
	}
	public void lineariseEff() {
		linearizeEff(root);
	}
	private Node linearizeEff(Node node) {
		if (node.children.size() == 0) {
			return node;
		}

		Node lastchild = node.children.get(node.children.size() - 1);
		Node overalltail = linearizeEff(lastchild);

		for (int i = node.children.size() - 1; i >= 1; i--) {
			Node inode = node.children.get(i);
			Node im1node = node.children.get(i - 1);

			Node im1tail = linearizeEff(im1node);
			node.children.remove(i);
			im1tail.children.add(inode);
		}

		return overalltail;
	}
}
