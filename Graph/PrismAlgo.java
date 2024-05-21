import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrismAlgo {
    static class Edge{
           int src;
           int dest;
           int wt;
           
           public Edge(int s,int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void creatgraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0, 1 ,10));
        graph[0].add(new Edge(0, 2,15));
        graph[0].add(new Edge(0, 3,30));
        
        graph[1].add(new Edge(1, 0,10));
        graph[1].add(new Edge(1,3, 40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2, 3,50));

        graph[3].add(new Edge(3, 1,40));
        graph[3].add(new Edge(3, 2,50));
        
    }

    public static class pair implements Comparable<pair>{
        int node;
        int cost;

        public pair(int n , int c){
            this.node = n;
            this.cost = c;
        }
        @Override
        public int compareTo(pair p2){
            return this.cost - p2.cost;
        }
    }

    public static void prism(ArrayList<Edge> graph[], int V){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[V]; 
        pq.add(new pair(0,0));
        int cost = 0;

        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;
                cost += curr.cost;

                for(int i = 0;i<graph[curr.node].size();i++){
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new pair(e.dest,e.wt));
                    }
                }
            }
        }
        System.out.println("Min cost of MST is:" +cost );


    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V]; 
         creatgraph(graph); 
         prism(graph, V);
         
        }
    }
