package com.yt.graph;

import java.util.ArrayList;

public class GraphAdjList {
	
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> adjList=new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < 5; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		
		//0<-->1,2,3
		addEdges(adjList, 0, 1);
		addEdges(adjList, 0, 2);
		addEdges(adjList, 0, 3);
		
		//1<-->4
		addEdges(adjList, 1, 4);
		//2<-->3
		addEdges(adjList, 2, 3);
		//3<--4>
		addEdges(adjList, 3, 4);
		
		displayAdjListGraph(adjList);
	}
	
	public static void addEdges(ArrayList<ArrayList<Integer>> adjList,int i,int j) {
		
		adjList.get(i).add(j);
		adjList.get(j).add(i);
		
	}
	
    static void displayAdjListGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\n Vertex" + i);
            System.out.print("Path from "+i+ " to ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+ adj.get(i).get(j));
            }
            System.out.println();
        }
    }
	

}
