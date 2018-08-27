package FloydWarshall;

public class FloydWarshall {
	public void AllSourceALlPath(Integer[][] graph) {
		for (int inter = 0; inter < graph.length; inter++) {
			for (int src = 0; src < graph.length; src++) {
				for (int dest = 0; dest < graph[0].length; dest++) {
					if (src == inter || dest == inter) {
						// if src == null || dest == null, then it cannt act as intermediate
						continue;
					} else if (graph[src][inter] == null || graph[inter][dest] == null) {
						// if anyone is null then its value cant be used 
						continue;
					} else if (graph[src][dest] == null) {
						// if graph[src][dest] is null yet then anyvalue is nice enough to be filled
						graph[src][dest] = graph[src][inter] + graph[inter][dest];
					} else {
						// minimum of both should be filled in the place now
						graph[src][dest] = Math.min(graph[src][inter] + graph[inter][dest], graph[src][dest]);
					}
				}
			}
		}
	}
}
