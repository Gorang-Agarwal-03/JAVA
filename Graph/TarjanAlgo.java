// **********************Bridge in graph****************************//

import java.util.ArrayList;

public class TarjanAlgo {
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
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[],int dt[],int ldt[],int time,int par){
        vis[curr] = true;

        dt[curr]=ldt[curr] = ++ time;
        // dt = Discovery time
        // ldt = lowest Discovery time

        for(int i =0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(e.dest == par){
                continue;
            }
            else if(!vis[e.dest]){
                dfs(graph, e.dest, vis, dt, ldt, time, curr);
                ldt[curr] = Math.min(ldt[curr], ldt[e.dest]);
                if(dt[curr] < ldt[e.dest]){
                    System.out.println("Bridge of graph is: " +curr + "---->"+ e.dest);

                }
            } 
            else{
                ldt[curr] = Math.min(ldt[curr], dt[e.dest]);
            }
            
        }

    }

    public static void getBridge(ArrayList<Edge> graph[],int V){
        int dt[] = new int[V];
        int ldt[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];

        for(int i=0;i<V;i++){
            if(!vis[i]){
                dfs(graph,i,vis,dt,ldt,time,-1);
            }
        }
    }


    public static void main(String[] args) {
        int V = 6;

        ArrayList<Edge> graph[] = new ArrayList[V]; 
         creatgraph(graph); 
         getBridge(graph, V);
         

    }     

}
