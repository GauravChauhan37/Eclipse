package GraphsRevise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import graph.GenericHeap;
import graph.Graph.PPair;

public class Graph {
	HashMap<String, HashMap<String, Integer>> vces = new HashMap<>();

	protected void addEdge(String vname, String v2name, int weight) {
		if (vces.containsKey(vname) == false ) {
			return;
		}
		vces.get(vname).put(v2name, weight);

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

	public void dfs(String src) {
		HashSet<String> visited = new HashSet<>();
		dfs(src, visited);
	}

	private void dfs(String src, HashSet<String> visited) {
		visited.add(src);
		LinkedList<String> stack = new LinkedList<>();
		stack.add(src);
		while (stack.size() != 0) {
			String rm = stack.removeFirst();
			visited.add(rm);
			for (String neigh : vces.get(rm).keySet()) {
				if (visited.contains(neigh) == false)
					stack.addFirst(neigh);
			}
		}
		// i am printing visited to check if it contains all the edges
		for (String edge : visited) {
			System.out.print(edge + " ");
		}
	}

	public void topologicalSort() {
		HashSet<String> visited = new HashSet<>();
		LinkedList<String> stack = new LinkedList<>();
		for (String s : vces.keySet()) {
			if (visited.contains(s) == false) {
				topologicalSort(s, stack, visited);
			}
		}
		while (stack.size() != 0) {
			System.out.print(stack.removeFirst() + " ");
		}
	}

	private void topologicalSort(String s, LinkedList<String> stack, HashSet<String> visited) {
		visited.add(s);
		for (String neigh : vces.get(s).keySet()) {
			if (visited.contains(neigh) == false) {
				visited.add(neigh);
			}
		}
		stack.addFirst(s);
	}

	static class Pair {
		String v;
		String color;

		public Pair(String v, String color) {
			this.v = v;
			this.color = color;
		}
	}

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
		g.addEdge("A", "C", 2);
		g.addEdge("C", "D", 1);
		g.addEdge("B", "D", 11);
		g.addEdge("B", "E", 3);
		g.addEdge("E", "F", 66);
		g.addEdge("E", "G", 7);
		g.addEdge("F", "G", 8);
//		g.dfs("A");
		g.topologicalSort();
	}
}