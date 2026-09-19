package DSA;
import java.util.*;

public class GraphAdjacencyList {
    static void addedge(ArrayList<ArrayList<Integer>> graph,int u,int v){
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static void bfs(ArrayList<ArrayList<Integer>> graph,int start){
        boolean[] visited = new boolean[graph.size()];
        visited[start]=true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while(!queue.isEmpty()){
            int current= queue.remove();
            System.out.println (current+" ");
            for(int neighbor:graph.get(current)){
                if(!visited[neighbor]){
                    visited[neighbor]=true;
                    queue.add(neighbor);
                }
            }

        }
    }
    static void dfs(ArrayList<ArrayList<Integer>> graph,int current, boolean [] visited){
        visited[current]=true;
        System.out.print(current+" ");
        for(int neighbor:graph.get(current)){
            if(!visited[neighbor]){
                dfs(graph,neighbor,visited);
            }
        }

    }

    public static void main (String[]args){
        int vertices =4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            graph.add(new ArrayList<>());
        }
        boolean[] visited = new boolean[graph.size()];

        addedge(graph,0,1);
        addedge(graph,0,2);
        addedge(graph,1,3);
        addedge(graph,2,3);
        System.out.println("Graph Adjacency List :" + graph);
        bfs(graph,0);
        dfs(graph,0,visited);
    }



}
