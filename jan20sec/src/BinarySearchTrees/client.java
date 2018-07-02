package BinarySearchTrees;

public class client {

	public static void main(String[] args) {
		int[] arr = { 12, 25, 37, 50, 62, 75, 87 };

		Bst b = new Bst(arr);
//		b.display();
		// b.max();
		// b.min();
		// b.find(37);
		// b.printInRange(10, 50);
		// b.replaceWithSumOfLargerNodes();
		b.display();
		System.out.println();
//		b.addNode(30);
//		b.addNode(110);
		// b.display();
		 b.removeNode(50);
		b.display();
	}
}
