package DataStructuresAlgorithms.Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DetectCycleInUndirectedGraph {
    public boolean detectCycle(ArrayList<ArrayList<Integer>> adjList) {
        int N = adjList.size();
        boolean[] vis = new boolean[N];

        for(int i = 0; i < N; i++){
            if(!vis[i]){
                if(dfs(adjList, i, vis, -1))
                    return true;
            }
        }
        return false;
    }

    public boolean dfs(ArrayList<ArrayList<Integer>> adjList, int v, boolean[] vis, int parent){
        vis[v] = true;
        for(int nbr: adjList.get(v)){
            if(!vis[nbr]){
                if(dfs(adjList, nbr, vis, v))
                    return true;
            } else if(nbr != parent){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        // Node 0
        adjList.add(new ArrayList<>(Arrays.asList(1, 3)));
        // Node 1
        adjList.add(new ArrayList<>(Arrays.asList(0, 2)));
        // Node 2
        adjList.add(new ArrayList<>(Arrays.asList(1, 3)));
        // Node 3
        adjList.add(new ArrayList<>(Arrays.asList(2, 0)));

        System.out.println(new DetectCycleInUndirectedGraph().detectCycle(adjList));
    }
}
