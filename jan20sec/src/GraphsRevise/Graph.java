package GraphsRevise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import graph.GenericHeap;
import graph.Graph.PPair;

public class Graph {
	HashMap<String, HashMap<String, Integer>> vces = new HashMap<>();

	protected void addEdge(String vname, String v2name, int weight) {
		if (vces.containsKey(vname) == false || vces.containsKey(v2name) == false) {
			return;
		}
		vces.get(vname).put(v2name, weight);
		vces.get(v2name).put(vname, weight);

	}

	protected void addVertex(String vname) {
		if (vces.containsKey(vname)) {
			return;
		}
		vces.put(vname, new HashMap<String, Integer>());
	}

	void display() {
		for (String s : vces.keySet()) {
			System.out.print(s + "-->");
			for (String in : vces.get(s).keySet()) {
				System.out.print(in + "=" + vces.get(s).get(in) + " ");
			}
			System.out.println();
		}

	}

	private class TPair {
		String s;
		String psf;

		public TPair(String s, String psf) {
			this.s = s;
			this.psf = psf;
		}
	}

	void bfs(String src, String dest) {
		LinkedList<TPair> queue = new LinkedList<>();
		queue.add(new TPair(src, src + " "));
		HashSet<String> visited = new HashSet<>();
		visited.add(src);
		while (queue.size() != 0) {
			// remove
			TPair rem = queue.removeFirst();
			// check
			if (rem.s.equals(dest)) {
				System.out.println(rem.psf);
				return;
			}
			visited.add(rem.s);
			// add neighbours
			for (String s : vces.get(rem.s).keySet()) {
				if (visited.contains(s) == false) {
					queue.addLast(new TPair(s, rem.psf + s + " "));
				}
			}
		}
	}

	public class DPair implements Comparable<DPair> {
		String vname;
		String psf;
		int wsf;

		@Override
		public int compareTo(DPair o) {
			return this.wsf - o.wsf;
		}

		DPair(String vname, String psf, int wsf) {
			this.vname = vname;
			this.psf = psf;
			this.wsf = wsf;
		}

		public String toString() {
			return this.vname + " " + this.psf + " " + " " + this.wsf;
		}
	}

	protected void Djkstra(String src, String dest) {
		GenericHeap<DPair> pq = new GenericHeap();
		HashMap<String, DPair> hp = new HashMap<>();
		for (String s : vces.keySet()) {
			DPair d = new DPair(s, null, Integer.MAX_VALUE);
			if (s == src) {
				d.wsf = 0;
				d.psf = src;
				d.vname = src;
			}
			pq.add(d);
			hp.put(s, d);
		}
		while (pq.size() != 0) {
			DPair rp = pq.remove();
			for (String s : vces.get(rp.vname).keySet()) {
				DPair np = hp.get(s);
				int newWeight = rp.wsf + vces.get(rp.vname).get(s);
				String psf = rp.psf + s;
				if (newWeight < np.wsf) {
					np.psf = psf;
					np.wsf = newWeight;
					pq.updateHeap(np);
				}
			}
		}
		System.out.println(hp);
	}

	public class PPair implements Comparable<PPair> {
		int wsf;
		String vname;
		String parent;

		@Override
		public int compareTo(PPair o) {
			return this.wsf - o.wsf;
		}

		public PPair(int wsf, String vname, String parent) {
			this.wsf = wsf;
			this.vname = vname;
			this.parent = parent;
		}
	}

	protected Graph Prims() {
		HashMap<String, PPair> result = new HashMap<>();
		GenericHeap<PPair> queue = new GenericHeap<>();
		Graph mst = new Graph();
		for (String s : vces.keySet()) {
			PPair n = new PPair(Integer.MAX_VALUE, s, null);
			queue.add(n);
			result.put(s, n);
		}
		while (queue.size() != 0) {
			// remove
			PPair rp = queue.remove();
			mst.addVertex(rp.vname);
			if (rp.parent != null) {
				mst.addEdge(rp.vname, rp.parent, rp.wsf);
			}

			for (String nbr : vces.get(rp.vname).keySet()) {
				if (mst.containsVertex(nbr) == false) {
					PPair np = result.get(nbr);
					int newWeight = vces.get(rp.vname).get(nbr);
					String npsf = nbr;
					// update neigh
					if (newWeight < np.wsf) {
						np.wsf = newWeight;
						np.parent = rp.vname;
						queue.updateHeap(np);
					}
				}
			}
		}
		return mst;
	}

	private boolean containsVertex(String vname) {
		if (vces.get(vname) != null) {
			return true;
		} else {
			return false;
		}
	}
}
