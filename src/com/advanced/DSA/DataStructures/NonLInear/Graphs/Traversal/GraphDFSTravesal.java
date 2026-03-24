package com.advanced.DSA.DataStructures.NonLInear.Graphs.Traversal;
import java.util.ArrayList;
import java.util.List;
class GraphDFS{
    private void dfs(int node, List<List<Integer>> adjlist,boolean[] visited,List<Integer> ans){
        visited[node]= true;
        ans.add(node);
        //traversal all the neighbour in the depth
        for (int neighbour : adjlist.get(node)){
            if (!visited[neighbour]){//if not visited do a dfs call
                dfs(neighbour, adjlist,visited,ans);
            }
        }
    }
    public List<Integer> dfsGraph(int V, List<List<Integer>> adjList){
        boolean[] visited= new boolean[V+1];//0-based index
        List<Integer> ans=new ArrayList<>();
        int start=1;//assume dfs start from node
        dfs(start,adjList,visited,ans);
        return ans;
    }

}
public class GraphDFSTravesal {
    public static void main(String[] args) {
        int V=5;
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0;i<=V;i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,4);
        addEdge(adjList,2,5);
        addEdge(adjList,4,5);
        GraphDFS obj=new GraphDFS();
        List<Integer>ans=obj.dfsGraph(V , adjList);
        printDfs(ans);


    }
    public static void addEdge( List<List<Integer>> adjlist, int u, int v){
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }
    public static void printDfs(List<Integer> ans){
        for (int num:ans){
            System.out.print(num +" ");
        }
        System.out.println();
    }
}
