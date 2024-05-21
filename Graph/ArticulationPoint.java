import java.util.ArrayList;
//O(E+V)

public class ArticulationPoint {
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

        graph[4].add(new Edge(4, 3));
        
  }
  
  public static void dfs(ArrayList<Edge> graph[],int curr,int par, boolean vis[],int dt[],int ldt[],int time , boolean ap[]){
    vis[curr] = true;
     dt[curr] =  ldt[curr] = ++time;
     int children =0;

     for(int i=0;i<graph[curr].size();i++){
        Edge e = graph[curr].get(i);
        int neigh = e.dest;

        if(par == neigh){
            continue;
        }
        else if(vis[neigh]){
            ldt[curr] = Math.min(ldt[curr], dt[neigh]);
        }
        else{
            dfs(graph, neigh, curr, vis, dt, ldt, time, ap);
            ldt[curr] = Math.min(ldt[curr], ldt[neigh]);
            if(dt[curr]<=ldt[neigh] && par!= -1){
                ap[curr] = true;
            }
            children++;
        }
    }
    if(par== -1 && children>1){
        ap[curr] = true;
    }
  }

  public static void findAP(ArrayList<Edge> graph[],int V){
    int dt[] = new int[V];
    int ltd[] = new int[V];
    int time=0;
    boolean vis[] = new boolean[V];
    boolean ap[] = new boolean[V];
    
    for(int i =0;i<V;i++){
        if(!vis[i]){
            dfs(graph, 1, -1, vis, dt, dt, time, ap);;
        }
    }
    for(int i =0;i<V;i++){
        if(ap[i]){
            System.out.println("Ap: "+i );
        }
    }
  }
    public static void main(String[] args) {
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V]; 
         creatgraph(graph); 

         findAP(graph, V);
         }     
}



