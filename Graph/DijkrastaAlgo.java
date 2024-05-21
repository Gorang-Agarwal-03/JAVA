import java.util.*;

public class DijkrastaAlgo {
        static class Edge{
           int scr;
           int dest;
           int wt;
           
           public Edge(int s,int d , int w){
            this.scr = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void creatgraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0, 1 ,2));
        graph[0].add(new Edge(0, 2,4));
        
        graph[1].add(new Edge(1, 3 ,7));
        graph[1].add(new Edge(1, 2,1));

        graph[2].add(new Edge(2,4, 3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4, 3,2));
        graph[4].add(new Edge(4, 5,5));
        
    }
    public static class pair implements Comparable<pair>{
        int node;
        int dest;

        public pair(int n , int d){
            this.node = n;
            this.dest = d;
        }
        @Override
        public  int compareTo(pair p2){
            return this.dest - p2.dest;

        }

        
    }

    //O(E + E logV)
    public static void dijkrasta(ArrayList<Edge> graph[], int src, int V){
        PriorityQueue<pair> pq = new PriorityQueue<>();
        int dest[] = new int [V];
        boolean vis[] = new boolean [V];
        for(int i = 0; i<V ; i++){
            if(i !=src){
                dest[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new pair(0, 0));

        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vis[curr.node]){
                vis[curr.node] = true;

                for(int i = 0;i<graph[curr.node].size();i++){
                    Edge e = graph[curr.node].get(i);
                    int u =e.scr;
                    int v = e.dest;

                    if(dest[u] + e.wt < dest[v]){
                        dest[v] = dest[u]+e.wt;
                        pq.add(new pair (v,dest[v]));
                    }
                }
            }
        }
        for(int i = 0 ;i<V;i++){
            System.out.print(dest[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V]; 
         creatgraph(graph); 
         
         dijkrasta(graph, 0, V);
         
        }
    
}
