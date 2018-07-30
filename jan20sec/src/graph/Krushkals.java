
package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Krushkals {
	public static class Edge implements Comparable<Edge> {
		int v1;
		int v2;
		int wt;

		public Edge(int v1, int v2, int wt) {
			this.v1 = v1;
			this.v2 = v2;
			this.wt = wt;
		}

		@Override
		public int compareTo(Edge o) {
			return this.wt - o.wt;
		}

		public String toString() {
			return this.v1 + "-->" + this.v2 + " @ " + this.wt;
		}

	}

	public static void main(String[] args) {
		int vces = 6;
		ArrayList<Edge> edges = new ArrayList<>();
		edges.add(new Edge(0, 1, 50));
		edges.add(new Edge(1, 2, 100));
		edges.add(new Edge(2, 3, 10));
		edges.add(new Edge(0, 3, 40));
		edges.add(new Edge(3, 4, 2));
		edges.add(new Edge(4, 5, 3));
		edges.add(new Edge(5, 6, 3));
		edges.add(new Edge(4, 6, 8));
		Krushkals(edges, vces);
	}

	private static void Krushkals(ArrayList<Edge> edges, int vces) {
		ArrayList<Edge> graph = new ArrayList<>(); // to store resultant graph
		int[] dset = new int[vces + 1];
		int[] rank = new int[vces + 1];
		PriorityQueue<Edge> queue = new PriorityQueue<>(edges);
		for (int i = 0; i < dset.length; i++) {
			dset[i] = i; // parent itself
			rank[i] = 1; // acc to nodes
		}
		while (queue.size() != 0) {
			// remove from queue
			Edge re = queue.remove();
			// find parents
			int vset1 = find(dset, rank, re.v1);
			int vset2 = find(dset, rank, re.v2);
			// merge if unequal
			if (vset1 != vset2) {
				graph.add(re);
				merge(vset1, vset2, dset, rank);
			}
		}
		for (Edge e : graph) {
			System.out.println(e);
		}
	}

	private static void merge(int vset1, int vset2, int[] dset, int[] rank) {
		if (rank[vset1] < rank[vset2]) {
			dset[vset1] = vset2;
		} else if (rank[vset1] > rank[vset2]) {
			dset[vset2] = vset1;
		} else { // if equal then only rank will be incremented
			dset[vset1] = vset2;
			rank[vset2]++;
		}
	}

	private static int find(int[] dsets, int[] height, int v) {
		if (dsets[v] != v) {
			dsets[v] = find(dsets, height, dsets[v]);
		}
		return dsets[v];
	}
}
