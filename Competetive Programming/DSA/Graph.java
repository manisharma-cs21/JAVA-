import java.util.ArrayList;
//import java.util.*;

public class Graph {                                         
    static class Edge
    {
        int src,des;
        Edge(int src,int des)
        {
            this.src=src;
            this.des=des;

        }
        public static void Imp(ArrayList<Edge> Graph[])
        {
            for(int i=0;i<Graph.length;i++)
            {
                Graph[i]=new ArrayList<Edge>();
            }
            Graph[0].add(new Edge(0,2));
            Graph[1].add(new Edge(1,2));
            Graph[1].add(new Edge(2,0));
            Graph[2].add(new Edge(0,2));
            Graph[2].add(new Edge(1,2));
            Graph[1].add(new Edge(1,2));
            Graph[1].add(new Edge(1,2));
            Graph[1].add(new Edge(1,2));



        }
    }
    public static void main(String[] args) {
       // int v=4;
      //  ArrayList<Edge> Graph[]=new ArrayList[v] ;
       // Imp(Graph);
    }
    
}
