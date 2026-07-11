package programming;
import java.util.*;
public class Intro {
    public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);

            int n = scn.nextInt(); // number of nodes
            int m = scn.nextInt(); // number of edges

            // adjacency list
            List<List<Integer>> graph = new ArrayList<>();

            // initialize empty list for each node
            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            // take edges input
            for (int i = 0; i < m; i++) {
                int u = scn.nextInt();
                int v = scn.nextInt();

                graph.get(u).add(v);
                graph.get(v).add(u); // undirected graph
            }

            int src = scn.nextInt(); // starting node for BFS

            BFS(graph, src);
        }

        public static void BFS(List<List<Integer>> graph, int src) {

            Queue<Integer> q = new LinkedList<>();
            boolean[] vis = new boolean[graph.size()];

            q.add(src);
            vis[src] = true;

            while (q.size() > 0) {

                int rem = q.remove();
                System.out.println(rem);

                List<Integer> nbrs = graph.get(rem);

                for (int nbr : nbrs) {
                    if (!vis[nbr]) {
                        q.add(nbr);
                        vis[nbr] = true;
                    }
                }
            }
        }
        }

