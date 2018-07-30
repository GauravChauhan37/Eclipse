package GraphsRevise;

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
		int[] parent = new int[vces + 1];
		int[] rank = new int[vces + 1];
		ArrayList<Edge> mst = new ArrayList<>();
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
			rank[i] = 1;
		}
		PriorityQueue<Edge> pq = new PriorityQueue<>(edges);
		while (pq.size() != 0) {
			// remove
			Edge rem = pq.remove();
			// find
			int vset1 = find(parent, rem.v1);
			int vset2 = find(parent, rem.v2);
			// merge if reqd
			if (vset1 != vset2) {
				mst.add(rem);
				merge(vset1, vset2, parent, rank);
			}
		}
		for(Edge e : mst) {
			System.out.println(e);
		}
		
	}

	private static void merge(int vset1, int vset2, int[] parent, int[] rank) {
		if (rank[vset1] < rank[vset2]) {
			parent[vset1] = vset2;
		} else if (rank[vset1] > rank[vset2]) {
			parent[vset2] = vset1;
		} else {
			parent[vset1] = vset2;
			rank[vset2]++;
		}
	}

	private static int find(int[] parent, int v1) {
		if (parent[v1] != v1) {
			parent[v1] = find(parent, parent[v1]);
		}
		return parent[v1];
	}
}