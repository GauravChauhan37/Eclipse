package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Graph {
	HashMap<String, HashMap<String, Integer>> vces = new HashMap<>();

	public boolean containsVertex(String vname) {
		return vces.containsKey(vname);
	}

	public boolean containsEdge(String v1name, String v2name) {
		if (containsVertex(v1name) == false || containsVertex(v2name) == false) {
			return false;
		}
		if (vces.get(v1name).containsKey(v2name) == true && vces.get(v2name).containsKey(v1name) == true) {
			return true;
		} else {
			return false;
		}
	}

	public int countVertices() {
		return vces.size();
	}

	public void addVertex(String vname) {
		if (vces.containsKey(vname) == true) {
			return;
		}
		vces.put(vname, new HashMap<>());
	}

	public void removeVertex(String name) {
		if (vces.containsKey(name) == false) {
			return;
		}
		HashMap<String, Integer> nbr = vces.get(name);
		for (String s : nbr.keySet()) {
			removeEdge(name, s);
		}
		vces.remove(name);
	}

	public int countEdges() {
		int edge = 0;

		ArrayList<String> al = new ArrayList<>(vces.keySet());
		for (String s : al) {
			HashMap<String, Integer> nbr = vces.get(s);
			edge += nbr.size();
		}
		return edge / 2;
	}

	public void addEdge(String v1name, String v2name, int weight) {
		if (vces.containsKey(v1name) == false || vces.containsKey(v2name) == false) {
			return;
		}
		vces.get(v1name).put(v2name, weight);
		vces.get(v2name).put(v1name, weight);
	}

	public void removeEdge(String v1name, String v2name) {
		if (vces.containsKey(v1name) == false || vces.containsKey(v2name) == false) {
			return;
		}
		vces.get(v1name).remove(v2name);
		vces.get(v2name).remove(v1name);
	}

	public void display() {
		ArrayList<String> al = new ArrayList<>(vces.keySet());
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + "-->");
			HashMap<String, Integer> nbr = vces.get(al.get(i));
			System.out.println(nbr);
		}
	}

	public boolean hasPath(String src, String dest) {
		HashSet<String> visited = new HashSet<>();
		return hasPath(src, dest, visited);
	}

	private boolean hasPath(String src, String dest, HashSet<String> visited) {
		if (containsEdge(src, dest)) {
			return true;
		}
		visited.add(src);
		HashMap<String, Integer> nbr = vces.get(src);
		ArrayList<String> s = new ArrayList<>(nbr.keySet());
		for (String n : s) {
			if (visited.contains(n) == false) {
				boolean ans = hasPath(n, dest, visited);
				if (ans == true) {
					return true;
				}
			}
		}
		return false;
	}

	public void printAllPath(String src, String dest, HashSet<String> visited, String psf) {
		if (src.equals(dest)) {
			System.out.println(psf + dest);
			return;
		}
		visited.add(src);
		HashMap<String, Integer> nbr = vces.get(src);
		ArrayList<String> s = new ArrayList<>(nbr.keySet());
		for (String n : s) {
			if (visited.contains(n) == false) {
				printAllPath(n, dest, visited, psf + src + "-->");
			}
		}
		visited.remove(src);
	}

	static int min = Integer.MAX_VALUE;
	static String minpath = "";
	static int max = Integer.MIN_VALUE;
	static String maxpath = "";

	public void printminmaxPath(String src, String dest, HashSet<String> visited) {
		printminmaxPath(src, dest, visited, src + "-->", 0);
		System.out.println(minpath);
		System.out.println(maxpath);
	}

	private void printminmaxPath(String src, String dest, HashSet<String> visited, String psf, int wsf) {
		if (src.equals(dest)) {
			if (wsf < min) {
				min = wsf;
				minpath = psf;
			}
			if (wsf > max) {
				max = wsf;
				maxpath = psf;
			}
			return;
		}

		visited.add(src);
		HashMap<String, Integer> nbr = vces.get(src);
		ArrayList<String> s = new ArrayList<>(nbr.keySet());
		for (String n : s) {
			if (visited.contains(n) == false) {
				printminmaxPath(n, dest, visited, psf + n + "-->", wsf + vces.get(src).get(n));
			}
		}
		visited.remove(src);
	}

	static int jl = Integer.MAX_VALUE;

	public void justLarger(String src, String dest, HashSet<String> visited, int weight) {
		justLarger(src, dest, visited, 0, weight);
		System.out.println(jl);
	}

	private void justLarger(String src, String dest, HashSet<String> visited, int wsf, int weight) {
		if (src.equals(dest)) {
			if (wsf > weight && wsf < jl) {
				jl = wsf;
			}
			return;
		}
		visited.add(src);
		HashMap<String, Integer> nbr = vces.get(src);
		ArrayList<String> s = new ArrayList<>(nbr.keySet());
		for (String n : s) {
			if (visited.contains(n) == false) {
				justLarger(n, dest, visited, wsf + vces.get(src).get(n), weight);
			}
		}
		visited.remove(src);
	}

	static class Pair implements Comparable<Pair> {
		int weight;
		String s;

		public Pair(int weight, String s) {
			this.weight = weight;
			this.s = s;
		}

		@Override
		public int compareTo(Pair o) {
			return this.weight - o.weight;
		}
	}

	PriorityQueue<Pair> pq = new PriorityQueue<>();

	public void kthLargest(String src, String dest, HashSet<String> visited, int k) {
		kthLargest(src, dest, visited, "", 0, k);
		System.out.println(pq.peek().weight + " " + pq.peek().s);
	}

	private void kthLargest(String src, String dest, HashSet<String> visited, String psf, int wsf, int k) {
		if (pq.size() < k) {
			pq.add(new Pair(wsf, psf));
		} else {
			if (pq.peek().weight < wsf) {
				pq.remove();
				pq.add(new Pair(wsf, psf));
			}
			return;
		}
		visited.add(src);
		HashMap<String, Integer> nbr = vces.get(src);
		ArrayList<String> s = new ArrayList<>(nbr.keySet());
		for (String n : s) {
			if (visited.contains(n) == false) {
				kthLargest(n, dest, visited, psf + src + "-->", wsf + vces.get(src).get(n), k);
			}
		}
		visited.remove(src);
	}

	private class TPair {
		String vname;
		String psf;

		public TPair(String vname, String psf) {
			this.vname = vname;
			this.psf = psf;
		}
	}

	public boolean bfs(String src, String dest) {
		LinkedList<TPair> queue = new LinkedList<>();
		HashSet<String> visited = new HashSet<>();
		queue.addLast(new TPair(src, src));
		while (queue.size() != 0) {
			// remove
			TPair rem = queue.removeFirst();
			// check for dest
			if (rem.vname.equals(dest)) {
				System.out.println("found " + rem.psf);
				return true;
			}
			// markAndprint
			visited.add(rem.vname);
			System.out.println(rem.vname + "--> " + rem.psf);
			// add neighbours
			for (String nbr : vces.get(rem.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					queue.addLast(new TPair(nbr, rem.psf + nbr));
				}
			}
		}
		return false;
	}

	public boolean dfs(String src, String dest) {
		LinkedList<TPair> stack = new LinkedList<>();
		HashSet<String> visited = new HashSet<>();
		stack.addFirst(new TPair(src, src));
		while (stack.size() != 0) {
			// remove
			TPair rem = stack.removeFirst();
			// check for dest
			if (rem.vname.equals(dest)) {
				System.out.println("found " + rem.psf);
				return true;
			}
			// markAndprint
			visited.add(rem.vname);
			System.out.println(rem.vname + "--> " + rem.psf);
			// add neighbours
			for (String nbr : vces.get(rem.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					stack.addFirst(new TPair(nbr, rem.psf + nbr));
				}
			}
		}
		return false;
	}

	public void bft() {
		HashSet<String> visited = new HashSet<>();
		for (String s : vces.keySet()) {
			if (visited.contains(s) == false)
				bftComponent(s, visited);
		}
	}

	public void bftComponent(String src, HashSet<String> visited) {
		LinkedList<TPair> queue = new LinkedList<>();
		queue.addLast(new TPair(src, src));
		while (queue.size() != 0) {
			// remove
			TPair rem = queue.removeFirst();
			// markAndprint
			visited.add(rem.vname);
			System.out.println(rem.vname + "--> " + rem.psf);
			// add neighbours
			for (String nbr : vces.get(rem.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					queue.addLast(new TPair(nbr, rem.psf + nbr));
				}
			}
		}
	}

	public void dft() {
		HashSet<String> visited = new HashSet<>();
		for (String s : vces.keySet()) {
			if (visited.contains(s) == false)
				dftComponent(s, visited);
		}
	}

	public void dftComponent(String src, HashSet<String> visited) {
		LinkedList<TPair> stack = new LinkedList<>();
		stack.addFirst(new TPair(src, src));
		while (stack.size() != 0) {
			// remove
			TPair rem = stack.removeFirst();
			// markAndprint
			visited.add(rem.vname);
			System.out.println(rem.vname + "--> " + rem.psf);
			// add neighbours
			for (String nbr : vces.get(rem.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					stack.addFirst(new TPair(nbr, rem.psf + nbr));
				}
			}
		}
	}

	public boolean isConnected(String src) {
		LinkedList<TPair> queue = new LinkedList<>();
		HashSet<String> visited = new HashSet<>();
		queue.addLast(new TPair(src, src));
		while (queue.size() != 0) {
			// remove
			TPair rem = queue.removeFirst();
			// check for dest
			visited.add(rem.vname);
			// add neighbours
			for (String nbr : vces.get(rem.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					queue.addLast(new TPair(nbr, rem.psf + nbr));
				}
			}
		}
		if (visited.size() == vces.size()) {
			return true;
		} else {
			return false;
		}
	}

	public void getConnectedComponents() {
		HashSet<String> visited = new HashSet<>();
		ArrayList<ArrayList<String>> al = new ArrayList<>();
		for (String s : vces.keySet()) {
			if (visited.contains(s) == false) {
				ArrayList<String> b = getConnectedComponents(s, visited);
				al.add(b);
			}
		}
		System.out.println(al);
	}

	private ArrayList<String> getConnectedComponents(String src, HashSet<String> visited) {
		ArrayList<String> a = new ArrayList<>();
		LinkedList<TPair> queue = new LinkedList<>();
		queue.addLast(new TPair(src, src));
		while (queue.size() != 0) {
			// remove
			TPair rem = queue.removeFirst();
			// markAndprint
			if (visited.contains(rem.vname) == false) {
				a.add(rem.vname);
			}
			visited.add(rem.vname);

			// add neighbours
			for (String nbr : vces.get(rem.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					queue.addLast(new TPair(nbr, rem.psf + nbr));
				}
			}
		}
		return a;
	}

	public boolean isAcyclic() {
		HashSet<String> visited = new HashSet<>();
		boolean ans = false;
		for (String s : vces.keySet()) {
			if (visited.contains(s) == false)
				ans = ans || isAcyclic(s, visited);
		}
		return ans;
	}

	private boolean isAcyclic(String src, HashSet<String> visited) {
		LinkedList<TPair> queue = new LinkedList<>();
		queue.addLast(new TPair(src, src));
		while (queue.size() != 0) {
			// remove
			TPair rem = queue.removeFirst();
			// markAndprint
			if (visited.contains(rem.vname) == true) {
				return true;
			}
			visited.add(rem.vname);

			// add neighbours
			for (String nbr : vces.get(rem.vname).keySet()) {
				if (visited.contains(nbr) == false) {
					queue.addLast(new TPair(nbr, rem.psf + nbr));
				}
			}
		}
		return false;
	}

	private class CPair {
		String vname;
		String color;

		CPair(String vname, String color) {
			this.vname = vname;
			this.color = color;
		}
	}

	private boolean isBiPertite(String src, HashMap<String, String> hp) {
		LinkedList<CPair> queue = new LinkedList<>();
		queue.addLast(new CPair(src, "red"));
		hp.put(src, "red");
		while (queue.size() != 0) {
			// remove
			CPair rem = queue.removeFirst();
			// check
			if (hp.containsKey(rem.vname)) {
				// checkcolor
				if (!(rem.color.equals(hp.get(rem.vname)))) {
					return false;
				}
			}
			// addneigh
			for (String nbr : vces.get(rem.vname).keySet()) {
				if (hp.containsKey(nbr) == false) {
					queue.addLast(new CPair(nbr, rem.color.equals("red") ? "green" : "red"));
				}
			}
		}
		return true;
	}

	public boolean isBiPertite(String src) {
		HashMap<String, String> visited = new HashMap<>();

		boolean ans = false;
		for (String s : vces.keySet()) {
			if (visited.containsKey(s) == false)
				ans = ans || isBiPertite(src, visited);
		}
		return ans;

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
			return this.vname + this.psf + this.wsf;
		}
	}

	public void djkstra(String src) {
		HashMap<String, DPair> result = new HashMap<>();
		GenericHeap<DPair> queue = new GenericHeap<>();
		for (String s : vces.keySet()) {
			DPair n = new DPair(s, null, Integer.MAX_VALUE);

			if (s.equals(src)) {
				n.psf = src;
				n.vname = src;
				n.wsf = 0;
			}
			queue.add(n);
			result.put(s, n);
		}
		while (queue.size() != 0) {
			// remove
			DPair rp = queue.remove();
			// traverse neigh
			for (String nbr : vces.get(rp.vname).keySet()) {
				DPair np = result.get(nbr);
				int newWeight = rp.wsf + vces.get(rp.vname).get(nbr);
				String npsf = rp.psf + nbr;
				// update neigh
				if (newWeight < np.wsf) {
					np.wsf = newWeight;
					np.psf = npsf;
					queue.updateHeap(np);
				}
			}
		}
		System.out.println(result);
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

	public Graph Prims() {
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
			// add in mst
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
}
