import java.util.Scanner;

public class BinaryTrees {
	// 50 true 25 true 12 false false true 37 false false true 75 true 62 false false true 57 false false
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
				System.out.println("enter the data for right child of " + parent.data);
			}
		}
		Node child = new Node();
		child.data = sc.nextInt();
		this.size++;

		System.out.println("Do this" + child.data + " have a left child");
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			child.left = takeInput(sc, child, true);
		}
		System.out.println("Do this" + child.data + " have a right child");
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			child.right = takeInput(sc, child, false);
		}
		return child;
	}

}
