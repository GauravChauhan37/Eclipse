package graph;

import hashmap.HashMap;

public class client {

	public static void main(String[] args) {
		Graph g = new Graph();
		g.addVertex("A");
		g.addVertex("B");
		g.addVertex("C");
		g.addVertex("D");
		g.addVertex("E");
		g.addVertex("F");
		g.addVertex("G");
		g.addEdge("A", "B", 10);
		g.addEdge("A", "C", 50);
		g.addEdge("B", "D", 20);
		g.addEdge("C", "E", 30);
		g.addEdge("D", "C", 4);
		g.addEdge("E", "F", 20);
		g.addEdge("E", "G", 10);
//		g.display();
		System.out.println("***********7*****");
		// // System.out.println(g.hasPath("A", "E"));
		// HashSet<String> visited = new HashSet<>();
		// // System.out.println("***************");
		// // g.printAllPath("A", "F", visited, "");
		// // g.printminmaxPath("A", "D", visited);
		// g.justLarger("A", "F", visited, 50);
		// g.kthLargest("A", "D", visited, 2);
		// System.out.println(g.bfs("A", "G"));
		System.out.println("**********");
		// System.out.println(g.dfs("A", "G"));
		// g.bft();
		// System.out.println(g.isConnected("A"));
		System.out.println("**********");
		// g.dft();
		// g.getConnectedComponents();
		// System.out.println(g.isAcyclic());

		// System.out.println(g.isBiPertite("A"));
		// g.djkstra("A");
		Graph mst = g.Prims();
		mst.display();
	}
}
