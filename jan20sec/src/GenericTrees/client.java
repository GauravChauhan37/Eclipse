package GenericTrees;

public class client {

	public static void main(String[] args) {
		genericTree g = new genericTree();
		 g.display();
		// g.size2();
		// g.max();
		// g.find(11);
		// g.height();
		// g.display();
		System.out.println(" *********   ");
		// g.mirror();
		// g.display();
		System.out.println("********");
		// g.removeLeaves();
		// g.display();
		// g.preOrder();
		System.out.println("**************************");
		// g.postOrder();
		// g.levelOrder();
		// g.levelOrderLineWise();
//		 g.zigZag();
		 g.linearise();
		 g.display();
		// g.lineariseEff();
		// g.display();
		// g.multiSolver(Integer.MIN_VALUE);
//		System.out.println(g.kthSmallest(3));
//		genericTree other = new genericTree();
//		g.isoMorphic(other);
//		g.isMirror(other);
//		g.isSymmetric();
		
	}

}
