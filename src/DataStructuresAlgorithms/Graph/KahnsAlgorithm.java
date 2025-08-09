package DataStructuresAlgorithms.Graph;

import java.util.*;

public class KahnsAlgorithm {
    /**
     * Performs Kahn's Algorithm for topological sorting.
     * @param numNodes Number of nodes in the graph (nodes are labeled 0 to numNodes-1)
     * @param edges List of edges, where each edge is an int array of size 2: [from, to]
     * @return List of nodes in topological order, or empty list if a cycle exists
     */
    public static List<Integer> topologicalSort(int numNodes, List<int[]> edges) {
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int[numNodes];

        // Initialize an adjacency list
        for (int i = 0; i < numNodes; i++) {
            adj.add(new ArrayList<>());
        }

        // Build graph and compute in-degrees
        for (int[] edge : edges) {
            int from = edge[0], to = edge[1];
            adj.get(from).add(to);
            inDegree[to]++;
        }

        // Queue for nodes with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numNodes; i++) {
            if (inDegree[i] == 0) queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            for (int neighbor : adj.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) queue.offer(neighbor);
            }
        }

        // If not all nodes are processed, there is a cycle
        if (result.size() != numNodes) return new ArrayList<>();
        return result;
    }
}
