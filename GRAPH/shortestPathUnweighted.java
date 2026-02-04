import java.util.*;

class shortestPathUnweighted {

    public static int bfsShortestPath(int V, List<List<Integer>> adj, int src, int dest) {
        int[] dist = new int[V];
        Arrays.fill(dist, -1);
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        dist[src] = 0;

        while(!q.isEmpty()) {
            int u = q.poll();
            if(u == dest) return dist[u];
            for(int v : adj.get(u)) {
                if(dist[v] == -1) {
                    dist[v] = dist[u] + 1;
                    q.offer(v);
                }
            }
        }
        return -1; // not reachable
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        
        adj.get(0).add(1); adj.get(1).add(0);
        adj.get(0).add(2); adj.get(2).add(0);
        adj.get(1).add(3); adj.get(3).add(1);
        adj.get(2).add(3); adj.get(3).add(2);
        adj.get(3).add(4); adj.get(4).add(3);

        System.out.println(bfsShortestPath(V, adj, 0, 4)); // Output: 3
    }
}
