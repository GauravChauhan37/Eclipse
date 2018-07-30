package GraphsRevise;

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
		g.addEdge("A", "B", 5);
		g.addEdge("A", "C", 10);
		g.addEdge("A", "D", 200);
		g.addEdge("C", "D", 20);
		g.addEdge("B", "D", 6);
		g.addEdge("E", "B", 15);
		g.addEdge("E", "F", 4);
		g.addEdge("F", "G", 10);
		g.addEdge("E", "G", 5);
		
//		g.display();
//		g.bfs("A", "G");
//		g.Djkstra("A", "G");
		Graph mst = g.Prims();
		mst.display();
	}

}
