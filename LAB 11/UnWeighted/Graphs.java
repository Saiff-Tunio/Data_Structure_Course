/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graphs;


/**
 *
 * @author Saiff
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Graphs {
    int [][]matrix;
    int n;

    public Graphs(int size) {       
        matrix=new int[size][size];
        n=matrix.length;
    }

    public void add_vertices(int row,int col) {
        matrix[row-1][col-1]=1;
    
    }
    
    public void shortPath(int start, int end) {
        int vertices = matrix.length;
        boolean[] visited = new boolean[vertices];
        int[] parent = new int[vertices];
        List<Integer> queue = new ArrayList<>();

        Arrays.fill(parent, -1);
        visited[start -1]=true;
        queue.add(start-1);

        while(!queue.isEmpty()){
            int current = queue.remove(0);
            if(current==end-1){
                printShortestPath(parent, start - 1, end - 1);
                return;
            }

            for(int i=0;i<vertices;i++){
                if(matrix[current][i]==1&&!visited[i]){
                    visited[i]=true;
                    parent[i] = current;
                    queue.add(i);
                }}}System.out.println("No path found.");
    }
    public void printShortestPath(int[] parent, int start, int end) {
       List<Integer> path = new ArrayList<>();
        int current=end;

        while(current!=-1){
            path.add(current+1);
            current=parent[current];
        }

        Collections.reverse(path);
        System.out.println("Shortest Path: " + path);
        System.out.println("Length: " + (path.size() - 1));
    }


    public void display() {
        System.out.println("Adjacency Matrix:");
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public void findAllPaths(int start,int end){
        boolean[] visited = new boolean[matrix.length];
        List<Integer> path = new ArrayList<>();
        System.out.println("All Paths from " + start + " to " + end + ":");
        findPathsUtil(start - 1, end - 1, visited, path);
    }

    private void findPathsUtil(int current,int end,boolean[] visited,List<Integer> path){
        visited[current]=true;
        path.add(current +1);

         if(current ==end){
            printPath(path);
        }else{
            
            for(int i=0;i<matrix.length;i++){
                if(matrix[current][i] ==1&&!visited[i]){
                    findPathsUtil(i, end, visited, path);
                }}}

        path.remove(path.size()-1);
        visited[current]=false;
    }

    private void printPath(List<Integer> path){
        System.out.print("Path: ");
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i));
            if(i<path.size() - 1){
                System.out.print(" -> ");
            }
        }
        System.out.println(" (Length: " + (path.size() - 1) + ")");
    }
    
    
   
    public void findConnectedComponents(){
        int vertices = matrix.length;
        boolean[] visited = new boolean[vertices];
        List<List<Integer>> components = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            if(!visited[i]){
                List<Integer> component = new ArrayList<>();
                dfs(i, visited, component);
                components.add(component);
            }}printComponents(components);
    }

      void dfs(int vertex,boolean[] visited,List<Integer> component) {
        visited[vertex] =true;
        component.add(vertex+1); 
        for(int i=0;i<matrix.length;i++){
            if(matrix[vertex][i]== 1 &&!visited[i]){
                dfs(i,visited,component);
            }} }


     void printComponents(List<List<Integer>> components) {
        System.out.println("Connected Components:");
        for(int i = 0;i<components.size();i++) {
            System.out.println("Component "+(i+1)+": "+components.get(i));
        } }
    
    public static void main(String[] args) {
        Graphs g = new Graphs(4);
        g.add_vertices(1,2);
        g.add_vertices(2,3);
        g.add_vertices(3,4);
        g.add_vertices(4,1);
        g.display();
        g.shortPath(1, 2);
        g.findAllPaths(1, 4);
        g.findConnectedComponents();
    }
}
