import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//*********************************THIS IS FOR DIRECTED GRAPH************************************* 

public class CycleDetection01 {
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
        
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        
        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 0));
        
    }
    public static boolean isCycle(ArrayList<Edge> graph[],boolean vis[],int curr,boolean rec[] ){
        vis[curr] = true;
        rec[curr] = true;

        for(int i = 0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(rec[e.dest]){
                return true;
            }
            else if(!vis[e.dest]){
               if(isCycle(graph, vis, e.dest, rec)){
                return true;
                }
            }
        }
        rec[curr] = false;
        return false;

    }


        public static void main(String[] args) {
            int V = 4;

            ArrayList<Edge> graph[] = new ArrayList[V]; 
             creatgraph(graph); 
             boolean vis[] = new boolean[V];
             boolean rec[] = new boolean[V];
             for(int i = 0;i<V;i++){
                if(!vis[i]){
                  boolean isCycle =   isCycle(graph,vis, 0, rec);  
                  if(isCycle){
                    System.out.println(isCycle);
                    break;
                  }

                }
             }
             

            }
        }



    // IF CYCLE FOUND THEN IT RETURN TRUE  ELSE NOTHING  IF NOT FOUND