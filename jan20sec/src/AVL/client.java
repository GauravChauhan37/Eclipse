package AVL;

public class client {

	public static void main(String[] args) {
		int[] arr = { 12, 25, 37, 50, 62, 75, 87 };
		Avl a = new Avl(arr);
		a.display();
		System.out.println("***********Addition***************");
		a.addNode(10);
		a.addNode(5);
		a.display();
		System.out.println("*************Removal*************");
		a.removeNode(5);
		a.removeNode(37);
		a.display();
	}

}
