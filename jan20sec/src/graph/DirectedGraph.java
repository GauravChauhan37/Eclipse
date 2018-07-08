package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class DirectedGraph extends Graph {
	public void removeVertex(String name) {
		if (vces.containsKey(name) == false) {
			return;
		}
		for (String s : vces.keySet()) {
			removeEdge(s, name);
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
		return edge;
	}

	public void addEdge(String v1name, String v2name, int weight) {
		if (vces.containsKey(v1name) == false || vces.containsKey(v2name) == false) {
			return;
		}
		vces.get(v1name).put(v2name, weight);
	}

	public void removeEdge(String v1name, String v2name) {
		if (vces.containsKey(v1name) == false || vces.containsKey(v2name) == false) {
			return;
		}
		vces.get(v1name).remove(v2name);
	}

	public static void topological(int[][] arr) {
		
	}
}
