package BinaryTrees;

import java.util.LinkedList;

public class client {
	private static class Pair {
		int num;
		String bin = "";
		//
		// Pair() {
		//
		// }
		//
		// Pair(int num, String bin) {
		// this.num = num;
		// this.bin = bin;
		// }
	}

	private static void printBinaries(int max) {
		LinkedList<Pair> queue = new LinkedList<Pair>();
		Pair root = new Pair();
		root.num = 1;
		root.bin = 1 + "";
		queue.addLast(root);
		while (queue.size() != 0) {
			// dequeue
			Pair removed = queue.removeFirst();
			// print
			System.out.print(removed.num + " " + removed.bin);
			System.out.println();
			// enqueue child
			Pair leftChild = new Pair();
			leftChild.num = 2 * removed.num;
			leftChild.bin = removed.bin + 0;
			if (leftChild.num < max) {
				queue.addLast(leftChild);
			}
			Pair rightChild = new Pair();
			rightChild.num = (2 * removed.num) + 1;
			rightChild.bin = removed.bin + 1;
			if (rightChild.num < max) {
				queue.addLast(rightChild);
			}
		}
	}

	public static void main(String[] args) {
		 BinaryTrees bt = new BinaryTrees();
//		 bt.diameter();
//		 bt.isBalanced();
//		 bt.bst();
//		 bt.largestbst();
		// bt.display();
		// bt.size2();
		// bt.find(12);
		// bt.max();
		// bt.height();
		// bt.removeLeaves();
		// bt.display();
		// bt.printSingleChild();
		// bt.path(62);
		// bt.sumLiesBtwHighAndLow(2, 1000);
		// bt.printKFarAwayFromData(14, 1);
		// bt.preOrder();
		// System.out.println();
		// bt.inOrder();
		// System.out.println();
		// bt.postOrder();
		// int[] preOrder = { 50, 25, 12, 37, 75, 62, 57 };
		// int[] inOrder = { 12, 25, 37, 50, 62, 75, 57 };
		// int[] postOrder = { 12, 37, 25, 62, 57, 75, 50 };
		// BinaryTrees b = new BinaryTrees(inOrder, postOrder);
		// b.display();
		// bt.display();
		// bt.levelOrder();
//		printBinaries(10);
		 bt.preOrderItr();
		 System.out.println();
		 bt.inOrderItr();
		 System.out.println();
		 bt.postOrderItr();
	}
}
