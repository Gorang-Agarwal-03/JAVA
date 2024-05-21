import java.util.ArrayList;


//*******************************THIS IS FOR UNDIRECTED GRAPH************************** 

public class CycleDetection02 {
    public static class Edge{
           int scr;
           int dest;
           
           public Edge(int s,int d){
            this.scr = s;
            this.dest = d;
        }
    }

    public static void creatgraph(ArrayList<Edge> graph[]){
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 4));
        
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(4, 4));
        
    }
    public static boolean iscycle(ArrayList<Edge> graph[],boolean vis[] , int curr , int par){
        vis[curr] = true;

        for(int i =0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(vis[e.dest] && e.dest !=par){
                return true;
            }

            else if(!vis[e.dest]){
                if(iscycle(graph, vis, e.dest, curr)){
                    return true;

                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V]; 
         creatgraph(graph); 
         System.out.println(iscycle(graph,new boolean[V], 0, -1));
         
        }
    
}


//  IF CYCLE FOUND THEN IT RETURN TRUE  ELSE FALSE  IF NOT FOUND