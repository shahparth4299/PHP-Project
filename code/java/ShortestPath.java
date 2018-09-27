import java.io.*;
import java.util.*;
class ShortestPath{
	public static int minValue(int a[],boolean b[]){
		int i,j,min = Integer.MAX_VALUE,minI = Integer.MAX_VALUE;
		for(i=0;i<a.length;i++){
			if(b[i] == false && a[i] < min){
				min = a[i];
				minI = i;
			}
		}
		System.out.println("MIN"+minI);
		return minI;
	}
	public static void findDistance(int graph[][],int source,int destination){
			int i,j=0;
			int distance[] = new int[graph.length];
			int path[] = new int[graph.length];
			boolean visited[] = new boolean[graph.length];
			for(i=0;i<graph.length;i++){
				distance[i] = Integer.MAX_VALUE;
				visited[i] = false;
			}
			for(i=0;i<graph.length;i++)
				path[i] = -1;
			distance[source] = 0;
			for (int count = 0; count < graph.length-1; count++){
            	int u = minValue(distance,visited);
 			 	visited[u] = true;
            	for (int v = 0; v < graph.length; v++){
 					if (!visited[v] && graph[u][v]!=0 && distance[u] != Integer.MAX_VALUE && distance[u]+graph[u][v] < distance[v]){
                    	distance[v] = distance[u] + graph[u][v];
                    	path[v] = u; 
 					}
        		}
			}
			System.out.println("Distance From Source : "+distance[destination]);
			System.out.println("Shortest Path From Source To Destination");
			printPath(path,destination);
	}
	public static void printPath(int path[],int dest){
		if(dest == -1)
			return;
		printPath(path,path[dest]);
		System.out.println(dest+" ");
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Nodes You want to enter?");
		int node = sc.nextInt();
		int graph[][] = new int[node][node];
		int i=0,j=0;
		for(i=0;i<node;i++){
			for(j=0;j<node;j++){
				graph[i][j] = sc.nextInt();
			}
		}
		System.out.println("--------Displaying Graph--------");
		for(i=0;i<node;i++){
			for(j=0;j<node;j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter the Source");
		int source = sc.nextInt();
		System.out.println("Enter the Destination");
		int destination = sc.nextInt();
		findDistance(graph,source,destination);
	}
}