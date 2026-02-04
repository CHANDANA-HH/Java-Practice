import java.util.*;

class Cycle{
    
    public static boolean hasCycle(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for(int i = 0; i < V; i++) {
            if(!visited[i] && dfs(i, -1, visited, adj))
                return true;
        }
        return false;
    }
    
    private static boolean dfs(int node, int parent, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        for(int neigh : adj.get(node)) {
            if(!visited[neigh]) {
                if(dfs(neigh, node, visited, adj))
                    return true;
            } else if(neigh != parent) {
                return true; // cycle found
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(1).add(2); adj.get(2).add(1);
        adj.get(2).add(3); adj.get(3).add(2);
        adj.get(3).add(1); adj.get(1).add(3); // forms a cycle

        System.out.println(hasCycle(V, adj)); // true
    }
}
